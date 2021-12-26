import java.util.List;

public class Result {

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