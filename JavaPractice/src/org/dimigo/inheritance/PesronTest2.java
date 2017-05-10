/**
 *
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |- PesronTest
 *
 * 1. 개요 :
 * 2. 작성일: Apr 26, 2017
 * </pre>
 *
 * @author dwkim
 * @version : 1.0
 */
public class PesronTest2 {

	/**
	 * @param args
	 */
	private void greetings(){
        Person person[]={
                new Person("Tom"),
            new Korean("홍길동"),
            new Japanese("다나카"),
            new Chinese("왕밍"),
        };
        for(Person p : person){
            System.out.println(p);
            p.sayHello();
            p.sayBye();
            System.out.println();
        }
    }
	public static void main(String[] args) {
        new PesronTest2().greetings();
    }


}
