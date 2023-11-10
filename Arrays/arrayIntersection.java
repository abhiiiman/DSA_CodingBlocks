package Arrays;

import java.util.*;
public class arrayIntersection {
    public static void main(String args[]) {

        // Boiler plate code
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = input.nextInt();
        }
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = input.nextInt();
        }

        // main code
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> intersectArray = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < arr1.length && p2 < arr2.length){
            if (arr1[p1] == arr2[p2]){
                intersectArray.add(arr1[p1]);
                p1++;
                p2++;
            }
            else if (arr1[p1] < arr2[p2]){
                p1++;
            }
            else{
                p2++;
            }
        }
        System.out.println(intersectArray);
    }
}
