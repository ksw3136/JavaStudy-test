package chap_09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class _08_Iterator {
    public static void main(String[] args) {
        //이터레이터
        List<String> list = new ArrayList<>();
        list.add("강");
        list.add("(알 수 없음)");
        list.add("김");
        list.add("(알 수 없음)");
        list.add("이");
        list.add("(알 수 없음)");
        list.add("박");
        list.add("(알 수 없음)");
        list.add("최");
        list.add("(알 수 없음)");
        list.add("야");

        for (String s: list
             ) {
            System.out.println(s);

        }

        System.out.println("-----------");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("-----------");

        it = list.iterator(); // 커서를 처음 위치로 이동

        while (it.hasNext()){
            String s = it.next();
            if(s.contains("(알 수 없음)")){
                it.remove();
            }
        }

        for (String s: list
        ) {
            System.out.println(s);

        }

        HashSet<String> set = new HashSet<>();
        set.add("강");
        set.add("김");
        Iterator<String> itSet = set.iterator();
    }
}
