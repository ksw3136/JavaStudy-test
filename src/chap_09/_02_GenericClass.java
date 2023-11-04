package chap_09;

import chap_09.coffee.*;
import chap_09.user.VIPUser;
import chap_09.user.user;

public class _02_GenericClass {
    public static void main(String[] args) {
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();
        CoffeeByNickname c2 = new CoffeeByNickname("강상우");
        c2.ready();

        System.out.println("---------------------");


        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();
        CoffeeByName c4 = new CoffeeByName("강상상");
        c4.ready();
        System.out.println("----------------");


        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호: " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름: " + c4Name);

        System.out.println("----------------");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호: " + c5Name);

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();

        System.out.println("----------------");

        CoffeeByUser<user> c7 = new CoffeeByUser<user>(new user("강호동"));
        c7.ready();

        CoffeeByUser<user> c8 = new CoffeeByUser<>(new VIPUser("서장훈"));
        c8.ready();

        System.out.println("----------------");
        orderCoffee("김영철", "아메리카노");


    }

    public static <T> void  orderCoffee(T name){
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T,V> void  orderCoffee(T name, V coffee){
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}
