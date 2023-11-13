package Arrays;

import java.util.Scanner;

public class gasStation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] gas = new int[n];
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            gas[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            cost[i] = input.nextInt();
        }
//        int result = canCompleteCircuit(gas, cost);
        int result = getStartIndex(gas, cost);
        System.out.println(result);
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalDiff = 0, tempFuel = 0;
        int idx = 0; int n = gas.length;
        for (int i = 0; i < n; i++) {
            int diff = gas[i] - cost[i];
            totalDiff += diff;
            tempFuel += diff;
            if (tempFuel < 0){ // skip those index which can't init the loop
                tempFuel = 0;
                idx = i + 1;
            }
        }
        if (totalDiff < 0){ // sum(gas) < sum(cost)
            idx = -1;
        }
        return idx;
    }

    public static int getStartIndex(int[] gas, int[] cost) {
        int gasSum = 0, costSum = 0, diffSum = 0;
        int index = 0; int n = gas.length;
        // checking for the edge case here
        for (int i = 0; i < n; i++) {
            gasSum += gas[i];
            costSum += cost[i];
        }
        if (gasSum <  costSum) return -1;
        // checking for the general cases here
        for (int i = 0; i < n; i++) {
            diffSum += gas[i] - cost[i];
            if (diffSum < 0){
                diffSum = 0;
                index = i+1;
            }
        }
        return index;
    }
}
