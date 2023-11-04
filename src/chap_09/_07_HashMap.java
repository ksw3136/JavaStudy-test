package chap_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        //맵 (key,Value)

        HashMap<String, Integer> map = new HashMap<>();

        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 7);

        System.out.println("총 고객 수 : " + map.size());
        System.out.println("------------------");


    }
}
