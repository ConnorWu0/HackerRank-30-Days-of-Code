import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        ArrayList<String> list = new ArrayList<>();
        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];

                String myEmailIDRegExString = "[a-z]+@gmail.com";
                Pattern myEmailIDPattern = Pattern.compile(myEmailIDRegExString);
                Matcher myEmailIDMatcher = myEmailIDPattern.matcher(emailID);

                if (myEmailIDMatcher.find()) {
                    list.add(firstName);
                }

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        list.stream().sorted().forEach(System.out::println);
        bufferedReader.close();
    }
}
