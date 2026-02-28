import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] words = line.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        int count = 0;
        int size = map.size();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue());
            count++;
            if (count < size) {
                System.out.println();
            }
        }

        sc.close();
    }
}
//g