package com.demo;

class A
{
	

}
class B extends A
{
	


}
class C extends B
{
	

}



public class Test123 {

	public static void main(String[] args) {
		C c= (C) new B();
	}

}
