import java.util.Arrays;
import java.util.List;

public class TestCase {
    private List<Integer> a;
    private int d;
    private List<Integer> sol;

    public TestCase(List<Integer> a, int d, List<Integer> sol) {
        this.a = a;
        this.d = d;
        this.sol = sol;
    }

    public List<Integer> getA() {
        return a;
    }

    public void setA(List<Integer> a) {
        this.a = a;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public List<Integer> getSol() {
        return sol;
    }

    public void setSol(List<Integer> sol) {
        this.sol = sol;
    }

    public static List<TestCase> testCases() {
        return Arrays.asList(
                new TestCase(Arrays.asList(1, 2, 3, 4, 5), 4, Arrays.asList(5, 1, 2, 3, 4)),
                new TestCase(Arrays.asList(41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51), 10, Arrays.asList(77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77))
        );
    }
}
