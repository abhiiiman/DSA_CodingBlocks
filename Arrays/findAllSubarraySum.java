package Arrays;

public class findAllSubarraySum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        for (int s = 0; s < arr.length; s++) {
            int sum = 0;
            for (int e : arr) {
                sum += e;
                System.out.println(sum);
            }
        }
    }
}
