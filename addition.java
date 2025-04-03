import java.util.*,
import java.lang.*;
class Add{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first no: ");
        System.out.println("Enter second no: ");
	int a = sc.nextInt();
	int b= sc.nextInt();
	int sum = a+b;
	int mult = a*b;
	System.out.println("Addition: "+sum);
		System.out.println("Multiplication: "+mult);

	int sub=a-b;
                System.out.println("Substraction: "+sub);
	sc.close();
}}
