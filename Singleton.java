package BuildPattern;

import java.net.Socket;

public class Singleton {
	// Eager Loading 
  //private static Singleton instance=new Singleton();
  
	
	//Lazy Loading 
  private static Singleton instance =null;
  private Singleton() {
	  
  }
  
  
  public static Singleton getInstance() {
	  if(instance==null) {
		  instance=new Singleton();
	  }
	  return instance;
  }
  
//  public static Singleton getInstance() {
//	  return instance;
//  }
//  
  
  
}
