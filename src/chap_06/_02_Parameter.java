package chap_06;

public class _02_Parameter {
    public static void  power(int number){
        int result = number * number;
        System.out.println(number + "의 2승은 " + result + "입니다.");
    }
    public static void  PowerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;

        }
        System.out.println(number + "의 " + exponent + "승은 " + result + "입니다.");
    }
    public static void main(String[] args) {
        // 전달값, Parameter
        power(2);
        power(12);

        PowerByExp(3,3);
        PowerByExp(10,4);
    }
}
