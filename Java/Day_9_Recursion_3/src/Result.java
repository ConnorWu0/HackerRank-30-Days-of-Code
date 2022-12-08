public class Result {
    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
        // Write your code here

        if (n == 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }
}
