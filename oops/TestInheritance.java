package oops;


class animal{
	
	void weep() {
		System.out.println("weeping..");
	}
	
}  
class dog extends animal{
	
	void sound() {
		System.out.println("barking..");
		
	}
}
class food extends dog{
	void eat() {
		
		System.out.println("eating..");
		
		
	}
	
}
class TestInheritance{  
public static void main(String args[]){  
	
	food f = new food();
	f.eat();
	f.sound();
	f.weep();

	
	
}}  
