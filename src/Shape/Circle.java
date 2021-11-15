package Shape;
import java.util.Scanner;
/**
 *@author LyrisseC
 */
public class Circle implements Shape{

    @Override
    public double getArea() {
        Scanner sc = new Scanner(System.in);
        int radio; 
        System.out.println("Dame el radio del circulo");
        radio = sc.nextInt();
        double a = 3.1416*radio*radio;
        System.out.println("El area del circulo es de "+a);
        return a;
    }

    @Override
    public double getPerimeter() {
        Scanner sc = new Scanner(System.in);
        int radio;
        System.out.println("Dame el radio del circulo");
        radio = sc.nextInt();
        double p = 2*3.1416*radio;
        System.out.println("El perimetro del circulo es de "+p);
        return p;
    }
    
}
