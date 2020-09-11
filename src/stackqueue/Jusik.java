package stackqueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Jusik {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        String prices = br.readLine();
        String[] formatPrices = prices.split(",");
        for (String formatPrice : formatPrices) {
            System.out.println("RESULT >>> " + formatPrice);
        }
    }

    public void solution() {

    }
}
