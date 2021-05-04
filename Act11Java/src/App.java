import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Saca menú
        System.out.println("Hello, World!");
        System.out.println("Ingrese operacion");
        System.out.println("A. Area");
        System.out.println("B. Perimetro");
        //Se genera el scanner que va a capturar el/los valores
        Scanner sc = new Scanner(System.in);
        String opcionOperacion = sc.next();
        //Declara los objetos
        Square cuadro = new Square();
        Rectangle recto = new Rectangle();
        Triangle trio = new Triangle();

        switch(opcionOperacion){
            case "A":
            //Caso de Area
            System.out.println("Ingrese figura a analizar");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Triangulo");
            String opcionOperacionA = sc.next();
                switch(opcionOperacionA){
                    case "1":
                    //Caso de cuadrado
                    System.out.println("Ingrese base");
                    double baseCuadrado = sc.nextDouble();
                    System.out.println("Ingrese altura");
                    double alturaCuadrado = sc.nextDouble();
                    System.out.println("El área de tu cuadrado es");
                    System.out.println(cuadro.getArea(baseCuadrado, alturaCuadrado));
                    break;
                    case "2":
                    //Caso de Rectángulo
                    System.out.println("Ingrese base");
                    double baseRectangulo = sc.nextDouble();
                    System.out.println("Ingrese altura");
                    double alturaRectangulo = sc.nextDouble();
                    System.out.println("El área de tu cuadrado es");
                    System.out.println(recto.getArea(baseRectangulo, alturaRectangulo));
                    break;
                    case "3":
                    //Caso de Triángulo
                    System.out.println("Ingrese base");
                    double baseTri = sc.nextDouble();
                    System.out.println("Ingrese altura");
                    double alturaTri = sc.nextDouble();
                    System.out.println("El área de tu cuadrado es");
                    System.out.println(trio.getArea(baseTri, alturaTri));
                    break;
                    default:
                    System.out.println("Ingresa un valor válido");
                }

            break;
            case "B":
            //Caso de Perimetro
            System.out.println("Ingrese figura a analizar");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Triangulo");
            String opcionOperacionB = sc.next();
                switch(opcionOperacionB){
                    case "1":
                    //Caso de cuadrado
                    System.out.println("Ingrese lado 1");
                    double lado1Cuadrado = sc.nextDouble();
                    System.out.println("Ingrese lado 2");
                    double lado2Cuadrado = sc.nextDouble();
                    System.out.println("El perimetro de tu cuadrado es");
                    System.out.println(cuadro.getPerimeter(lado1Cuadrado, lado2Cuadrado));
                    break;
                    case "2":
                    //Caso de Rectángulo
                    System.out.println("Ingrese lado 1");
                    double lado1Rectangulo = sc.nextDouble();
                    System.out.println("Ingrese lado 2");
                    double lado2Rectangulo = sc.nextDouble();
                    System.out.println("El perimetro de tu rectangulo es");
                    System.out.println(recto.getPerimeter(lado1Rectangulo
                    , lado2Rectangulo));
                    break;
                    case "3":
                    //Caso de Triángulo
                    System.out.println("Ingrese lado 1");
                    double lado1Tri = sc.nextDouble();
                    System.out.println("Ingrese lado 2");
                    double lado2Tri = sc.nextDouble();
                    System.out.println("El perimetro de tu triangulo es");
                    System.out.println(trio.getPerimeter(lado1Tri, lado2Tri));
                    break;
                    default:
                    System.out.println("Ingresa un valor válido");
                }
            break;
            default:
                System.out.println("Ingresa un valor válido");
                sc.close();
        }
        
        
    }
}
