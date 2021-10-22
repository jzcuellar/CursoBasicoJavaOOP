public class MetodoMath {
    public static void main(String[] args) {
        //*** METODO MATH */
        var n1=3;
        var n2=2;
        var numero = Math.pow(n1,n2); //Elevar un Numero
        System.out.println(numero);
        var raiz = Math.sqrt(5); //Raiz Cuadrada
        System.out.println(raiz);
        var n = 3.14;
        System.out.println(Math.round(n)); //Redondear
        System.out.println(Math.floor(n)); //Redondear hacia abajo
        System.out.println(Math.ceil(n)); //Redondear hacia arriba

        //*** IMPRIMIR FORMATO F F-FORMAT */
        System.out.printf("El numero %d Elevado a la %d es: %.2f",n1,n2,numero);

    }
    
}
