package poly.ex.sender;

public class SmsSender implements Sender {

    @Override
    public void sendMessage(String message) {
        System.out.print("SMS를 발송합니다: ");
        System.out.println(message);
    }
}
