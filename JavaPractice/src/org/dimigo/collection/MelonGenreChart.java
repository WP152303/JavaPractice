package org.dimigo.collection;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

/**
 * Created by 2303 on 17. 6. 13.
 */
public class MelonGenreChart {
    public static void main(String[] args) {
        Map<String, List<Music>> map = new HashMap<>();
        List<Music> Ballad = new ArrayList<>();
        List<Music> Dance = new ArrayList<>();
        System.out.println("-- << 멜론 장르별 챠트 >> --");
        Ballad.add(new Music("팔레트", "아이유"));
        Dance.add(new Music("I LUV IT", "PSY"));
        Dance.add(new Music("맞지?", "언니쓰"));

        map.put("발라드", Ballad);
        map.put("댄스", Dance);
        printMap(map);

        System.out.println("-- << 댄스 2위 곡 변경 >> --");
        Dance.set(1, new Music("SIGNAL", "트와이스"));
        printMap(map);

        System.out.println("-- << 댄스 1위 곡 삭제 >> --");
        Dance.remove(0);
        printMap(map);

        System.out.println("-- << 전체 리스트 삭제 >> --");
        map.clear();
        printMap(map);
    }

    public static void printMap(Map<String, List<Music>> map) {
        for (String key : map.keySet()) {
            System.out.println("[" + key + "]");
            int num = 1;
            for (Music value : map.get(key)) {
                System.out.println(num + ". " + value);
                num++;
            }
        }
        System.out.println();
    }
}