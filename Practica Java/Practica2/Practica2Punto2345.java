import java.text.BreakIterator;
import java.util.Scanner;
public class Practica2Punto2345 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int opcion = mostrarMenu();
        switch(opcion){
            case 1:
            areaCirculo();
            break;
            case 2:
            areaTriangulo();
            break;
            case 3:
            areaCuadrado();
            break;
            case 4:
            decimalBinario();
            break;
            case 5:
            factorialNum();
            break;
            case 6:
            tipoTriangulo();
            break;
            case 7:
            salir();
            break;
            default:
            System.out.println("Opcion Invalida");
            salir();
            break;
        }

    }

    public static int mostrarMenu() {
        Scanner consola = new Scanner(System.in);
        String menuOpciones[] = {"Area del círculo", "Area del triángulo", "Area de un cuadrado","Convertir decimal a Binario","Factorial de un numero","Conocer tipo de triangulo","Salir"};
        System.out.println("BIENVENIDO AL PROGRAMA DE CALCULADORA PRACTICA 2 (Puntos 2,3,4,5)");
        for(int i=0; i<menuOpciones.length;i++){
            System.out.printf("%d. %s\n",i+1,menuOpciones[i]);
        }
        System.out.println("Seleccione una Opcion: ");
        int opcionSelect = consola.nextInt();
        return opcionSelect;
    }

    public static void areaCirculo() {
        Scanner consola = new Scanner(System.in);
        System.out.println("Cual es el radio de la circunferencia?: ");
        var radioCirculo = Double.parseDouble(consola.nextLine());
        var area = Math.PI * Math.pow(radioCirculo,2);
        System.out.printf("El Area de la circunferencia con radio %.2f es: %.2f\n",radioCirculo,area);
        salir();
    }

    public static void areaTriangulo() {
        Scanner consola = new Scanner(System.in);
        System.out.println("Cual es el tamaño de la base del triangulo?: ");
        var baseT = Double.parseDouble(consola.nextLine());
        
        System.out.println("Cual es el tamaño de la altura del triangulo?: ");
        var alturaT = Double.parseDouble(consola.nextLine());

        var area = (baseT*alturaT)/2;
        System.out.printf("El Area del triangulo base: %.2f altura: %.2f es => %.2f\n",baseT,alturaT,area);
        salir();
    }

    public static void areaCuadrado() {
        Scanner consola = new Scanner(System.in);
        System.out.println("Cual es el tamaño del lado del cuadrado?: ");
        var ladoC = Double.parseDouble(consola.nextLine());
        
        var area = Math.pow(ladoC,2);
        System.out.printf("El Area del cuadrado de lado %.2f es => %.2f\n",ladoC,area);
        salir();
    }

    public static void decimalBinario() {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa un numero decimal: ");
        var decimal = Integer.parseInt(consola.nextLine());
        String numbinario = convertirDecimalABinarioManual(decimal);
        System.out.printf("El numero %d en binario es: %s",decimal,numbinario);
    }    

    public static String convertirDecimalABinarioManual(long decimal) {
        //Mas info https://parzibyte.me/blog/2019/04/18/decimal-a-binario-java/
        if (decimal <= 0) {
            return "0";
        }
        StringBuilder binario = new StringBuilder(); //StringBuilder es para insertar el dígito binario al inicio de la cadena.
        while (decimal > 0) {
            short residuo = (short) (decimal % 2);
            decimal = decimal / 2;
            // Insertar el dígito al inicio de la cadena
            binario.insert(0, String.valueOf(residuo));
        }
        return binario.toString();
    }

    public static void factorialNum() {
        Scanner consola = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        var numero = Double.parseDouble(consola.nextLine());

        double factorial = 1;
        while(numero!=0){
            factorial=factorial*numero;
            numero--;
        }
        System.out.printf("El factorial es %.0f",factorial);
    }

    public static void tipoTriangulo() {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese longitud lado a: ");
        var ladoA = Double.parseDouble(consola.nextLine());
        System.out.println("Ingrese longitud lado b: ");
        var ladoB = Double.parseDouble(consola.nextLine());
        System.out.println("Ingrese longitud lado c: ");
        var ladoC = Double.parseDouble(consola.nextLine());

        if(ladoA==ladoB && ladoB==ladoC){
            System.out.println("El triangulo ingresado es Equilatero (Tiene todos los lados iguales)");
        }else if(ladoA==ladoB || ladoB==ladoC || ladoA==ladoC){
            System.out.println("El triangulo ingresado es Isosceles (Tiene dos lados iguales)");
        }else if(ladoA!=ladoB && ladoB!=ladoC && ladoA!=ladoC){
            System.out.println("El triangulo ingresado es Escaleno (Tiene todos los lados diferente)");
        }

    }
    
    public static void salir() {
        System.out.println("Adios! Gracias por utilizar el programa");
    }
}