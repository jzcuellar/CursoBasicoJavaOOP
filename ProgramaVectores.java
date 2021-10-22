import jdk.javadoc.internal.tool.Main;

public class ProgramaVectores {
    public static void main(String[] args) {
        //Forma 1 de Declarar un Vector o Array 
        int vector[] = new int [3];
        vector[0]=1;
        vector[1]=2;
        vector[2]=3;

        //Forma 2 de Declarar un Vector o Array
        String vectorTexto[] = {"Casa","Perro","Carro"};

        //Recorre un Vector
        System.out.println("Recorre un Vector");
        for (int i=0; i<vector.length; i++){
            System.out.print(vector[i]+" ");
        }
        System.out.println("");

        //Declarar Matriz
        int matriz[][]= new int [3][2]; //Primera parte son las filas [3], segunda parte son las columnas [2]

        //2 Forma de Declarar Matriz
        int matriz2[][]= {{1,2},{2,3},{3,4}};

        //Recorrer Matriz
        System.out.println("Recorre un Vector Bidimensional -> Matriz");
        for (var i=0; i<matriz2.length; i++){
            for(var j=0; j<matriz2[i].length; j++){
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println("");
        }

    }

    public abstract class Figura{
        //--ATRIBUTO
        private String tipo;

        //--CONSTRUCTOR
        public Figura(String tipo){
            this.tipo = tipo;
        }

        //--METODOS
        
        //--METODO ABSTRACTO SOLO SE DECLARA, PARA SER POSTERIORMENTE HEREDADO
        public abstract void dibujar();

        //--Getter and Setter
        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

    }
}

// Debo tener el tipo de datos que voy a almacenar en un vector, no puedo tener enteros con String

// println -> Imprime con salto de linea
// print -> Imprime al lado sin salto de linea