package javatask1;
import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber{
	public static void main(String[] Args) {
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		int number=ran.nextInt(100)+1;
		int guess;
		System.out.println("Guess a numberbetween 1 to 100:");
		while(true) {
			guess=s.nextInt();
			if(guess<number) {
				System.out.println("Too low,Better luch next time!");
			}
			else if(guess>number) {
				System.out.println("Too high,Better luck next time1");
				
			}
			else {
				System.out.println("Hurray!...You found the correct answer!");
				break;
			}
		}
		s.close();
	}
}
