package org.vikram;
interface i{
	void display();
	
}
interface i2 extends i{
	void display2();
}
interface i3 extends i2{
	void display3();
	
}
interface m {
	void display4();
}

public class Interface implements i3, m {

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("Display 2");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display ");
		
	}

	@Override
	public void display4() {
		// TODO Auto-generated method stub
		System.out.println("Display 4");
		
	}

	@Override
	public void display3() {
		// TODO Auto-generated method stub
		System.out.println("Display 3");
		
	}
	
	public static void main(String[]args) {
		Interface i1= new Interface();
		i1.display();
		i1.display2();
		i1.display3();
		i1.display4();
		
	}

}
