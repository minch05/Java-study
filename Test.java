public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println("c1 = " + c1);
        System.out.println("c1의 부품객체 p  = "+c1.getPoint());
        System.out.println("c1의 반지름 "+c1.getR());
        System.out.println(" p의 중심점  x"+c1.getPoint().getX());
        System.out.println(" p의 중심점  y"+c1.getPoint().getY());
    }
}
class Point{
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }



    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}
class Circle{
    private Point p;
    private int r;

    public Point getPoint() {
        return p;
    }

    public int getR() {
        return r;
    }

    public Point getP() {
        return p;
    }


    public Circle(int r){
        p = new Point(1,1); //Composition
        this.r = r;
    }
}