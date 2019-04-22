package NestedClass2;

import NestedClass2.Example1.Inner;

public class Exam2 {
	
	public static void main(String[] args) {
		Example1 outer= new Example1();
		Example1.Inner inner = outer.new Inner();
		
		inner.display();
	}

}
