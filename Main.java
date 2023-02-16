import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print out your favorite Sentence reversed!: ");
        String r = sc.nextLine();
        // prints the lenght of the inputted array.
        System.out.println(r.length());
        // prints the reversed String by calling the reverse function.
        System.out.println(reverse(r));
    }
    public static String reverse (String s)
    {
        // array to store the letters reversed.
        char[] letters = new char[s.length()];
        int letterIndex = 0;
        // for loop e.g: letterIndex[0] = last letter of the String and so on.
        for(int i = s.length()-1; i>=0 ; i--)
        {
          letters[letterIndex] = s.charAt(i);
          letterIndex++;
        }
        // to print the reversed string, we create a String reverse, then add to it the letters
        // by using a for loop going through the array letters, letters[0]
        String reverse = "";
        for(int i = 0; i<s.length(); i++)
        {
            reverse = reverse + letters[i];
        }
        return reverse;
    }
}