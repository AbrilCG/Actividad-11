package Shape;
import java.util.Scanner;
/**
 *@author LyrisseC
 */
public class Square implements Shape{

    @Override
    public double getArea() {
        Scanner sc = new Scanner(System.in);
        int la; 
        System.out.println("Dame el lado del cuadrado");
        la = sc.nextInt();
        double a = la*la;
        System.out.println("El area del cuadrado es de "+a);
        return a;
    }

    @Override
    public double getPerimeter() {
        Scanner sc = new Scanner(System.in);
        int la;
        System.out.println("Dame el lado del cuadrado");
        la = sc.nextInt();
        double p = la+la+la+la;
        System.out.println("El perimetro del cuadrado es de "+p);
        return p;
    }

    
}
