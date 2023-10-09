package chap_05;
//신발 사이즈는 250 부터 295까지 5씩 증가
//사이즈 수는 총 10개


public class _06_Quiz {
    public static void main(String[] args) {
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }
        for (int size : sizeArray
             ) {
            System.out.println("사이즈 " + size + "(재고있음)");
            
        }
            
        }
    }

