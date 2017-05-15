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
public class PersonTest2 {

	/**
	 * @param args
	 */
	private static void greetings(Person p){
            System.out.println(p);
            p.sayHello();
            p.sayBye();
            System.out.println();
    }
	public static void main(String[] args) {
	  Person person[]={
	            new Person("Tom"),
	            new Korean("홍길동"),
	            new Japanese("다나카"),
	            new Chinese("왕밍"),
	      };
	    for(int i=0; i<4;  i++){
	        PersonTest2.greetings(person[i]);
        }

    }


}
