package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] mas1 = new int[]{-1, 2, 3};
        double[] mas2 = new double[]{7.654, -1.57, 9.986};
        char[] mas3 = new char[4];
        mas3[0] = 'a';
        mas3[1] = 'b';
        mas3[2] = 'c';
        mas3[3] = 'd';

        for (int i = 0; i < mas1.length - 1; i++) {
            System.out.print(mas1[i] + ", ");
        }
        System.out.print(mas1[mas1.length - 1] + "\n");
        for (int j = 0; j < mas2.length - 1; j++) {
            System.out.print(mas2[j] + ", ");
        }
        System.out.print(mas2[mas2.length - 1] + "\n");
        for (int k = 0; k < mas3.length - 1; k++) {
            System.out.print(mas3[k] + ", ");
        }
        System.out.print(mas3[mas3.length - 1] + "\n");

        System.out.println("*****Задание 3*******");

        for (int i = mas1.length - 1; i > 0; i--) {
            System.out.print(mas1[i] + ", ");
        }
        System.out.print(mas1[0] + "\n");
        for (int j = mas2.length - 1; j > 0; j--) {
            System.out.print(mas2[j] + ", ");
        }
        System.out.print(mas2[0] + "\n");
        for (int k = mas3.length - 1; k > 0; k--) {
            System.out.print(mas3[k] + ", ");
        }
        System.out.print(mas3[0] + "\n");

        System.out.println("*****Задание 4*******");
        for (int i = 0; i < mas1.length; i++) {
            if(mas1[i]%2!=0){
                mas1[i]+=1;
            }
            System.out.print(mas1[i] + " ");
        }
    }
}
