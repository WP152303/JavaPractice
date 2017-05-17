package org.dimigo.abstractclass;

/**
 * Created by daniel-kim on 12/05/2017.
 */
public class SmartPhoneTest {
    public static void main(String args[]){

        SmartPhone[] smartPhone = new SmartPhone[]{
                new IPhone("iPhone 7","애플",900000),
                new Galaxy("갤럭시 S8","삼성",800000),
        };
        for(int i=0;i<2; i++){
            System.out.println(smartPhone[i]);
            smartPhone[i].turnOn();
            smartPhone[i].pay();
            smartPhone[i].useSpecialFunction();
            smartPhone[i].turnOff();
            System.out.println();
        }



    }
}
