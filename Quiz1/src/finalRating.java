import java.util.Scanner;

class finalRating {
	public static void main(String arg[]) {
		Scanner ATT = new Scanner(System.in);
		System.out.println("Enter number of passing attempts");
		double Attempts = ATT.nextDouble();
		Scanner COMP = new Scanner(System.in);
		System.out.println("Enter number of completions");
		int Completes = COMP.nextInt();
		Scanner YDS = new Scanner(System.in);
		System.out.println("Enter number of passing yards");
		int Yards = YDS.nextInt();
		Scanner TD = new Scanner(System.in);
		System.out.println("Enter number of touchdown passes");
		double Touchdowns = TD.nextDouble();
		Scanner INT = new Scanner(System.in);
		System.out.println("Enter number of Interceptions");
		int Intercepts = INT.nextInt();

		double a = ((Completes / Attempts - 0.3) * 5);
		if (a > 2.375)
			;
		{
			a = 2.375;
		}
		double b = (((Yards / Attempts) - 3) * 0.25);
		if (b > 2.375)
			;
		{
			b = 2.375;
		}
		double c = ((Touchdowns / Attempts) * 20);
		if (c > 2.375)
			;
		{
			c = 2.375;
		}
		double d = (2.375 - ((Intercepts / Attempts) * 25));
		if (d > 2.375)
			;
		{
			d = 2.375;
		}
		double PasserRating = (((a + b + c + d) / 6) * 100);

		System.out.println(PasserRating);

	}

}