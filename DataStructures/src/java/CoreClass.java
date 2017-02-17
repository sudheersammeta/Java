/**
 * 
 */
package java;

/**
 * @author Sudheer S
 *
 */
public class CoreClass {

	/**
	 * @param args
	 */
	
	public CoreClass(){
		System.out.println("in super class default constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendedClass1 e1 = new ExtendedClass1("ss");

	}

}

 class ExtendedClass1 extends CoreClass{
/*public ExtendedClass1() {
	// TODO Auto-generated constructor stub
	System.out.println("in extennded class default constructor");
}*/

public ExtendedClass1(String s) {
	// TODO Auto-generated method stub
	System.out.println("in string param connstructor");
}
}
