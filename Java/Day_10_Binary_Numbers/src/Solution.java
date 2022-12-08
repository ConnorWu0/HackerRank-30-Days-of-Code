import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] groupings = Integer.toBinaryString(n).split("0");
        int max = 0;
        for (String s : groupings) {
            if (max < s.length()) {
                max = s.length();
            }
        }

        System.out.println(max);
        bufferedReader.close();
    }
}