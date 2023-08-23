package org.launchcode;
import java.util.*;

public class Alice {
    public static void main (String[] args) {

        String wonderland = "Alice was beginning to get very tired" +
                " of sitting by her sister on the bank, and of having" +
                " nothing to do: once or twice she had peeped into the" +
                " book her sister was reading, but it had no pictures" +
                " or conversations in it, ‘and what is the use of a book,’" +
                " thought Alice ‘without pictures or conversation?’";

        Scanner input = new Scanner(System.in);
        System.out.println("Search for 'book her sister' to see if it's in this quote: ");
        String searchTerm = input.nextLine();

        Integer index = wonderland.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("The index of what you searched for is " + index
                + ". The length is " + length);

        String newWonderland = wonderland.replace(searchTerm, "");
        System.out.println(newWonderland);


//        boolean containsTerm = wonderland.toLowerCase().contains(searchTerm.toLowerCase());
//        System.out.println("Your search of '" + searchTerm + "' is " + containsTerm);






    }
}
