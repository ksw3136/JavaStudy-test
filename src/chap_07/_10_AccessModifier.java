package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        //접근제어자
        //private : 해당 클래스 내에서만 접근 가능
        //public : 모든 클래스에서 접근 가능
        //default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능
        //protected : 같은 패키지 내에서 ,다른 패키지인 경우 자식 클래스에서 접근 가능

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
        b1.price = 200000;
        b1.color = "블랙";

        //할인행사
        b1.price = -5000;
        System.out.println("가격 : " + b1.price + "원");


    }
}
