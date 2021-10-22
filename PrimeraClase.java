public class PrimeraClase {
    public static void main(String args[]) {
        //**** TIPOS DE DATOS VER NOTION ***/
        // int miNumero1=4; // int -> variable Entera
        // Double valor=3.2; // Double -> Variable Decimal
        // String nombre="Jefferzon"; // String -> Variable Tipo String
        // var miDato="Informacion"; // var -> la Variable asume cualquier Tipo de dato
        // var entero=38;
        // System.out.println(valor+entero);
        // System.out.println(nombre+(valor+entero));
        // System.out.println(miDato+valor+entero);

        //** CARACTERES ESPECIALES */
        // var saludo="Bienvenida";
        // System.out.println("Salto de linea \n"+saludo);
        // System.out.println("Tabulador \t"+saludo);
        // System.out.println("Retroceso \b"+saludo);
        // System.out.println("Retroceso:\b\b\b"+saludo);
        // System.out.println("Comilla Simple \'" + saludo + "'");
        // System.out.println("Comilla Doble \"" + saludo + "\"");

        //** CONVERTIR TIPOS DE DATOS */
        var numero="20";
        var edad=Integer.parseInt(numero);     //Convertir String a Int
        var valor=Double.parseDouble("3.14");  //Convertir String a decimal Double
        var valorTexto=String.valueOf(10);     //Convertir de Int a String
        var caracter="saludo".charAt(3);       //Trae el caracter en la posicion indicada en el indice 
        System.out.println(edad);
        System.out.println(valor);
        System.out.println(valorTexto);
        System.out.println(caracter);
    }
}
