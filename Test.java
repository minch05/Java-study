public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("김민수", "990101-1234567", "서울시 강남구");

        Student s1 = new Student("이지은", "030315-4234567", "경기도 성남시", 2, 90, "소프트웨어공학과");

        Professor f1 = new Professor("박준호", "750820-1234567", "서울시 노원구", "정교수", 5200);



        System.out.println("Person = " + p1);
        System.out.println("Student = " + s1);
        System.out.println("Professor = " + f1);

        System.out.println("이름 : " + p1.name);
        System.out.println("주민등록번호 : " + p1.ssn);
        System.out.println("주소 : " + p1.addr);

        System.out.println("학생 정보");
        System.out.println("이름 : " + s1.name);
        System.out.println("주민등록번호 : " + s1.ssn);
        System.out.println("주소 : " + s1.addr);
        System.out.println("학점 : " + s1.grade);
        System.out.println("점수 : " + s1.getScore());
        System.out.println("학과 : " + s1.major);

        System.out.println("교수 정보");
        System.out.println("이름 : " + f1.name);
        System.out.println("주민등록번호 : " + f1.ssn);
        System.out.println("주소 : " + f1.addr);
        System.out.println("직급 : " + f1.position);
        System.out.println("급여 : " + f1.getSalary());
    }
}
class Person{
    String name;
    String ssn;
    String addr;

    public Person(String name,String ssn, String addr){
        this.name = name;
        this.ssn = ssn;
        this.addr = addr;
    }
}
class Student extends Person{
    int grade;
    private double score;
    String major;

    public double getScore(){
        return score;
    }

    public Student(String name,String ssn, String addr,int grade, double score, String major){
        super(name,ssn,addr);
        this.grade = grade;
        this.score = score;
        this.major = major;

    }

}
class Professor extends Person{
    String position;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public Professor(String name, String ssn, String addr, String position, int salary){
        super(name,ssn,addr);
        this.position = position;
        this.salary = salary;
    }
}
