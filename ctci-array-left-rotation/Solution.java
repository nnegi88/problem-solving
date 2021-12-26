import java.util.*;

public class Solution {
    public static void main(String[] args) {

        List<TestCase> testCases = TestCase.testCases();

        for (int i = 0; i< testCases.size(); i++) {
            TestCase testCase = testCases.get(i);
            List<Integer> res = Result.rotLeft(testCase.getA(), testCase.getD());
            System.out.printf("Test %s %s%n", i+1, testCase.getSol().equals(res) ? "PASSED" : "FAILED");
        }
    }
}
