package org.dimigo.io;

import java.io.*;

/**
 * Created by 2303 on 17. 6. 15.
 */
public class ArakoMenu {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new FileWriter("files/menu.txt"));
             BufferedReader bufferedReader2 = new BufferedReader(new FileReader("files/menu.txt"))) {

            String data;
            while ((data = bufferedReader1.readLine()) != null) {
                writer.write(data);
                writer.newLine();
            }
            bufferedReader1.close();
            writer.close();

            System.out.println("<< 메뉴 출력 >>");
            String result;
            while ((result = bufferedReader2.readLine()) != null) {
                System.out.println(result);
            }
            bufferedReader2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}