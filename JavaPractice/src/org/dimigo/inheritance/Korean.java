/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |- Korean
 *
 * 1. 개요 :
 * 2. 작성일: Apr 26, 2017
 * </pre>
 *
 * @author dwkim
 * @version : 1.0
 */
public class Korean extends Person{
	
	public Korean(String name){
		super(name);
	}
	public void sayHello(){
	System.out.println("안녕하세요");	
	}
	public void sayBye(){
		System.out.println("안녕히 계세요");
	}
	public String toString(){
		return "저는 한국사람 " + getName() + "입니다.";
	}
}
