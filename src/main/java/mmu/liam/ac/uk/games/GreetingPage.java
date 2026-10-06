package mmu.liam.ac.uk.games;

import java.util.Scanner;

public class GreetingPage implements IGame {

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);

        IO.println("Welcome to our programme.\nTo start enrolment we will need some details from you.");

        IO.println("Please enter your first name.");
        String name = scanner.nextLine();
        IO.println("Please enter your surname.");
        String surname = scanner.nextLine();
        IO.println("Please enter the name of your company.");
        String companyName = scanner.nextLine();
        IO.println(String.format("Please enter how many years you have worked at %s.", companyName));
        int yearsAtCompany = scanner.nextInt();
        scanner.nextLine();

        IO.println(String.format("Welcome, %s %s and congratulations on working at %s for %d year%s! You have now been enrolled into our programme!"
                , name, surname, companyName, yearsAtCompany, yearsAtCompany == 1 ? "" : "s"));
    }

    @Override
    public String getName() {
        return "Greeting Page";
    }
}
