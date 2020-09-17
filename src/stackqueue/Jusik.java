package stackqueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Jusik {
    public static void main(String args[]) throws Exception {
        int[] prices = {1, 2, 3, 2, 3};
        int[] answer = {};
        answer = new int[prices.length];

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int price : prices) {
            arrayList.add(price);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            int cnt = 0;
            for (int j = i + 1; j < arrayList.size(); j++) {
                if(arrayList.get(i) <= arrayList.get(j)) {
                    ++cnt;
                } else {
                    ++cnt;
                    break;
                }
            }
            answer[i] = cnt;
            System.out.println(answer[i]);
        }
    }
}
