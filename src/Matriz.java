import java.util.Scanner;

public class Matriz {
    public static int[][] matriz;
    public static int filas;
    public static int columnas;
    //constructor
    public Matriz(int filas, int columnas) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa la cantidad de filas: ");
        filas=sc.nextInt();
        this.filas=filas;
        System.out.println("Ingresa la cantidad de columnas: ");
        columnas=sc.nextInt();
        this.columnas=columnas;
        this.matriz = new int[filas][columnas];
    }
    public double valores( int filas, int columnas){
        String opcion;
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Deseas crear una matriz aleatoria?");
        opcion=sc.nextLine();
        if(opcion.equalsIgnoreCase("si")) {
            for (int f = 0; f < matriz.length; f++) {
                for (int c = 0; c < matriz[f].length; c++) {
                    matriz[f][c] = (int) (Math.random() * 20 + 1);
                }
            }
        } else if (opcion.equalsIgnoreCase("no")) {
            for (int f = 0; f < matriz.length; f++) {
                for (int c = 0; c < matriz[f].length; c++) {
                    System.out.print("Ingresa los numeros de la matriz: ");
                    matriz[f][c] = sc.nextInt();
                }
            }
        }
        return matriz[filas][columnas];

    }

    public static int[][] getMatriz() {
        return matriz;
    }
    public static int getFilas() {
        return filas;
    }
    public static int getColumnas() {
        return columnas;
    }
}
