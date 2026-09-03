package ref;

public class Nullmain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count); //int 형은 초기값이 0으로 들어가고
        System.out.println("bigData.data = " + bigData.data); //참조형은 초기값이 null 로 들어간다.

        System.out.println("bigData.data.value" + bigData.data.value); //NullPointerException 왜냐면 null을 주솟값을 가리키는말이라서.
    }
}
