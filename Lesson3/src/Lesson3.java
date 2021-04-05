import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        calculateSumOfDiagonalElements();
        countDevs(2);
        foobar(6);
        foobar(10);
        foobar(20);
        printMatrix();
        printPrimeNumbers();
    }

    private static void printArray() {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int array[] = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * sizeArray);
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

    public static int operation(int number) {
        if (number > 0) {
            ++number;
        } else if (number < 0) {
            number -= 2;
        } else {
            number = 10;
        }
        return number;
    }

    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void countDevs(int count) {
        if (count % 10 == 1) {
            System.out.println(count + " программист");
        }
        if ((count % 10 >= 2) && (count % 10 < 5)) {
            System.out.println(count + " программистa");
        }
        if ((4 < count % 10) || (count % 10 == 0)) {

            System.out.println(count + " программистов");
        }

    }

    public static void foobar(int number) {
        if ((number % 3 == 0) && (number % 5 != 0)) {
            System.out.println("foo");
        } else if ((number % 3 != 0) && (number % 5 == 0)) {
            System.out.println("bar");
        } else {
            System.out.println("foobar");
        }
    }

    public static void calculateSumOfDiagonalElements() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = scanner.nextInt();
        int matrix[][] = new int[num][num];
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(100);
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма " + sum);

    }

    public static void printMatrix() {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int matrix[][] = new int[firstNum][secondNum];
        for (int i = 0; i < firstNum; i++) {
            for (int j = 0; j < secondNum; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < firstNum; i++) {
            for (int j = 0; j < secondNum; j++) {
                if (matrix[i][j] % 3 == 0) {
                    System.out.print("+ ");
                } else if (matrix[i][j] % 7 == 0) {
                    System.out.print("- ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }


    }

    public static void printPrimeNumbers() {
            for (int i = 2; i < 1000; i++) {
                if (((i==2)||(i % 2 != 0)) && ((i==3)||(i % 3 != 0)) && ((i==5)||(i % 5 != 0)) && ((i==7)||(i % 7 != 0))) {
                    System.out.print(i + " ");
                }
            }
    }



}
