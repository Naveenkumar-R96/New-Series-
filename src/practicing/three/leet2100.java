package practicing.one;

import java.util.ArrayList;


public class leet2100 {
    public static void main(String[] args) {
        int[] security = {5, 3, 3, 3, 5, 6, 2};
        int time = 2;

        ArrayList<Integer> result = goodDaysToRobBank(security, time);
        System.out.println(result);
    }

    public static ArrayList<Integer> goodDaysToRobBank(int[] security, int time) {
        int n = security.length;
        ArrayList<Integer> result = new ArrayList<>();

        if (time == 0) {
            for (int i = 0; i < n; i++) {
                result.add(i);
            }
            return result;
        }

        int[] nonInc = new int[n];
        int[] nonDec = new int[n];

        // Count non-increasing days before or at i
        for (int i = 1; i < n; i++) {
            if (security[i] <= security[i - 1]) {
                nonInc[i] = nonInc[i - 1] + 1;
            } else {
                nonInc[i] = 0;
            }
        }

        // Count non-decreasing days after or at i
        for (int i = n - 2; i >= 0; i--) {
            if (security[i] <= security[i + 1]) {
                nonDec[i] = nonDec[i + 1] + 1;
            } else {
                nonDec[i] = 0;
            }
        }

        // Find good days
        for (int i = time; i < n - time; i++) {
            if (nonInc[i] >= time && nonDec[i] >= time) {
                result.add(i);
            }
        }

        return result;
    }
}
