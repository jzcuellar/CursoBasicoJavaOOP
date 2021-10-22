//Imprimir un cuadro de Texto en Java

import javax.swing.*; 
public class ProgramaIngresoDatos2 {
    public static void main(String[] args) { //Clase principal
        String mensaje = "Ingrese su nombre", texto; //Declaramos variable mensaje
        texto = JOptionPane.showInputDialog(null,mensaje); //JOptionPane Objeto con la funcion .showInputDialog que me permite invocar un cuadro de Texto
        System.out.println(texto); //Imprimirmos cuadro de texto en pantalla
    }
}
