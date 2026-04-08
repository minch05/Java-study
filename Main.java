class Circle{
    // 속성 선언
    public int center_x;
    public int center_y;
    public int radius;
    //클래스 circle의 행위 ( 메소드 오퍼레이션) 정의
    public Circle(int x,int y,int r){
        center_x = x;
        center_y = y;
        radius = r;
    }

    public double circumference(){
        return (2*3.14*radius);
    }
    public double areaOf(){
        return (3.14*radius*radius);
    }
}

class Book {

    // 필드 (속성)
    public String title;   // 책 제목
    public String author;  // 저자
    public int price;      // 가격

    // 생성자 (매개변수 생성자)
    public Book(String title, String author, int price) {
        this.title = title;     // 전달받은 제목 저장
        this.author = author;   // 전달받은 저자 저장
        this.price = price;     // 전달받은 가격 저장
    }

    // 제목 반환 메서드
    public String getTitle() {
        return title;
    }

    // 할인 메서드 (rate: 할인율 %)
    public void saleBook(int rate) {
        // 가격 = 가격 - (가격 * 할인율 / 100)
        price = price - (price * rate / 100);
    }
}

public class Main {
    public static void main(String[] args){
        Circle myCircle = new Circle(3,3,5);
        System.out.println(myCircle);
        System.out.println("myCircle의 중심점" + myCircle.center_x);
        System.out.println(myCircle.center_y);
        System.out.println(myCircle.radius);
        System.out.println(myCircle.circumference());
        System.out.println(myCircle.areaOf());

        // 객체 생성
        Book b = new Book("자바", "홍길동", 20000);

        // 제목 출력
        System.out.println("제목: " + b.getTitle() + "\n저자: " + b.author);

        // 할인 적용 (10%)
        b.saleBook(10);

        // 할인 후 가격 출력
        System.out.println("할인 후 가격: " + b.price);
    }
}
