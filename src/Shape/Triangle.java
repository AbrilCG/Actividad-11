package Shape;
import java.util.Scanner;
/**
 *@author LyrisseC
 */
public class Triangle implements Shape{

    @Override
    public double getArea() {
        Scanner sc = new Scanner(System.in);
        int base;
        int altura;
        System.out.println("Dame la base del triangulo");
        base = sc.nextInt();
        System.out.println("Dame la altura del triangulo");
        altura = sc.nextInt();
        double a = base*altura/2;
        System.out.println("El area del triangulo es de "+a);
        return a;
    }

    @Override
    public double getPerimeter() {
        Scanner sc = new Scanner(System.in);
        int l;
        System.out.println("Dame el lado del triangulo");
        l = sc.nextInt();
        double p = l+l+l;
        System.out.println("El perimetro del trianfulo es de "+p);
        return p;
    }

    
}
