import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int returnedDay = scanner.nextInt();
        int returnedMonth = scanner.nextInt();
        int returnedYear = scanner.nextInt();
        int dueDay = scanner.nextInt();
        int dueMonth = scanner.nextInt();
        int dueYear = scanner.nextInt();
        int fine;
        if (returnedYear == dueYear) {
            if (returnedMonth == dueMonth) {
                if (returnedDay - dueDay > 0) {
                    fine = 15 * (returnedDay - dueDay);
                } else {
                    fine = 0;
                }
            } else if (returnedMonth - dueMonth < 0) {
                fine = 0;
            } else {
                fine = 500 * (returnedMonth - dueMonth);
            }
        } else if (returnedYear < dueYear) {
            fine = 0;
        } else {
            fine = 10000;
        }
        System.out.println(fine);
        scanner.close();
    }
}
