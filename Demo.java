package BuildPattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		URLBuilder.Builder obj=new URLBuilder.Builder();
//		
//		URLBuilder.Builder o=obj.protocol("basha");
//		
//	    URLBuilder ob=o.build();
//	    
//	    System.out.println(ob.protocol);
		
		//Eager Loading 
		
//		Singleton ob=Singleton.getInstance();
//		
//		Singleton ob1=Singleton.getInstance();
//		
//		System.out.println(ob);
//
//		System.out.println(ob1);
		
		// Lazy Loading 
		
		Singleton ob=Singleton.getInstance();
		
		Singleton ob1=Singleton.getInstance();
		
		
		System.out.println(ob);
		
		System.out.println(ob1);
	}

}
