public class test {
    public static void main(String[] args) {
        Point p1 = new Point(3,3);

        Circle c1 = new Circle(10);

        Circle c2 = new Circle(20,p1);

        System.out.println("p1 ="+ p1);
        System.out.println("c1 ="+ c1);
        System.out.println("c2 ="+ c2);

        System.out.println("c1의 반지름 =" + c1.getR());
        System.out.println("c1의 부품 x,y =" + c1.getPoint().getX()+"," +c1.getPoint().getY());

        System.out.println("c2의 반지름 =" + c2.getR());
        System.out.println("c1의 부품 x,y =" + c2.getPoint().getX()+"," +c2.getPoint().getY());

        System.out.println("c1의 면적 = "+c1.area());
        System.out.println("c2의 면적 = "+c2.area());

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

    public Circle(int r){
        p = new Point(1,1); //Composition
        this.r = r;
    }

    public Circle(int r, Point p){
        this.p = p; //Aggregation 구현
        this.r = r;
    }

    public double area(){
        return (3.14*r*r);
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
