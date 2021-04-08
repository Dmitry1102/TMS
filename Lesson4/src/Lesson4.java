import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Random random = new Random();
        array();
        System.out.println("----------------------------------------------------");
        divisionAmeba();
        System.out.println("----------------------------------------------------");
        System.out.println(summ(11, 3));
        System.out.println("----------------------------------------------------");
        stringleMatrix();
        System.out.println("----------------------------------------------------");
        number(-6644457);
        System.out.println("----------------------------------------------------");
        maxElement();
        System.out.println("----------------------------------------------------");
        zeroArray();
        System.out.println("----------------------------------------------------");
        int array[] = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        changeElement(array);
        System.out.println("----------------------------------------------------");
        sameElements();
        System.out.println("----------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int mtr[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mtr[i][j] = random.nextInt(50);
                System.out.print(mtr[i][j]+ " ");
            }
            System.out.println();
        }
        transparentMatrix(mtr);


    }

    private static void array() {
        Random random = new Random();
        int mas[] = new int[100];
        int len = 0;
        String s ="";
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(100);
            if (mas[i] % 2 != 0) {
                len++;
            }
        }


        System.out.print(s);
        System.out.println();
        for (int j = len ; j > 0 ; j--) {
       //     System.out.print(tmp[j]+ " ");
        }
        System.out.println();
    }

    private static void transparentMatrix(int a[][]) {
        System.out.println();
        int tmp;
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < i ; j++) {
                tmp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = tmp;
            }
        }
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length ; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }

    private static void sameElements() {
        Random random = new Random();
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ((arr[i] == arr[j])) {
                    count++;
                    System.out.print(arr[j] + " ");
                }
            }
        }
        if (count == 0){
            System.out.println("Нет повторяющихся");
        }
        System.out.println();
    }


    private static void changeElement(int a[]) {
        int max = 0;
        int temp;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if (max <= a[i]) {
                max = a[i];
            }
        }
        System.out.println();
        temp = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                a[i] = temp;
            }
            a[0] = max;
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


    private static void zeroArray() {
        Random random = new Random();
        int mas[] = new int[20];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(20);
            System.out.print(mas[i] + " ");
            if (i % 2 != 0) {
                mas[i] = 0;
            }

        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    private static void maxElement() {
        Random random = new Random();
        int mas[] = new int[12];
        int max = 0;
        int pos = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(15);
            System.out.print(mas[i] + " ");
            if (max <= mas[i]) {
                max = mas[i];
                pos = i;

            }

        }
        System.out.println("Максмальный элемент: " + max + " eго позиция: " + pos);

    }


    private static void number(int a) {
        int count = 0;
        int num = a;
        if (a > 0) {
            while (a != 0) {
                count++;
                a /= 10;
            }
            System.out.println(num + " - это положительное число, количество цифр: " + count);

        } else if (a < 0) {
            while (a != 0) {
                count++;
                a /= 10;
            }
            System.out.println(num + " - это отрицательное число, количество цифр: " + count);
        } else {
            System.out.println("0, количество цифр: 1");
        }

    }

    private static void stringleMatrix() {
        int matrix[][] = new int[4][4];

        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static int summ(int a, int b) {
        int multiple = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                multiple++;
            }
        }
        return multiple;
    }

    private static void divisionAmeba() {
        int ameba = 1;
        for (int i = 3; i <= 24; i += 3) {
            ameba *= 2;
            System.out.println("Количество aмеб: " + ameba + " через: " + i + " часа");
        }
    }


}
