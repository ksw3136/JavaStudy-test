package chap_09;

import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        //링크드 리스트

        LinkedList<String> list = new LinkedList<>();
        list.add("영");
        list.add("일");
        list.add("이");
        list.add("삼");
        list.add("사");

        list.addFirst("마이너스 일");

        System.out.println(list.get(0));

        list.add("오");
        list.add(2,"사이에 낀 숫자");
        for (String s:list
             ) {
            System.out.println(s);

        }
        System.out.println("-------------------");
        System.out.println("남은 숫자 수 : " + list.size());
        list.remove(list.size() -1 );
        System.out.println("남은 숫자 수 : " + list.size());
        System.out.println("-------------------");

        list.removeFirst();
        list.removeLast();
        for (String s:list
        ) {
            System.out.println(s);

        }
    }
}
