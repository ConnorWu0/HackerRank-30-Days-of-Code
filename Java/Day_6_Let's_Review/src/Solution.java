import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        while (T > 0) {
            StringBuilder evenIndicesString = new StringBuilder();
            StringBuilder oddIndicesString = new StringBuilder();
            String S = scanner.nextLine();
            char[] array = S.toCharArray();
            for (int i = 0; i < S.length(); i++) {
                if (i % 2 == 0) {
                    evenIndicesString.append(array[i]);
                } else {
                    oddIndicesString.append(array[i]);
                }
            }
            System.out.println(evenIndicesString + " " + oddIndicesString);
            T--;
        }
        scanner.close();
    }
}