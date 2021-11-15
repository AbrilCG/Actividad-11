package Shape;
import java.util.Scanner;
/**
 *@author LyrisseC
 */
public class Principal {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int op;
    System.out.println("--------------------------------------------------------------");
    System.out.println("Bienvenido");
    System.out.println("Seleccionar la figura.");
    System.out.println("1. Circulo");
    System.out.println("2. Triangulo");
    System.out.println("3. Cuadrado");
    System.out.println("Escribe una de las opciones");
    op = sc.nextInt();
    System.out.println("--------------------------------------------------------------");
        switch (op) {
                case 1:
                    System.out.println("Seleccionaste la opcion 1 Circulo");
                    int opc;
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Selecciona que quieres hacer");
                    System.out.println("1. Calculare Area");
                    System.out.println("2. Calcular Perimetro");
                    opc = sc.nextInt();
                    System.out.println("--------------------------------------------------------------");
                    switch (opc){
                        case 1: 
                        System.out.println("Seleccionaste la opcion 1: Calcular Area");
                        Circle a = new Circle();
                        a.getArea();
                        break;
                        case 2:
                        System.out.println("Seleccionaste la opcion 2: Calcular Perimetro");
                        Circle b = new Circle();
                        b.getPerimeter();
                        break;
                    }
                break;

                case 2:
                    System.out.println("Seleccionaste la opcion 2 Triangulo");
                    int opci;
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Selecciona que quieres hacer");
                    System.out.println("1. Calculare Area");
                    System.out.println("2. Calcular Perimetro");
                    opci = sc.nextInt();
                    System.out.println("--------------------------------------------------------------");
                    switch (opci){
                        case 1: 
                        System.out.println("Seleccionaste la opcion 1: Calcular Area");  
                        Triangle c = new Triangle();
                        c.getArea();
                        break;
                        case 2:
                        System.out.println("Seleccionaste la opcion 2: Calcular Perimetro");
                        Triangle d = new Triangle();
                        d.getPerimeter();
                        break;
                    }
                break;

                case 3:
                    System.out.println("Seleccionaste la opcion 3 Cuadrado");
                    int opcio;
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Seleccion que quieres hacer");
                    System.out.println("1. Calculare Area");
                    System.out.println("2. Calcular Perimetro");
                    opcio = sc.nextInt();
                    System.out.println("--------------------------------------------------------------");
                    switch (opcio){
                        case 1: 
                        System.out.println("Seleccionaste la opcion 1: Calcular Area");  
                        Square e = new Square();
                        e.getArea();
                        break;
                        case 2:
                        System.out.println("Seleccionaste la opcion 2: Calcular Perimetro");
                        Square f = new Square();
                        f.getPerimeter();
                        break;
                    }
                break;            
        }
    }
}
            
