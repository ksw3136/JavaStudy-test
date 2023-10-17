package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "검정1";

        BlackBox.canAutoReport = true;
        b1.autoReport();

        b1.insertMemoryCard(512);

        //일반 영상 : 1
        //이벤트 영상 : 2
        int fileCount = b1.getVideoFileOunt(1);
        System.out.println("일반 영상 파일 수: " + fileCount +"개");

        fileCount = b1.getVideoFileOunt(2);
        System.out.println("이벤트 영상 파일 수: " + fileCount + "개");
    }

}
