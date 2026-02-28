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

        int count = 0;
        int size = map.size();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue());
            count++;
            if (count < size) {
                System.out.print("\n");
            }
        }

        sc.close();
    }
}