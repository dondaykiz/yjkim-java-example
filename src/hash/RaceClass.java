package hash;

import java.util.*;

public class RaceClass {
    public static String raceArraysSolution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return "EQUAL";
    }

    public static String raceHashSolution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap();
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
            System.out.println("PLAYER : " + map.get(player));
        }
        for (String player : completion) map.put(player, map.get(player) - 1);

/*        for (String player : participant) {
            if(map.get(player) != 0) {
                return player;
            }
        }*/

        for(String key : map.keySet()) {
            if(map.get(key) != 0) {
                return key;
            }
        }
        return null;
    }

    public static void main(String arg[]) {
        String[] participant = {"aaa", "bbb", "ccc"};
        String[] completion = {"aaa", "bbb"};
        String result = raceArraysSolution(participant, completion);
        System.out.println("RESULT >>> " + result);
    }
}
