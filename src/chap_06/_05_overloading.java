package chap_06;

public class _05_overloading {
    public static int getPower(int number){
        int result = number * number;
        return result;
    }
    public  static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number*number;
    }
    public static int getPowerExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;

        }
        return result;
    }
    //메소드 오버로딩
    //같은 이름의 메소드를 여러번 사용할 수 있는 경우
    //1.전달값의 타입이 다르거나
    //2.전달값의 개수가 다르거나
    public static void main(String[] args) {
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
    }
}
