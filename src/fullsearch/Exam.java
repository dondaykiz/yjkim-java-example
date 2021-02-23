package fullsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exam {
    public static void main(String[] args) {
        int[] answers = {2, 1, 1, 1, 5};
        int[] result = solution(answers);
    }

    public static int[] solution(int[] answers) {
        int[] user1 = {1, 2, 3, 4, 5};
        int[] user2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] user3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (user1[i % 5] == answers[i]) score[0]++;
            if (user2[i % 8] == answers[i]) score[1]++;
            if (user3[i % 10] == answers[i]) score[2]++;
        }
        int MAX = Math.max(score[0], Math.max(score[1], score[2]));
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < score.length; i++) {
            if (score[i] == MAX) {
                list.add(i + 1);
            }
        }
        Collections.sort(list);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        System.out.println("RESULT > " + Arrays.toString(answer));
        return answer;
    }
}
