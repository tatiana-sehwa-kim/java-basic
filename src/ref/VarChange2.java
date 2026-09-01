package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data(); //인스턴스(객체) 생성
        dataA.value = 10;
        Data dataB = dataA; //객체가 생성된것이 아니라 주솟값만 대입한것. 실제로 인스턴스는 1개인거임

        System.out.println("dataA 참조값= " + dataA);
        System.out.println("dataB 참조값= " + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = " + dataA.value);
        System.out.println("변경 dataB.value = " + dataB.value);

        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataA.value = " + dataA.value);
        System.out.println("변경 dataB.value = " + dataB.value);
    }
}
