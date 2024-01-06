import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter weekly income: ");

        int weeklyIncome = scnr.nextInt();

        if (weeklyIncome < 500) {
            System.out.println("Tax withholding is " + (weeklyIncome * 0.10));
        }
        else if (weeklyIncome < 1500) {
            System.out.println("Tax withholding is " + (weeklyIncome * 0.15));
        }
        else if (weeklyIncome < 2500) {
            System.out.println("Tax withholding is " + (weeklyIncome * 0.20));
        }
        else {
            System.out.println("Tax withholding is " + (weeklyIncome * 0.30));
        }
    }
}
