package myfirstlearnjjavaproject;

public class throwsprogram<staticvoid> {

	static void validate(int age){  
		if(age<18)  
		throw new ArithmeticException("not valid");  
		else
		System.out.println("welcome to vote");  
		   }  
		public staticvoid main(String args[]){  
		validate(13);  
		System.out.println("rest of the code...");
		return null;  
		  }  

	
	
	
	
}
