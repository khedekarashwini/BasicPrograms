package com.demo;




interface Account
{
	
   String toString();


}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(new Account(){
public String toString()
{
	
return "Account";
}});
	}

}