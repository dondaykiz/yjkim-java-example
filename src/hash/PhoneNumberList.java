package hash;

import java.util.Arrays;

public class PhoneNumberList {
    public static void main(String[] args) {
        String[] phoneBook = {"119", "97674223", "1195524421"};
        Boolean result = solution(phoneBook);
        System.out.println("RESULT : " + result);
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        for (int i = 0; i < phone_book.length ; i++) {
            for (int j = 0; j < phone_book.length; j++) {
                if(i == j) continue;
                if (phone_book[j].indexOf(phone_book[i]) == 0) {
                    System.out.println("RESULT : " + phone_book[j]);
                    System.out.println("RESULT2 : " + phone_book[i]);
                    return false;
                }
            }
        }
        return answer;
    }
}
