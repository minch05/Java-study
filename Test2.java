public class Test2 {
    public static void main() {
        Bike b1 = new Bike(10,10,10);
        System.out.println("b1 주소: "+b1);
        Person p1 = new Person("홍길동","서울시","1234-5678",b1);
        System.out.println("p1 주소: "+p1);

        System.out.println("p1 이름: " + p1.getName());
        System.out.println("p1 주소: " + p1.getAddr());
        System.out.println("p1 번호: " + p1.getTel());
        System.out.println("p1 이름: " + p1.getMyBike());

        p1.drive();

        System.out.println("b1의 변속된 기어값 = " + b1.getGear());

        b1.brake();
        System.out.println("b1의 변속된 기어값 = " + b1.getGear());
    }
}
class Person{
    private String name;
    private String addr;
    private String tel;
    private Bike myBike;

    public Person(String name,String addr,String tel,Bike myBike){
        this.name = name;
        this.addr = addr;
        this.tel = tel;
        this.myBike = myBike;
    }

    public String getName() {
        return name;
    }

    public String getAddr() {
        return addr;
    }

    public String getTel() {
        return tel;
    }

    public Bike getMyBike() {
        return myBike;
    }

    public void drive(){
        myBike.changeGears(5);
        System.out.println("기어변속");
    }
    public void changeAddress(String newAddr){
        addr=newAddr;
    }
    public void changeTelephone(String newTel){
        tel=newTel;
    }
}

class Bike{
    private int speed;
    private int cadence;
    private int gear;

    public Bike(int speed,int cadence,int gear){
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public int getCadence() {
        return cadence;
    }

    public void changeGears(int newgear){
        gear = newgear;
    }
    public void changeCadence(int newcadence){
        cadence = newcadence;
    }
    public void brake(){
        speed = 0;
        cadence= 0;
        gear = 1;
        System.out.println("자전거가 멈췄습니다");
    }
}