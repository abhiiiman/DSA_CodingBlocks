package DP;

import java.util.HashMap;
import java.util.Scanner;

public class ExchangeCoins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int coin = input.nextInt();
        long maxGold = exchangeGold(coin, new HashMap<>());
        System.out.println(maxGold);
    }

    private static long exchangeGold(int coin, HashMap<Integer, Long> HM) {
        if (coin == 0) return 0;
        if (HM.containsKey(coin)) return HM.get(coin);
        long sp1 = exchangeGold(coin / 2, HM);
        long sp2 = exchangeGold(coin / 3, HM);
        long sp3 = exchangeGold(coin / 4, HM);
        HM.put(coin, Math.max(sp1 + sp2 + sp3, coin));
        return HM.get(coin);
    }
}
