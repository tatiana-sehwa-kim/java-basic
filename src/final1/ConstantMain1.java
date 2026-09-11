package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + 1000);    // 1000 이라는 숫자 바꾸면 밑에도 바꾸고, 만약 설명이 없으면 무슨 숫잔지 알수가 없음. 그래서 상수를 쓰는것. Main2로 ㄱㄱ
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수: " + currentUserCount);
        if (currentUserCount > 1000) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
