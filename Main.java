
import java.util.Scanner;
 
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o comprimento da sequencia de Fibonacci: ");
	    int n = sc.nextInt();
	    int num1 = 0, num2 = 1;
	    System.out.print("Sequencia: ");
	    System.out.print(num1);
	    int con = n - 1;
	     for (int i = 0; i < con ;i++ ) {
	    num1 = num1 + num2;
	    num2 = num1 - num2;
	    
	    	    System.out.print(", "+num1);
	    	    }
	    	System.out.print(".");   
	     sc.close();
	}

}