import java.util.Scanner;
public class Practica2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa nombre a consultar: ");
        String nombreConsulta = consola.nextLine(); 
        validarNombre(nombreConsulta);
    }

    public static void validarNombre(String nombreConsulta) {
        String vectorNombres[]={"ana","paola","juan","camilo"};
        var contador=0;
        for(int i=0; i<vectorNombres.length; i++){
            if(vectorNombres[i].equals(nombreConsulta)){
                contador++;//Lo mismo que escribir contador=contador+1
            }
        }
        if(contador>0){
            System.out.println("El nombre esta en la base de datos");
            validarEdad(nombreConsulta);
        }else{
            System.out.println("El nombre NO esta en la base de datos");
        }
    }

    public static void validarEdad(String nombreConsulta) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Cual es tu edad: ");
        int edad = consola.nextInt(); 
        if(edad>=18){
            System.out.printf("Hola %s tienes %d y Eres Mayor de Edad",nombreConsulta,edad);
        }
    }
}
