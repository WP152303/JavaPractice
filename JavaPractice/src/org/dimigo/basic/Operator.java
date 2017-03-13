/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *    |- Operator
 *
 * 1. 개요 :
 * 2. 작성일: Mar 13, 2017
 * </pre>
 *
 * @author dwkim
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<<디미베네 연간 인건비>>");
		long k=1700000, num=3 , n=1500;
		System.out.println("월 평균 급여 : "+String.format("%,d", k)+"원");
		System.out.println("점포 내 직원 수 : " + num + "명");
		System.out.println("점포 수 : " + String.format("%,d", n)+"개");
		long year=k*12*num*n;
		System.out.println("연간 인건비: "+String.format("%,d",year)+"원");
	}

}
