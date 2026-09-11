package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        //data = new Data();

        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;                // 변수에 final 안붙었기때문에 바꿀수 있다.
        System.out.println(data.value);
    }
}
