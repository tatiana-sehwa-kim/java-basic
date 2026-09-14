package extends1.super1;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value);   // this  생략 가능.  생략하면 내꺼에서 찾고 없으면 부모
        System.out.println("super value = " + super.value); // super는 내 부모

        this.hello();
        super.hello();
    }
}
