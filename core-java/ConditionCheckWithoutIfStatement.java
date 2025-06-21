import java.util.Scanner;
class Students{
	static int id = 1110;
	static int password = 1234;
	static String name = "Dragon";
}

public class ConditionCheckWithoutIfStatement{
	public static void check(){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter ID ");
		int id = scan.nextInt();

		System.out.println("Enter Password ");
		int password = scan.nextInt();

		String result = id == Students.id && password == Students.password ? proceed():"Invalid bro,Bye!!";
		System.out.println(result);
}

	public static String proceed(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome " + Students.name);

		System.out.println("Enter tamil mark " );
		int a = scan.nextInt();

		System.out.println("Enter english mark " );
		int b = scan.nextInt();

		System.out.println("Enter maths mark " );
		int c = scan.nextInt();

		return "Your total: " + (a+b+c) + " and Your Average: " + (a+b+c)/3;
		
}
	public static void main(String[] args){
		check();
}
}