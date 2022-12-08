import java.util.Scanner;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}
class Student extends Person{
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */

    // Write your constructor here
    Student(String firstName, String lastName, int idNumber, int[] testScores) {
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }
    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public char calculate() {
        int sum = 0;
        for (int i = 0 ; i < testScores.length; i++) {
            sum += testScores[i];
        }
        int average = sum / testScores.length;
        char grade;
        if (90 <= average && average <= 100) {
            grade = 'O';
        } else if (80 <= average && average <= 90) {
            grade = 'E';
        } else if (70 <= average && average <= 80) {
            grade = 'A';
        } else if (55 <= average && average <= 70) {
            grade = 'P';
        } else if (40 <= average && average <= 55) {
            grade = 'D';
        } else {
            grade = 'T';
        }
        return grade;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}
