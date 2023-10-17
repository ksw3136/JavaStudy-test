package chap_07;

public class _05_methodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "블랙1";

        b1.record(false,false,10);
        System.out.println("--------------------");
        b1.record(false,true,3);
        System.out.println("--------------------");
        b1.record(true,true,3);
        System.out.println("--------------------");
        b1.record();
    }
}
