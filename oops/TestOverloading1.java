package oops;

class Adder{
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {

		return a+b+c;
	}
	
}

public class TestOverloading1 {

public static void main (String [] args) {
	System.out.println(Adder.add(1, 2));
	System.out.println(Adder .add(1,2,3));
}
}
