import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((i + 2) < 6 && (j + 2) < 6) {
                    sum =
                            arr.get(i).get(j) + arr.get(i).get( j + 1) +
                                    arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1)
                                    + arr.get(i + 2).get(j)  + arr.get(i + 2).get(j + 1)
                                    + arr.get(i + 2).get(j + 2);
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);


        bufferedReader.close();
    }
}
