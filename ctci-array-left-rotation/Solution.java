import java.util.*;

class Result {

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        int n = a.size();

        // to handle value of d when d > n
        d = d%n;

        // to handle negative value of d
        if (d < 0) {
            d = d+n;
        }

        reverse(a, 0, d-1); // reversing first subarray
        reverse(a, d, n-1); // reversing second subarray
        reverse(a, 0, n-1); // reversing complete array

        return a;
    }

    public static void reverse(List<Integer> arr, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            swap(arr, startIndex, endIndex);
            startIndex ++;
            endIndex --;
        }
    }

    public static void swap(List<Integer> arr, int firstIndex, int secondIndex) {
        int temp = arr.get(firstIndex);
        arr.set(firstIndex, arr.get(secondIndex));
        arr.set(secondIndex, temp);
    }

}

class TestCase {
    List<Integer> a;
    int d;
    List<Integer> sol;

    TestCase(List<Integer> a, int d, List<Integer> sol) {
        this.a = a;
        this.d = d;
        this.sol = sol;
    }
}

public class Solution {
    public static void main(String[] args) {

        List<TestCase> testCases = Arrays.asList(
            new TestCase(Arrays.asList(1, 2, 3, 4, 5), 4, Arrays.asList(5, 1, 2, 3, 4)),
            new TestCase(Arrays.asList(41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51), 10, Arrays.asList(77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77))
        );

        for (int i=0; i<testCases.size(); i++) {
            TestCase testCase = testCases.get(i);
            List<Integer> res = Result.rotLeft(testCase.a, testCase.d);
            System.out.println(String.format("Test %s %s", i+1, testCase.sol.equals(res) ? "PASSED" : "FAILED"));
        }
    }
}
