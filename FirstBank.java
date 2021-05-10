package bankaccount.bankaccount;
import java.util.Scanner;
/**
 *
 * @author Tyler Ryden
 */
public class FirstBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Account Tyler = new Account("Tyler Rydeb", "A00001");
		
		
	Account Jess = new Account("Jess Huang", "B00002");
	Jess.showMenu();
    }

}
