package chap_06;

public class _09_Quiz {
    public static String getHiddenData(String data, int index){
        String hiddenData = data.substring(0,index);
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";

        }

        return hiddenData;


    }
    public static void main(String[] args) {
        String name = "강상우"; // 아룸
        String id = "991121-1234567"; // 주민번호
        String phoneNumber = "010-1234-1234"; //전화번호
        System.out.println("이름: " + getHiddenData(name, 1));
        System.out.println("주민번호: " + getHiddenData(id, 8));
        System.out.println("전화번호: " + getHiddenData(phoneNumber, 9));
    }
}
