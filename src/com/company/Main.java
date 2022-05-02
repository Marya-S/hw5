package com.company;

import java.util.Arrays;

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
            if (mas1[i] % 2 != 0) {
                mas1[i] += 1;
            }
            System.out.print(mas1[i] + " ");
        }
        System.out.print("\n");
        System.out.println("*****Задание 5*******");
        int[][] matrix = new int[3][3];
        for (int row = 0; row <= matrix.length - 1; row++) {
            for (int col = 0; col <= matrix.length - 1; col++) {
                if (row == col || Math.abs(row - col) == 2) {
                    matrix[row][col] = 1;
                } else {
                    matrix[row][col] = 0;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println("*****Задание 6*******");
        int[] mas4 = new int[]{5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(mas4));
        int[] mas5 = new int[5];
        int num = 0;
        for (int elem = mas4.length - 1; elem >= 0; elem--) {
            mas5[num] = mas4[elem];
            num++;
        }
        System.out.println(Arrays.toString(mas5));
        System.out.println("*****Задание 7*******");
        int[] mas6 = new int[]{5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(mas6));
        int num1 = 0;
        for (int elem = mas6.length - 1; elem >= 0; elem--) {
            if (elem > num1) {
                int temp = mas6[num1];
                mas6[num1] = mas6[elem];
                mas6[elem] = temp;
                num1++;
            }
        }
        System.out.println(Arrays.toString(mas6));
        System.out.println("*****Задание 8/9*******");
        int[] mas7 = new int[]{-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(mas7);
        int item = 0;
        while (mas7[item] < 0) {
            for (int j = item + 1; j < mas7.length; j++) {
                if (mas7[item] + mas7[j] == -2) {
                    System.out.println(mas7[item] + " и " + mas7[j]);
                }
            }
            item++;
        }

        System.out.println("*****Урок 6");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        System.out.println("*****Задание 1*****");
        int sum = 0;
        for (int weed : arr) {
            sum += weed;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("*****Задание 2*****");
        int max=arr[0];
        int min=arr[0];
        for (int weed : arr) {
            if(max<weed){
                max=weed;
            }
            if(min>weed){
                min=weed;
            }
        }
        System.out.println("Максимальная трата: "+ max + " ,минимальная трата: "+min);
        System.out.println("*****Задание 3*****");
        double avg = 0L;
        int day =0;
        for (int weed : arr) {
            day++;
            avg += weed;
        }
        System.out.println("Сумма трат за месяц составила " + avg/day + " рублей");
        System.out.println("*****Задание 4*****");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int k=reverseFullName.length-1; k>=0;k--){
            System.out.print(reverseFullName[k]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}
