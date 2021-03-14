/**
 * Java basics day one class code.
 */
package com.ss.basics.day.one;

/**
 * @author Hassankh
 *
 */
// Public means it is acessable anywhere within the project.
// Private: Can be accessed only in one class
// Protected:
public class HelloWorld {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(String a: args) {
			System.out.println(a);
		}

	}
	
	private void testMe() {
		
	}
	
	protected void testMeProt() {
		
	}
	
	void testMeDef() {
		
	}
	
	public static void printMe() {
		System.out.println("printing some parent");
	}

}
