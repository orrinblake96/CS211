package ut1;
import java.util.*;

public class uniqueChars {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a word: ");
		String word = sc.next();
		
	   System.out.println(countUniqueCharacters(word));
}
    public static int countUniqueCharacters(String input) {
        boolean[] isItThere = new boolean[Character.MAX_VALUE];
        for (int i = 0; i < input.length(); i++) {
            isItThere[input.charAt(i)] = true;
        }

        int count = 0;
        for (int i = 0; i < isItThere.length; i++) {
            if (isItThere[i] == true){
                count++;
            }
        }

        return count;
    }
}

