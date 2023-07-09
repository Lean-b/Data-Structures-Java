package com.lean;

public class TheArrays2D {
    public static void main(String[] args) {

        /*
         *Se declara y se inicializa un array bidimensional (2D) de tipo int llamado number.
         *Tiene una dimensión de tamaño 3 en el primer índice y una dimensión de tamaño 3 en el segundo índice.
         *En total, el array puede almacenar 3x3=9 elementos enteros.
         * */
        int[][] number = new int[3][3];

        number[0][0] = 21;
        number[1][0] = 1;
        number[2][0] = 2;
        number[0][1] = 55;
        number[1][1] = 12;
        number[2][1] = 10;
        number[0][2] = 11;
        number[1][2] = 99;
        number[2][2] = 22;

        System.out.println(number[0][0]);
        System.out.println(number[1][0]);
        System.out.println(number[2][0]);

        System.out.println();

        // Itera sobre el array
        for (int[] ints : number) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }

        System.out.println();

        // Itera sobre el array utilizando un for clasico
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length ; j++) {
                System.out.println(number[i][j]);
            }
        }


    }
}
