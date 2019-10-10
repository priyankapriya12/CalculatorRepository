import java.util.Scanner;
public class Function_Calculator {
	public static void main(String[] args) {
		int num1,num2,add=0,sub=0,mul=1,div=0,choice=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first number");
		num1=sc.nextInt();
		System.out.println("enter any number");
		num2=sc.nextInt();
		
		
		
		System.out.println("enter your choice");
		sc.nextInt();
		switch(choice) {
		case 1:
			add(num1,num2);
			System.out.println("Add : num1+num2" + "="+ add);
			break;
		case 2:
			sub(num1,num2);
			System.out.println("Sub : num1-num2" + "="+ sub);
			break;
		case 3:
			 mul(num1,num2);
			System.out.println("Mul : num1*num2" + "="+ mul);
			break;
		case 4:
			div(num1,num2);
			System.out.println("Divide : num1/num2" + "="+ div);
		}
		/*add= add(num1,num2);
		System.out.println("Add : num1+num2" + "="+ add);
		sub= sub(num1,num2);
		System.out.println("Sub : num1-num2" + "="+ sub);
		mul= mul(num1,num2);
		System.out.println("Mul : num1*num2" + "="+ mul);
		div=div(num1,num2);
		System.out.println("Divide : num1/num2" + "="+ div);*/
		
		sc.close();
	}
	static int add(int n1,int n2) {
		return n1+n2;
	}
	static int sub(int n1,int n2) {
		return n1-n2;
	}
	static int mul(int n1,int n2) {
		return n1*n2;
	}
	static int div(int n1,int n2) {
		return n1/n2;
	}
}
