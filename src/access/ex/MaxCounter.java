package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        // 검증 로직: 검증로직이 여러개일때는 이런 구조를 쓴다.
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        // 실행 로직
        count++;

//        if (count < max) {        내가푼부분. 이것도맞긴함
//            count++;
//        } else {
//            System.out.println("최대값을 초과할 수 없습니다.");
//        }
    }

    public int getCount() {
        return count;
    }
}
