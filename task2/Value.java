
import java.util.Scanner;

public class Value
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        System.out.println("Enter The Value Of The Length: ");
        double length1 = scanner.nextDouble();
        System.out.println("Enter The Value Of The Width: ");
        double width1 = scanner.nextDouble();

        // this is the 1st option to put them by the setter
        r1.setLength(length1);
        r1.setWidth(width1);

        System.out.println("r1 Length: " + r1.getLength());
        System.out.println("r1 Width: " + r1.getWidth());
        System.out.println("r1 Perimeter: " + r1.getPerimeter());
        System.out.println("r1 Area " + r1.getArea());


        // this is the 2nd option to put them by the constructor
        Rectangle r2 = new Rectangle();

        System.out.println("Enter The Value Of The Length: ");
        double length2 = scanner.nextDouble();
        System.out.println("Enter The Value Of The Width: ");
        double width2 = scanner.nextDouble();
        
        r2 = new Rectangle(length2 , width2);

        System.out.println("r2 Length: " + r2.getLength());
        System.out.println("r2 Width: " + r2.getWidth());
        System.out.println("r2 Perimeter: " + r2.getPerimeter());
        System.out.println("r2 Area " + r2.getArea());
        scanner.close();

        
    }
}