import java.util.Scanner;
class Circle{
    double radius;
    public double getArea() {
        return 3.14*radius*radius;
    }
    public double gerPerimeter(){
        return 3.14*2*radius;
    }
}
public class task_5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Circle cir=new Circle();
        cir.radius=in.nextDouble();
        System.out.println("the area is "+cir.getArea());
        System.out.println("the perimeter is "+cir.gerPerimeter());
    }
}
