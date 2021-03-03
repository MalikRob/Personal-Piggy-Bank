import java.util.Scanner;

/**
 * @author malik
 *
 * This program will allow the user to set the name for, and total amount of
 * money inside, and the kind of currency inside their piggy bank. Then they
 * will be able to add or substract from that ammount using the methods inside
 * the PiggyBank class.
 *
 * @version 1.0
 * @since 03/03/2021
 */
public class Main {

    /**
     *
     * @param args Necessary for most basic functions in main.
     *
     * This function houses the instance(s) of PiggyBank and to prompt the user to enter the required data. Ask the user
     * if they want to add funds to their total and then ask if they wish to take money out. Then display myBnak's name
     * currency type, and total funds.
     */
    public static void main(String[] args) {

        //Variables to hold class instance values.
        double total;
        String currency;
        String name;

        //Variables to hold the amount the user can add, or take from, total funds, respectively.
        double addAmount;
        double subAmount;

        //Prompts the user to enter the relevant information and assigns inputted values to the beginning variables.
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your piggy bank's name: ");
        name = myObj.nextLine();
        System.out.println("Enter your piggy bank's total funds: ");
        total = myObj.nextDouble(); //19.08
        System.out.println("Enter your what your nations' currency is called: ");
        currency = myObj.next();
        System.out.println("\n");

        //Creates the PiggyBank instance called "myBank".
        PiggyBank myBank = new PiggyBank(total, currency, name);

        /*
        While loop that holds the prompt asking the user if they want to add funds that keeps going until the [test]
        variable goes from "false" to "true" in one of the valid if-statement endings.
         */
        boolean test = false;
        while(test == false) {
            System.out.println("Would you like to add money to your total funds?");
            String answerYN = myObj.next();

            if(answerYN.equals("Yes")) {
                System.out.println("Great! By how much?");
                addAmount = myObj.nextInt();
                myBank.addFunds(addAmount);
                test = true;
                System.out.println("\n");
            } else if (answerYN.equals("No")) {
                System.out.println("That's okay!");
                test = true;
                System.out.println("\n");
            } else {
                System.out.println("Answer given is invalid. Please try again. \n");
            }
        }

        /*
        While loop that holds the prompt asking the user if they want to take funds out, that keeps going until the
        [test] variable goes from "false" to "true" in one of the valid if-statement endings.
         */
        boolean testA = false;
        while(testA == false) {
            System.out.println("Would you like to take money out from your total funds?");
            String answerYN = myObj.next();

            if(answerYN.equals("Yes")) {
                System.out.println("Great! How much?");
                subAmount = myObj.nextInt();
                myBank.subFunds(subAmount);
                testA = true;
                System.out.println("\n");
            } else if (answerYN.equals("No")) {
                System.out.println("That's okay!");
                testA = true;
                System.out.println("\n");
            } else {
                System.out.println("Answer given is invalid. Please try again. \n");
            }
        }

        /*
        double resultC = myBank.totalSum;
        String resultB = myBank.currency;
        String resultA = myBank.name;

         */

        System.out.println("\n");

        //Displays all variables of the myBank instance.
        System.out.println("Your piggy bank's name is: " + myBank.name);
        System.out.println("Your are using " + myBank.currency + " currency.");
        System.out.println("Your total funds are: " + myBank.totalSum);
    }

}