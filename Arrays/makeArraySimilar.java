package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class makeArraySimilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arrayNum = new int[n];
        int[] arrayTarget = new int[n];
        for (int i = 0; i < n; i++) {
            arrayNum[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arrayTarget[i] = input.nextInt();
        }
        long result = countMoves(arrayNum, arrayTarget);
        System.out.println(result);
    }

    public static long countMoves(int[] nums, int[] target) {
        Arrays.sort(nums);
        Arrays.sort(target);
        long totalMoves;
//        creating arraylists here
        ArrayList<Integer> oddNums = new ArrayList<>(nums.length);
        ArrayList<Integer> oddTarget = new ArrayList<>(nums.length);
        ArrayList<Integer> evenNums = new ArrayList<>(nums.length);
        ArrayList<Integer> evenTarget = new ArrayList<>(nums.length);
//        separating the odd and even elements here.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                evenNums.add(nums[i]);
            }
            else{
                oddNums.add(nums[i]);
            }
            if (target[i] % 2 == 0){
                evenTarget.add(target[i]);
            }
            else{
                oddTarget.add(target[i]);
            }
        }
//        init the vars here
        long positiveCount = 0;
        long negativeCount = 0;
//        counting the moves here for the even numbers
        for (int i = 0; i < evenNums.size(); i++) {
            if (evenNums.get(i) < evenTarget.get(i)){
                positiveCount += (evenTarget.get(i) - evenNums.get(i))/2;
            } else if (evenNums.get(i) > evenTarget.get(i)) {
                negativeCount += (evenNums.get(i) - evenTarget.get(i))/2;
            }
        }
//        counting the moves here for the odd numbers
        for (int i = 0; i < oddNums.size(); i++) {
            if (oddNums.get(i) < oddTarget.get(i)){
                positiveCount += (oddTarget.get(i) - oddNums.get(i))/2;
            } else if (oddNums.get(i) > oddTarget.get(i)) {
                negativeCount += (oddNums.get(i) - oddTarget.get(i))/2;
            }
        }
//        returning the total moves here
        totalMoves = (positiveCount + negativeCount)/2;
        return totalMoves;
    }
}
