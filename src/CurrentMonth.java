import java.util.Scanner;
public class CurrentMonth {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int month=s.nextInt();
		switch(month) {
		case 1:
			System.out.println("Show Your Month:January");
			break;
		case 2:
			System.out.println("Show Your Month:February");
			break;
		case 3:
			System.out.println("Show Your Month:March");
			break;
		case 4:
			System.out.println("Show Your Month:April");
			break;
		case 5:
			System.out.println("Show Your Month:May");
			break;
		case 6:
			System.out.println("Show Your Month:June");
			break;
		case 7:
			System.out.println("Show Your Month:July");
			break;
		case 8:
			System.out.println("Show Your Month:Augest");
			break;
		case 9:
			System.out.println("Show Your Month:September");
			break;
		case 10:
			System.out.println("Show Your Month:Octomber");
			break;
		case 11:
			System.out.println("Show Your Month:November");
			break;
		case 12:
			System.out.println("Show Your Month:December");
			break;
		default:
			System.out.println("Invalid Input Month Number");
			break;
		}
	}
}
