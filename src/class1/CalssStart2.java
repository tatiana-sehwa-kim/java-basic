package class1;

public class CalssStart2 {
    public static void main(String[] args) {

        // 배열을 써서 편해지긴 했는데, 만약 학생 2의 이름, 나이 점수를 지운다면 꼬일수가 있다.
        // → 클래스를 쓰는 이유

        String[] students = {"학생1", "학생2", "학생3"};
        int[] ages = {15, 16, 17};
        int[] scores = {90, 80, 70};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i] + " 나이: " + ages[i] + " 성적: " + scores[i]);
        }
    }
}
