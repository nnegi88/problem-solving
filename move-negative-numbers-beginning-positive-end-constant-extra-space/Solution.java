import java.util.*;

class TestCase {
    int[] input;
    int[] output;

    TestCase(int[] input, int[] output) {
        this.input = input;
        this.output = output;
    }
}

public class Solution {

    public static int[] solve(int[] arr) {
        int j = arr.length-1;
        for (int i=arr.length-1; i>=0; i--) {
            if (arr[i] > 0) {
                swap(arr, i, j);
                j--;
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int firstNumIndex, int secondNumIndex) {
        arr[firstNumIndex] = arr[firstNumIndex] - arr[secondNumIndex];
        arr[secondNumIndex] = arr[firstNumIndex] + arr[secondNumIndex];
        arr[firstNumIndex] = arr[secondNumIndex] - arr[firstNumIndex];
    }
    public static void main(String[] args) {

        List<TestCase> testCases = Arrays.asList(
            new TestCase(new int[]{-12, 11, -13, -5, 6, -7, 5, -3, -6}, new int[]{-12, -13, -5, -7, -3, -6, 11, 6, 5})
        );

        for (int i=0; i<testCases.size(); i++) {
            TestCase testCase = testCases.get(i);
            int[] res = solve(testCase.input);
            // System.out.println(Arrays.toString(res));
            System.out.println(String.format("Test %s %s", i+1, Arrays.equals(res, testCase.output) ? "PASSED" : "FAILED"));
        }
    }
}
