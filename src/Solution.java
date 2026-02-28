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

        StringBuilder sb = new StringBuilder();

        int count = 0;
        int size = map.size();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey())
              .append(": ")
              .append(entry.getValue());
            
            count++;
            if (count < size) {
                sb.append("\n");
            }
        }

        System.out.print(sb.toString());

        sc.close();
    }
}