import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] _elements) {
        this.elements = _elements;
    }
    public int computeDifference() {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int difference =  elements[i] - elements[j];
                if (difference < 0) {
                    difference *= -1;
                }
                if (difference > maximumDifference) {
                    maximumDifference = difference;
                }
            }
        }
        return maximumDifference;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
