package org.dimigo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 2303 on 17. 6. 12&&.
 */
public class MelonChart {
    public static void main(String[] args) {

        List<Music> list = new ArrayList<>();
        System.out.println("--<< 멜론 챠트 >>--");
        list.add(new Music("I LUV IT", "PSY"));
        list.add(new Music("맞지?", "언니쓰"));
        printList(list);

        System.out.println("--<< 2위 곡 추가 >>--");
        list.add(1, new Music("SIGNAL", "트와이스"));
        printList(list);

        System.out.println("--<< 3위 곡 변경 >>--");
        list.set(2, new Music("팔레트", "아이유"));
        printList(list);

        System.out.println("--<< 2위 곡 삭제 >>--");
        list.remove(1);
        printList(list);

        System.out.println("--<< 전체 리스트 삭제 >>--");
        list.clear();
        printList(list);
    }

    public static void printList(List<Music> list) {
        Iterator<Music> i = list.iterator();
        int num = 0;

        while (i.hasNext()) {
            num++;
            System.out.println(num + ". " + i.next());
        }
        System.out.println();
    }
}