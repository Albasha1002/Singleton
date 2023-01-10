import java.util.Scanner;

public class DemoCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("Enter the number");
			Scanner input=new Scanner(System.in);
			int nu=input.nextInt();
			
			if(nu%2==0) {
				System.out.println(nu);
			}if(nu==10) {
				break;
			}
		}

	}
	
	

}

