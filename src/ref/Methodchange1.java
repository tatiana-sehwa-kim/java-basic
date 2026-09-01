package ref;

public class Methodchange1 {
    public static void main(String[] args) {
        int a= 10;
        System.out.println("메서드 호출 전: a =" + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후: a =" + a);
    }

    static void changePrimitive(int x) {
        x= 20;
    } //a도 10, x도 10을 받고, 메서드에서 x가 20이 되고, 프린트 a를 했으니 호출 후에도 a는 10
}
