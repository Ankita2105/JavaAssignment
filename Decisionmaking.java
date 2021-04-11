import java.util.Scanner;
public class Decisionmaking
{
	public static void main(String[] args)
	{
		int input;
		System.out.println("Enter your age :");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		if(input > 18)
		{
			System.out.println("You are eligible to vote");
		}
		else if(input > 20)
		{
			System.out.println("You are a major");
		}
		else{
			System.out.println("You are NOT a major");
		}
	}
}