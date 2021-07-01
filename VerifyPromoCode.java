
/**
 * VerifyPromoCode - Program that reads a promo code and determines if it is valid.
 * 
 * @author (Manleen Mavi, Guryuvraj Singh) 
 * @version (30th June, 2021)
 */
// Standard import for the Scanner class
import java.util.*;
public class VerifyPromoCode {
    public static void main (String [] args) {
        
        
        //Input From User
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the promo code to verify: ");
        String user_input = in.nextLine().toUpperCase();

        // Checking the correct code
        for (int i = 0; i < user_input.length(); ) {

            //Checking if the user enter five characters
            if(user_input.length()!=5) {
                System.out.println("Promo code must have exact 5 Characters !");
                System.out.println();
                System.out.print("Enter the promo code to verify: ");
                user_input = (in.next());
                i=0;
                continue;
            }

            //Checking all are alphabets  
            char alphabet = user_input.charAt(i);
            boolean alphabetOrNot = Character.isLetter(alphabet);

            //Re-enter if does not contain alphabets and starts the loop from beginning
            if (!alphabetOrNot) {
                System.out.println("Promo Code must contain only alphabets !");
                System.out.println();
                System.out.print("Enter the promo code to verify: ");
                user_input = (in.next());
                i=0;
                continue;
            }
            else {
                i++;
            }

            //Verify check digit only if the length of input is 5 and conatins only alphabets
            if (user_input.length()==5 && alphabetOrNot && i==user_input.length()) {
                String ans = user_input.toUpperCase();

                int c1 = (int)ans.charAt(0);
                int c2 = (int)ans.charAt(1);
                int c3 = (int)ans.charAt(2);
                int c4 = (int)ans.charAt(3);
                int c5 = (int)ans.charAt(4);

                int formula = (int)(c1 + c3 + 2*c2 + 2*c4)%26 + 65;

                //Checking the check digit
                if (c5!=formula) {
                    System.out.println("Invalid promo code, check digit should have been " + (char)formula);
                } 
                else {
                    System.out.print("This is a valid promo code");
                }
            }
        }
    }
}