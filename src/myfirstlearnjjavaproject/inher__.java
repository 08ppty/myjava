package myfirstlearnjjavaproject;

public class inher__{

	// Java program to illustrate the
	// concept of single inheritance
	import java.io.*;
	import java.lang.*;
	import java.util.*;

	// Parent class
	class one {
		public void print_geek()
		{
			System.out.println("Geeks");
		}
	}

	class two extends one {
		public void print_for() { System.out.println("for"); }
	}

	// Driver class
	public class Main {
		// Main function
		public static void main(String[] args)
		{
			two g = new two();
			g.print_geek();
			g.print_for();
			g.print_geek();
		}
	}


}
	
	
	
	

