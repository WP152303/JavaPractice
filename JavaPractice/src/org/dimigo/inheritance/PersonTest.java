/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |- PersonTest
 *
 * 1. 개요 :
 * 2. 작성일: Apr 26, 2017
 * </pre>
 *
 * @author dwkim
 * @version : 1.0
 */
public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Person a= new Person("Tom");
		Korean k =new Korean("홍길동");
		Chinese c = new Chinese("왕밍");
		Japanese j = new Japanese("다나까");

		System.out.println(a);
		System.out.println(k);
		System.out.println(c);
		System.out.println(j);

		System.out.println();

		a.sayHello();
		k.sayHello();		
		c.sayHello();
		j.sayHello();

		System.out.println();

		a.sayBye();
		k.sayBye();
		c.sayBye();	
		j.sayBye();
	}

}
