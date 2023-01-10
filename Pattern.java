
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//paatern(4);
		paatern9(5);
	}
	
	static void paatern(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void paatern1(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void paatern3(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n-row+1;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void paatern4(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
	
	static void paatern5(int n) {
		for(int row=1;row<=2*n-1;row++) {
			int c=row;
			if(row>n) {
				c=2*n-row;
			}
			for(int col=1;col<=c;col++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void paatern6(int n) {
		for(int row=1;row<=2*n-1;row++) {
			int c=n-row+1;
			if(row>n) {
				c=row-n+1;
			}
			for(int col=1;col<=c;col++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void paatern7(int n) {
		for(int row=1;row<=2*n-1;row++) {
			int c=row;
			if(row>n) {
				c=2*n-row;
			}
			for(int col=1;col<=c;col++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	static void paatern8(int n) {
		for(int row=1;row<=2*n-1;row++) {
			int c=n-row+1;
			if(row>n) {
				c=row-n+1;
			}
			for(int col=1;col<=c;col++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void paatern9(int n) {
		for(int row=1;row<=2*n-1;row++) {
			int c=n-row+1;
			 if(row>n) {
				 c=row-n+1;
			 }
			for(int col=1;col<=c;col++) {
				
				System.out.print(" ");
			}
			int r=row;
			if(row>n) {
				r=2*n-row;
			}
           for(int col=1;col<=r;col++) {
				
				System.out.print("* ");
			}
           
          
          
			System.out.println();
		}
	}
	
	

}
