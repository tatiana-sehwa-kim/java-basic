package access;

public class Speaker {

    private int volume;         // private: 이 안에서만 볼륨에 접근할수 있도록 숨겨버리는것. 외부에서 접근 ㄴㄴ
                                // 만약 그냥 int volume; 여쓰면 default (같은 패키지 안에서는 호출을 허용한다.)

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume () {
        System.out.println("현재 음량: " + volume);
    }
}
