package javatask2;
import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter No of Subjects:");
		 n=s.nextInt();
		System.out.println("Enter Your Marks:");
		int score=0;
		int total=0;
		for(int i=1;i<=n;i++) {
			System.out.println("Enter Your Marks for Subject"+i+":");
			score=s.nextInt();
			total=total+score;
		}
		double Average=total/n;
		char grade;
		if(Average>=90) {
			grade='A';
			
		}
		else if(Average>=75) {
			grade='B';
		}
		else if(Average>=50) {
			grade='C';
		}
		else {
			grade='D';
		}
		System.out.println("Your Total marks is:"+total);
		System.out.println("Your Total Average is:"+Average);
		System.out.println("Your Grade is:"+grade);
		
		
		
		
	}

}
