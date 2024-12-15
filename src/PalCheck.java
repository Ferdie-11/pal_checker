import java.util.Scanner;
import java.util.Stack;

public class PalCheck {

    public static void main(String[] args) {
        // TODO code application logic here
        String word = "";
        String palindrome = "";
        Scanner scan = new Scanner(System.in);
        Stack<Character> myStack = new Stack<>();

        System.out.print("Enter a word to check if it is a palindrome: ");
        word = scan.nextLine();
        System.out.println("Entered word: " + word);
        for (int i = 0; i < word.length(); i++) {
            myStack.push(word.charAt(i));
        }
        while (!myStack.isEmpty()) {
            palindrome += myStack.pop();
        }
        System.out.print("Reverse: " + palindrome + "\n");

        if (word.equals(palindrome)) {
            System.out.println("This is a palindrome.");
        } else {
            System.out.println("This is NOT a palindrome.");
        }
    }
}



