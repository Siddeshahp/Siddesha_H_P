/*Y class ---> call all the methods of the N, M class and call all the variables of the class X

*/
package Access_modifiers_Assignments_1;

import Access_modifiers_Assignments.M;



public class Y extends M
{
	public static void main(String[] args) 
	{
		M m1=new M();
		Y y1=new Y();
		X x=new X();
		m1.public_method();
		m1.method();
		System.out.println("c="+y1.c);
	
	
		x.public_method();
		System.out.println("h="+x.h);
		System.out.println("i="+x.i);
		System.out.println("j="+x.j);
		
		
		

	}


}
