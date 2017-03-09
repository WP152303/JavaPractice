/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *    |- PrimitiveDataType
 *
 * 1. 개요 : 아이유 프로필 출력하기
 * 2. 작성일: Mar 9, 2017
 * </pre>
 *
 * @author dwkim
 * @version : 1.0
 */
public class PrimitiveDataType {
	public static void main(String[] args) {
		
		String name="아이유";
		boolean isMale=false;
		int age=25;
		double height=161.8;
		float weight= 44.3f;
		char bloodType='A';
		
		System.out.printf("<<아이유 프로필>>\n이름 : %s\n",name);
		
		if(isMale)
			System.out.printf("성별 : 남자\n");
		else System.out.printf("성별 : 여자\n");
		
		System.out.printf("나이 : %d\n키 : %fcm\n몸무게 : %fkg\n혈액형 : %c형\n\n",age,height,weight,bloodType);

	}

}
