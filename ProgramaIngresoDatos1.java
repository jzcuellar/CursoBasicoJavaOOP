import java.util.Scanner; //#1
public class ProgramaIngresoDatos1 {
    public static void main(String[] args) { //#2
        Scanner consola = new Scanner(System.in);//#3 -> Instanciamos el Objeto
        System.out.println("Ingresa nombre por favor"); //#6
        var nombre = consola.nextLine(); //#4
        System.out.println("Ingresa su edad");
        var edad = consola.nextInt(); //#5
        System.out.println("Bienvenido "+nombre+" Tienes "+edad+" anos");
    }
}

//#1 Clase .Scanner me permite solicitar datos por consola
//#2 Metodo Main es el metodo principal para trabajar en Java  "public static void main(String[] args)"
//#3 Declaramos la variable conosla de tipo Scanner para usar todos los metodos y funciones de la clase (Clase Scanner) En este caso new Scanner es el Metodo
//#3 Instanciamos el objeto esto solo se debe hacer 1 vez
//#4 consola.nextLine (consola -> Ejecuta metodo Scanner) .nextLine es metodo del objeto consola que -> lee toda la linea
//#5 consola.nextInt (consola -> Ejecuta metodo Scanner) .nextInt es metodo del objeto consola que -> lee todo el entero
//#6 Como el Input en Python