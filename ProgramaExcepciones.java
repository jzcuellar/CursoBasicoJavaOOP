import java.util.Scanner;

import org.graalvm.compiler.asm.aarch64.AArch64Assembler.SystemHint;
public class ProgramaExcepciones {
    public static void main(String[] args) {
        //** ESTA ESTRUCTURA TRY-CATCH LA EMPLEAMOS PARA EVITAR DATOS ERRONEOS POR PARTE DEL USUARIO*/
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        try{ //Que intente estas instrucciones
            var numero = consola.nextInt();
            System.out.println(numero);
        }catch(Exception e){ //Instrucciones que debe ejecutar si hay un error
            System.out.println("Ingreso un valor no valido");
        }finally{
            System.out.println("Adios!"); //Instrucciones que se ejecutan simpre si no hay error o si hay error
        }
    }
}

//Este tipo de estructura de control se utiliza mucho cuando estoy solicitando datos al usuario