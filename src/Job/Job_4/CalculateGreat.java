package Job.Job_4;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculateGreat {
    public static void main(String[] args) {
        System.out.println(
                "You need to enter Subject\tTotal Grade\tCredits\tCredit Points one by one.");
        int subjectCounter = 1;
        ArrayList<Float> yourGreatPointOnSubject = new ArrayList<Float>();
        ArrayList<Float> creditsOnSubjects = new ArrayList<Float>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // get input of data
            System.out.println("Subject number : " + subjectCounter);
            System.out.print("\n\tYour Grade Point : ");
            yourGreatPointOnSubject.add(scanner.nextFloat());
            System.out.print("\n\tCredits of subject : ");
            creditsOnSubjects.add(scanner.nextFloat());
            System.out
                    .print(
                            "Will add more subject? enter 'Y' for yes or 'N' for break. Defult is 'Y'\nYour Answer : ");
            scanner.nextLine();
            String cmd = scanner.nextLine();
            if (cmd.equals("N") || cmd.equals("NO") || cmd.equals("No") || cmd.equals("no") || cmd.equals("n"))
                break;
            subjectCounter++;
        }
        // calculate credits
        float your_total_credits = 0;
        float most_credits = 0;
        for (int i = 0; i < yourGreatPointOnSubject.size(); i++) {
            float great = yourGreatPointOnSubject.get(i);
            float credit = creditsOnSubjects.get(i);
            your_total_credits += great * credit;
            most_credits += credit;
        }
        float CGPA = your_total_credits / most_credits;
        System.out.println("Your CGPA-4 is : " + CGPA);
        scanner.close();
    }
}