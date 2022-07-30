import java.util.Scanner;
public class CheckAge {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Age:=");
		int age=s.nextInt();
		if(age>=18) {
			System.out.println("You Are Eligible For Vote");
		}
		else {
			System.out.println("You Are Not Eligible For Vote");
		}
		
	}

}
