package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Spicy {
    public static void main(String args[]) {
        int[] scoville = {1, 2, 3, 9, 10, 12, 5, 4, 3, 2, 1, 1};
        int K = 7;
        int result = solution(scoville, K);
        System.out.println("RESULT : " + result);
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int aScoville : scoville) {
            heap.offer(aScoville);
        }
        while (heap.peek() <= K) {
            if (heap.size() == 1) {
                return -1;
            }
            System.out.println("queue : " + heap);
            int a = heap.poll();
            int b = heap.poll();
            System.out.println("a : " + a);
            System.out.println("b : " + b);
            int result = a + (b * 2);
            heap.offer(result);

            answer++;
        }
        return answer;
    }
}
