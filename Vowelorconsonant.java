package org.vikram;
import java.util.*;
public class Vowelorconsonant {
	public static void main(String[]args) {
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter a Character: ");
		char c= ob.next().charAt(0);
		c=Character.toLowerCase(c);
		if (c=='a'|| c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("Charecter is a Vowel");
			
		}
		else {
			System.out.println("Character is a Consonant");
		}
		
		
	}

}
