/**
 * Contains, sets, and gets all basic date information.
 *
 * @author malik
 * @version 1.0
 * @since 03/03/2021
 */
public class PiggyBank {

    //All needed, private variables.
    double totalSum;
    String currency;
    String name;

    /**
     * This method is the Constructor, giving an instance of MyDate data that is
     * entered in the parameter area.
     * @param totalSum For the total funds inside the piggy bank.
     * @param currency For the type of currency.
     * @param name For the name of the piggy bank;
     */
    public PiggyBank(double totalSum, String currency, String name) {
        this.totalSum = totalSum;
        this.currency = currency;
        this.name = name;
    }

    /**
     * This method adds [funds] to the totalSum variable.
     *
     * @param funds For the amount the user wants to add.
     * @return The value of totalSum plus funds variable.
     */
    public double addFunds(double funds) {
        totalSum = totalSum + funds;
        return totalSum;
    }

    /**
     * This method subtracts [funds] to the totalSum variable.
     *
     * @param funds For the amount the user wants to subtract.
     * @return The value of totalSum minus funds variable.
     */
    public double subFunds(double funds) {
        totalSum = totalSum - funds;
        return totalSum;
    }
}
