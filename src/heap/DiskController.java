package heap;

public class DiskController {
    public static void main(String[] args) {
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        int result = solution(jobs);
    }

    public static int solution(int[][] jobs) {
        for(int[] row : jobs) {

            System.out.println("SIZE > " + row[0] + row[1]);
        }
        int answer = 0;
        return answer;
    }
}
