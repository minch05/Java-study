class Student{
    //student의 속성
    String name;
    String id;

    public Student(String name,String id){
        this.name = name;
        this.id = id;
    }
}

public class Test {
    public static void main(String[] args){
        System.out.println("hello world");
        //student 클래스로부터 객체 생성
        // 클래스명 객체명 = new 객체생성함수();
        Student hong = new Student("홍길동","20251111");
        System.out.println("hong의 이름 = " + hong.name);
    }
}
