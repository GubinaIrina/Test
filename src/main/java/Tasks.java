import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Tasks {
    public static void main(String[] args) {

    }

    //    Реализуйте функцию, которая для данного массива целых чисел (int) возвращает значение наиболее близкое к 10.
//    Если существует два одинаково близких значения (например, 8 и 12), считайте больше значение более близким.
    public int returnNum(int[] num) {
        int a = 0;
        int diff = Math.abs(10 - num[a]);
        for (int i = 0; i < num.length; i++) {
            int temp = Math.abs(10 - num[i]);
            if (diff > temp) {
                diff = temp;
                a = i;
            }
            if (diff == temp) {
                if (num[a] < num[i]) {
                    a = i;
                }
            }
        }
        return num[a];
    }

    //    1. Вывести все високосные годы из диапазона
    public int returnLeapYear(int yearStart, int yearEnd) {
        for (int i = yearStart; i <= yearEnd; i++) {
            if (i % 4 == 0 && i % 100 != 0) {
                System.out.print(i);
                if (i != yearEnd) {
                    System.out.print(",");
                }
            } else if (i % 400 == 0) {
                System.out.print(i);
                if (i != yearEnd) {
                    System.out.print(",");
                }
            }
        }
        return yearStart;
    }


    // 2. Даны два массива целых чисел, отсортированных по возрастанию {0, 2, 2} и {1, 3}. Надо объединить их в один, чтобы на
//   выходе получился массив, отсортированный так же по возрастанию: {0, 1, 2, 2, 3}.
    public int[] returnSortedArray(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) return null;
        if (arr1 == null) return arr2;
        if (arr2 == null) return arr1;

        int[] result = new int[arr1.length + arr2.length];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
            count++;
        }
        for (int j = 0; j < arr2.length; j++) {
            result[count++] = arr2[j];
        }
        Arrays.parallelSort(result);
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
        return result;
    }

    //    3. Дан массив целых чисел. Написать функцию, возвращающую массив всех неуникальных значений исходного массива.
    //    Пример:  {5, 10, 5, 3, 10, 10, 1}->{5, 10, 5, 10, 10}
    public int[] returnDuplicateNumbers(int[] d) {
        int[] duplicateNum = new int[]{};
        int numSize = 0;
        for (int i = 0; i < d.length; i++) {
            for (int j = i + 1; j < d.length; j++)
                if (d[i] == d[j]) {
                    duplicateNum[numSize] = d[i];
                    numSize++;
                }

        }

        for (int i = 0; i < duplicateNum.length; i++)
            System.out.print(duplicateNum[i] + " ");
        return duplicateNum;
    }

    //    4. Реализуйте функцию, возвращающую двоичное представление числа n(n>=0). Например, 101 - это двоичное представление
//числа. Метод должен иметь сигнатуру String toBinary(int number)
    public String toBinary(int number) {
        if (number == 0) return null;
        String str = Integer.toBinaryString(number);
        return str;
    }

    //    5. Реализуйте функцию, которая для данного массива возвращает массив только положительных чисел,
//отсортированных по возрастанию.
    public int[] returnPositiveNum(int[] f) {
        int total = 0;
        for (int i = 0; i < f.length; i++) {
            if (f[i] > 0) {
                total++;
            }
        }
        int[] num = new int[total];
        int j = 0;
        for (int i = 0; i < f.length; i++) {
            if (f[i] > 0) {
                num[j] = f[i];
                j++;
            }
        }
// TODO: parallelSort разбивает массив на подмассивы, сортирует и объединяет обратно,
//  его удобно использовать в больших массивах
        Arrays.parallelSort(num);
        for (int i = 0; i < num.length; i++)
            System.out.print(num[i] + " ");
        return num;
    }

    //    6  Реализовать функция принимающую на вход 3 значения типа int (a b c), возвращать сумму квадратов наибольших из них
    public int returnSum(int a, int b, int c) {
        int sum;
        if (a < b && a < c) {
            sum = b * b + c * c;
        } else if (b < a && b < c) {
            sum = a * a + c * c;
        } else {
            sum = a * a + b * b;
        }
        return sum;
    }

    // Дан массив целых чисел, реализовать функцию которая возвращает значения кратным 3, рез вывести в консоль, реализовать проверки
    public int[] numBrieflyThree(int[] number) {
        if (number == null) {
            return null;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        for (int num : number) {
            if (num != 0 && num % 3 == 0) {
                temp.add(num);
            }

        }

        return returnMass(temp);

    }

    private int[] returnMass(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }



}
