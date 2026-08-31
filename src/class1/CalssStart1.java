package class1;

public class CalssStart1 {

    public static void main(String[] args) {

        // 변수 사용해서 풀어보기 ( 배열을 이미 사용해서풀었음 )
        String[] students = new String[2];
        int[] ages = new int[2];
        int[] scores = new int[2];

        students[0] = "학생1";
        ages[0] = 15;
        scores[0] = 90;

        students[1] = "학생2";
        ages[1] = 15;
        scores[1] = 90;

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i] + " 나이: " + ages[i] + " 성적: " + scores[i]);
        }
    }
}
