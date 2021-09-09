import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = {0, 3, 5, 7, 13, 15, 20};
        System.out.println(returnNum(nums));

        int yearStart = 2005;
        int yearEnd = 2030;
        System.out.println(returnLeapYear(yearStart, yearEnd));
        System.out.println(toBinary(5));

        int[] duplicate = {5, 10, 5, 3, 10, 10, 1};
        System.out.println(Arrays.toString(returnDuplicateNumbers(duplicate)));


        int[] arr = {-1, 2, 5, 10, -3, -11};
        System.out.println(Arrays.toString(returnPositiveNum(arr)));

        int[] v = {0, 2, 2};
        int[] m = {1, 3};
        System.out.println(Arrays.toString(returnSortedArray(v, m)));
    }

    //    Реализуйте функцию, которая для данного массива целых чисел (int) возвращает значение наиболее близкое к 10.
//    Если существует два одинаково близких значения (например, 8 и 12), считайте больше значение более близким.
    public static int returnNum(int[] num) {
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
    public static int returnLeapYear(int yearStart, int yearEnd) {
        for (int i = yearStart; i <= yearEnd; i++) {
            if (i % 4 == 0) {
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
    public static int[] returnSortedArray(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) return null;
        if (arr1 == null) return arr2.clone();
        if (arr2 == null) return arr1.clone();

        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, r = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[r] = arr1[i];
                i++;
            } else {
                result[r] = arr2[j];
                j++;
            }
            r++;
        }
        if (i < arr1.length) {
            System.arraycopy(arr1, i, result, r, (arr1.length - i));
        }
        if (j < arr2.length) {
            System.arraycopy(arr2, j, result, r, (arr2.length - j));
        }
        return result;
    }

    //    3. Дан массив целых чисел. Написать функцию, возвращающую массив всех неуникальных значений исходного массива. Пример:
//   {5, 10, 5, 3, 10, 10, 1}->{5, 10, 5, 10, 10}
    public static int[] returnDuplicateNumbers(int[] d) {
        int numSize = 0;
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++)
                if (d[i] == d[j]) {
                    numSize++;
                }
        }

        int[] duplicateNum = new int[numSize];
        int j = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i] == d[j]) {
                d[i] = d[j];

            }
        }
        return duplicateNum;
    }

    //    4. Реализуйте функцию, возвращающую двоичное представление числа n(n>=0). Например, 101 - это двоичное представление
//числа. Метод должен иметь сигнатуру String toBinary(int number)
    public static String toBinary(int number) {
        if (number == 0) return null;
        String str = Integer.toBinaryString(number);
        return str;
    }

    //    5. Реализуйте функцию, которая для данного массива возвращает массив только положительных чисел,
//отсортированных по возрастанию.
    public static int[] returnPositiveNum(int[] f) {
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
        Arrays.parallelSort(num);
        return num;
    }
}
