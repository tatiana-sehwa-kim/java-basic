package construct.ex;

public class Book {
    String title = " ";
    String author = " ";
    int page;

    Book(){
        this(" ", " ", 0);   //기본생성자. null 안나오게 하는 빈문자. 다른 생성자들이 있기때문에 자바가 이걸 따로 만들어주지 않는다.
    }

    Book(String title, String author) {
        this(title,author,0);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목: " + this.title + ", 저자: " + this.author + ", 페이지: " + this.page);
    }


}
