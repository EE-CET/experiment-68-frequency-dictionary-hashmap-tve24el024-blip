import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();

        String[] words = line.split("\\s+");
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        boolean first = true;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (!first) {
                System.out.print("\n");
            }
            System.out.print(entry.getKey() + ": " + entry.getValue());
            first = false;
        }

        sc.close();
    }
}