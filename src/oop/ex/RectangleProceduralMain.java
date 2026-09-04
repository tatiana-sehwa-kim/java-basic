package oop.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.calculateArea();
        int perimeter = rectangle.calculatePerimeter();
        boolean isSquare = rectangle.isSquare();

        System.out.println("넓이: " + area);
        System.out.println("둘레 길이: " + perimeter);
        System.out.println("정사각형 여부: " + isSquare);
    }
}
