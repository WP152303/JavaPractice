/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *    |- Question
 *
 * 1. 개요 :
 * 2. 작성일: Mar 31, 2017
 * </pre>
 *
 * @author dwkim
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] questions={"가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?"};
		String[] answers={"빅뱅","공유","응용 프로그래밍"};
		
		for(int i=0; i<3; i++){
			System.out.println(questions[i]);
			String answer = scanner.nextLine();
			if(answers[i].equals(answer)){
				System.out.println("정답입니다!");
			}else{
				System.out.println("틀렸습니다!");
			}
			
		}
		
		System.out.println("<<결과 출력>>");
		for(int i=0; i<3; i++){
			StringBuilder sb = new StringBuilder(questions[i]);
			sb.append(" ").append(answers[i]).append("입니다.");
			
			System.out.println(sb);
		}

	}

}
