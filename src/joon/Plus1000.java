package joon;

import java.util.Scanner;

/**
 * @author
 */
public class Plus1000 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a < 0 || b > 10) {
            a = sc.nextInt();
            b = sc.nextInt();
        }
        System.out.print(a + b);
    }
}
