package chap_07;

public class _02_InstaceVariables {

    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "검은색";
        b1.color = "블랙";
        b1.price = 200000;
        b1.resolution = "FHD";
        System.out.println(b1.color);
    }
}
