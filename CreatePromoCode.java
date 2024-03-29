
/**
 * CreatePromoCode - Program that creates a random promo codes matching given rules 
 * 
 * @author (Manleen Mavi, Guryuvraj Singh) 
 * @version (30th June, 2021)
 */
// Standard import for the Scanner class
import java.util.*;
public class CreatePromoCode {
    public static void main (String [] args) {
        String cons = "BCDFGHJKLMNPQRSTVWXYZ";
        String vowels = "AEIOUY";

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("How many codes do you want to generate : ");
        int ans = in.nextInt();
        
        //Checking if the user entered a non-negative integer
        while (ans < 0) {
            System.out.println("Please enter a positive integer for generating promo codes or zero if you don't want to.");
            System.out.println("");
            System.out.print("How many codes do you want to generate : ");
            ans = in.nextInt();
        }

        for(int i =1; i<=ans;i++)
        {
            //Generating Consonent (Including Y) - Character 1
            int size1 = cons.length()-1;
            char c1 = cons.charAt(random.nextInt(size1));

            //Generating Vowel (Excluding Y) - Character 2
            int size2 = vowels.length()-1;
            char c2 = vowels.charAt(random.nextInt(size2));

            while(c2=='y')
            {
                c2 = vowels.charAt(random.nextInt(size2));
            }

            //Generating Consonent (Excluding Y) - Character 3
            char c3 = cons.charAt(random.nextInt(size1));

            while(c3=='y')
            {
                c3 = cons.charAt(random.nextInt(size1));
            }

            //Generating Vowel (Including Y) - Character 4
            char c4 = vowels.charAt(random.nextInt(size2));

            //Generating Check Digit - Character 5
            int value_c1 = (int)c1;
            int value_c2 = (int)c2;
            int value_c3 = (int)c3;
            int value_c4 = (int)c4;

            int formula = (int)(value_c1 + value_c3 + 2*value_c2 + 2*value_c4)%26 + 65;

            //Printing the final output
            char c5 = (char)formula;
            System.out.println("Promo Code is " + c1 +c2 + c3 + c4 + c5);
        }
    }
}
