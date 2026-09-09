package static1;

public class Data3 {
    public String name;
    public static int count; //static이 붙은 정적 변수!!

    public Data3(String name) {
        this.name = name;
        count++;
    }
}

// Data3.count++; 과도 같다. 같은 클래스라 생략해도 된것.