package stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Truck {
    public static void main(String[] args) {
        int[] truck_weights = {7, 4, 5, 6};
        int result = solution(2, 10, truck_weights);
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        Queue<Integer> queue = new LinkedList<>();
/*        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(2);
        System.out.println(stack);
        System.out.println(stack.pop());*/

        for (int truck : truck_weights) {
            while (true) {
                if (queue.isEmpty()) {
                    queue.offer(truck);
                    answer++;
                    sum += truck;
                    break;
                } else if (queue.size() == bridge_length) {
                    sum -= queue.poll();
                } else {
                    if (sum + truck <= weight) {
                        queue.offer(truck);
                        answer++;
                        sum += truck;
                        break;
                    } else {
                        answer++;
                        queue.offer(0);
                    }
                }
            }
        }
        return answer + bridge_length;
    }
}
