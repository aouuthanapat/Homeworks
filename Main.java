// здесь я смог только написать код для суммы данного массива, а как убирать из суммы n я так и не понял //
package com.company;
public class Main {
    public static void main(String[] args) {
        int myArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println(sum);
    }
}

 //Дан некоторый массив, суть задания инвертировать его. Снизу еще приведен пример со словами //
package com.company;
public class Main {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        for (int i = 0; i < intArray.length;i++){
            System.out.print(intArray[i ]);
        }

        int n = intArray.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = intArray[n - i - 1];
            intArray[n - i - 1] = intArray[i];
            intArray[i]=temp;
        }
        System.out.println();
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
        }
    }
}
//Дан некоторый массив, суть задания инвертировать его. Со словами//
package com.company;
public class Main {
    public static void main(String[] args) {
        String mas[] = {" Hello", " my", " name", " is", " Daniil"};
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
        }
        int n = mas.length;

        for(int i = 0; i < n / 2; i++) {
            String temp = mas[n - i - 1];
            mas[n - i - 1] = mas[i];
        }
        System.out.println();
        for(int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
        }
    }
}

// Суть задания найти сумму всех четных чисел в последовательности Фибоначчи, до
//определенного индекса "n". Я тут сам сделал ряд Фибоначчи, а как через n я не понял//
package com.company;
public class Main {
    public static void main(String[] args) {
        int a[] = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int even_sum=0;
        for (int i=0; i<a.length; ++i) {
            if (a[i]%2==0){
                even_sum=even_sum+ a[i];
            }
        }
        System.out.println("sum of even numbers: " + even_sum);
    }
}


//Дан некоторый двумерный массив. Нужно определить является ли он нижней
//треугольной матрицей или же нет. Я смог написать код, который делает матрицу, а как понять верхняя она или нет не знаю//
package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a[][] = new int[3][3], i, j;
        System.out.println("Enter Matrix element: ");
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Enter number [" + i + "][" + j + "]");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is...");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// Даны две квадратные матрицы. Необходимо написать программу которая посчитает их
//сумму и разности. Смог только сумму//
package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a[][] = new int[3][3], i, j, summa = 0, summi = 0;
        System.out.println("Enter Matrix element: ");
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Enter number [" + i + "][" + j + "]");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is...");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (i == j) {
                    summa = summa + a[i][j];
                }
                if (i + j == 3 - 1) {
                    summi = summi + a[i][j];
                }
            }
            System.out.println("Sum of main diagonal = " +summa+ "Sum of min diagonal = "+summi);
        }
    }
}

