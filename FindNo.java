import java.util.Scanner;

public class FindNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("Enter the number");
			Scanner input=new Scanner(System.in);
			int nu=input.nextInt();
			int no=2;
			if(no<nu) {
				System.out.println("No is greater ");
			}if(no>nu) {
				System.out.println("No is lesser");
			}if(nu==no){
				System.out.println("find it "+nu);
				break;
			}
		}
	}

}
