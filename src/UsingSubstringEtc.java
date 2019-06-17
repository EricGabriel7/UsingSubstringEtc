import java.util.Scanner;

public class UsingSubstringEtc {

    public static void main(String[] args){
        System.out.println("Please enter a word");

        Scanner keyboard = new Scanner(System.in);

        String word = keyboard.next();
        System.out.println("Please enter a character number index");
        int charNumIndex = keyboard.nextInt();

        System.out.println("The length of " + word + " is " + word.length());
        if (charNumIndex > word.length()) {
            System.out.println("That character number index exceeds " + word + "'s length");

        }
        else {System.out.println(word.charAt(charNumIndex) + " is at character number index" + charNumIndex);}




    }
}
