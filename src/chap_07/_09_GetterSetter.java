package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.setModelName("까망이");
        b1.setPrice(-5000);
        b1.setColor("블랙");

        System.out.println("가격 : " + b1.getPrice() + "원");
        System.out.println("해상도: " + b1.getResolution());


    }
}
