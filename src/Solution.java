import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int[] frequentChar = new int[255];
        for (int i = 0; i < string.length(); i++) {
            frequentChar[(int) string.charAt(i)] += 1;
        }
        /* O(string.length()) */

        int max=0;
        for (int i = 0; i < 255; i++) {
            if(frequentChar[i]>max) max=frequentChar[i];
        }
        /* O(255) */
        System.out.println(max);
    }
}
