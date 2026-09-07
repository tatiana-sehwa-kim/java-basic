package access;

public class SpeakerMain {
    public static void main(String[] args) {

        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근한 후임 개발자
        System.out.println("volume 필드 직접 접근 수정");
        //speaker.volume = 200;       //  직접 접근해서 스피커 과부하 시켜버리기가 가능 -> 직접 접근하지 못하게 막아버리는 것이 private
        speaker.showVolume();
    }
}
