package Arrays;

public class sortZeroOne {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 0, 1};
        int i = 0;
        int j = arr.length-1;
        while (i < j){
            int currentLeftElement = arr[i];
            int currentRightElement = arr[j];
            if (currentLeftElement == 0){
                i++;
            }
            if (currentRightElement == 1){
                j--;
            }
            if (currentLeftElement == 1 && currentRightElement == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j++;
            }
        }
        PrintArray.print(arr);
    }
}
