package chap_09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _04_ArrayList {

    public static void main(String[] args) {
        //컬랙션 프레임 워크 (List, Set, Map)
        ArrayList<String> list = new ArrayList<>();

        //데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("-------------------");

        System.out.println("신청 학생 수 (이사 전) : " + list.size());
        list.remove("박명수");
        System.out.println("신청 학생 수 (이사 후) : " + list.size());

        list.remove(list.size() - 1);
        System.out.println(list.size());

        for (String s :
             list) {
            System.out.println(s);

        }

        System.out.println("-------------------");

        list.set(0, "이수근");
        System.out.println(list.get(0));

        System.out.println(list.indexOf("김종국"));
        if ( list.contains("김종국")){
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        list.clear();
        if(list.isEmpty()){
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("-------------------");

        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        Collections.sort(list);

        for (String s: list) {
            System.out.println(s);
            
        }

    }
}

