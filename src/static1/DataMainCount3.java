package static1;

public class DataMainCount3 {
    public static void main(String[] args) {

        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("A");
        System.out.println("C count=" + Data3.count);
    }
}

// count 정적 변수에 접근하는 방법이 조금 특이한데 Data3.count 와 같이 클래스명에 . (dot)을 사용 한다.
// 마치 클래스에 직접 접근하는 것 처럼 느껴진다.