import java.util.Scanner;
public class Minuteconverter
{
	public static void main(String[] args)
	{
		double year = 60*24*365;
		Scanner sc = new Scanner(System.in);
		System.out.println("input the number of minutes:");
		double min = sc.nextDouble();
		long years = (long) (min/year);
		int days = (int) (min/60/24)%365;
		System.out.println((int) min + "minutes is approximately" + years + "years and" + days + "days");
		
	}
}