package chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "검은색";
        BlackBox b2 = new BlackBox();
        b2.modelName = "하얀색";
        System.out.println("개발전");
        System.out.println(b1.modelName + "자동신고 기능: " + BlackBox.canAutoReport);
        System.out.println("개발 완료");
        BlackBox.canAutoReport = true;
        System.out.println(b1.modelName + "자동신고 기능: " + BlackBox.canAutoReport);
    }
}
