import java.util.*;
public class ConstructorDemo {
	ConstructorDemo(){
		System.out.println("Default Constructor Called");
	}
	ConstructorDemo(int num1,int num2){
		System.out.println("Parameterized Constructor Called");
		int Sum=num1 + num2;
		int sub=num1 - num2;
		int mul=num1 * num2;
		double div=num1 / num2;
		System.out.println("Two Number Sum IS=>" + Sum );
		System.out.println("Two Number Subtraction IS=>" + sub );
		System.out.println("Two Number Multiplication IS=>" + mul );
		System.out.println("Two Number Division IS=>" + div );
		}
	public static void main(String[] args) {
		ConstructorDemo c1=new ConstructorDemo();
		int n1,n2;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number 1=");
		n1=s.nextInt();
		System.out.print("Enter Number 2=");
		n2=s.nextInt();
		ConstructorDemo c2=new ConstructorDemo(n1,n2);
	}
}
