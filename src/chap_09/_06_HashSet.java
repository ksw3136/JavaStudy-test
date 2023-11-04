package chap_09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        //세트 중복 허용 x
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살");

        System.out.println("총 구매 상품수 : " + set.size());

        for (String s:set
             ) {
            System.out.println(s);

        }



        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(1);
        intSet.add(211);
        intSet.add(1311);

        for (Integer i:intSet
             ) {
            System.out.println(i);

        }
    }

}
