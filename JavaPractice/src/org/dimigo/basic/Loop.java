/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *    |- Loop
 *
 * 1. 개요 :
 * 2. 작성일: Mar 15, 2017
 * </pre>
 *
 * @author dwkim
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int choice;
		int at=100;
		int ran;
		String[] job= {"마법사","영주","기사","농민"};
		
		do{
			System.out.println("--------------------");
			System.out.println("<<게임 메뉴>>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("--------------------");
			System.out.print("메뉴 입력 => ");
			choice =scanner.nextInt();
			
			switch(choice){
			case 1:
				at+=10;
				System.out.printf("공격력이 증가되었습니다. 현재 공격력 : %d\n",at);
				break;
			case 2:
				at-=10;
				System.out.printf("공격력이 감소되었습니다. 현재 공격력 : %d\n",at);
				break;	
			case 3:
				ran=new Random().nextInt(4); //0~5 +1하면 1~6
				System.out.printf("%s(으)로 설정되었습니다.\n",job[ran]);
			case 9:
			default:
				
		}
		}while(choice!=9);
	}

}
