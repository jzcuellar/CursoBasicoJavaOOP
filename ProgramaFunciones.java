public class ProgramaFunciones {
    public static void main(String[] args) {
        //** #0 PROGRAMA PRINCIPAL */
        saludo();
        int a = 4;
        int b = 6;
        int c = suma(a, b);
        System.out.println("El resultado de la suma es: "+c);
        System.out.println("El resultado de la sumna es: "+suma(a, b));

        if(mayor(a)){
            System.out.printf("El numero %d es mayor a 0",a);
        }else{
            System.out.println("El numero %d es menor a 0",a);
        }
    }

    public static void saludo() {
        //** #1 FUNCION 1 Bienvenida */
        System.out.println("Bienvenido");
    }

    public static int suma(int numero1, int numero2) {
        //** #2 FUNCION 2 SUMA */
        return (numero1+numero2);
    }

    public static boolean mayor(int num) {
        //** #3 FUNCION 3 DEVUELVE UN BOOLENANO */
        if (num>0){
            return true;
        }else{
            return false;
        }
        //Tambien se puede hacer de la siguiente Forma
        // return (a>0);
    }
}

// #0  Programa Pricipal
// - public -> Siempre va a ser publica
// - static -> Estatico, pero que es una funcion de la clase principal
// - void -> Es una funcion que no retorna nada 

// #1 Funcion 1 
// Creo mi funcion (Para Saludar) fuera del metodo principal - Funciones Se pueden colocar antes o despues

// #2 Funcion 2 Suma
// Me permite ingresar parametros, En la funcion debo definir el tipo de dato de entrada del parametro
// En la definicion de la funcion int -> Implica que la funcion devuelve un valor entero 

// #3 Funcion 3 Devuelve un Boooleano
// Se puede hacer con condicional o directamente como se muestra en el ejemplo solo con return y la evaluacion