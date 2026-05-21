    import java.util.*;
public class quiz1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        // Question 1
        System.out.println("Q1. What is Java?");
        System.out.println("a) Language");
        System.out.println("b) Browser");

        String ans1 = sc.nextLine();

        if(ans1.equals("a")) {
            System.out.println("Correct");
            score++;
        } else {
            System.out.println("Wrong");
        }

        // Question 2
        System.out.println("\nQ2. Inheritance keyword?");
        System.out.println("a) import");
        System.out.println("b) extends");

        String ans2 = sc.nextLine();

        if(ans2.equals("b")) {
            System.out.println("Correct");
            score++;
        } else {
            System.out.println("Wrong");
        }

        // Final Score
        System.out.println("\nFinal Score = " + score);

        sc.close();
    }
}
    

