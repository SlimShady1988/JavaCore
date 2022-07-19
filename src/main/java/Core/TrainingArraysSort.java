package Core;

import java.util.Arrays;

public class TrainingArraysSort {
    public static Integer[] getArr() {
        return new Integer[]{44, 22, 33, 32, 100, 11, 55, 61, 16};
    }

    public static Integer findBig(Integer[] array) {
        Integer max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static Integer findSmall(Integer[] array) {
        Integer min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    public static Integer findSmall2(Integer[] array) {
        Arrays.sort(array);

        return array[0];
    }

    public static Integer[] arrSort(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                int tmp = array[i];
                array[i] = array[index];
                array[index] = tmp;
            }
        }

        return array;
    }

    public static Integer[] arrSort2(Integer[] array) {
        Arrays.sort(array);

        return array;
    }

    public static Integer[] arrRSort(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    index = j;
                }
            }
            if (max != array[i]) {
                int tmp = array[i];
                array[i] = array[index];
                array[index] = tmp;
            }
        }

        return array;
    }

    public static Integer[] arrRevers(Integer[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int start = array[i];
            int end = array[array.length - 1 - i];
            array[i] = end;
            array[array.length - 1 - i] = start;
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println("Smaller number is - " + findSmall(getArr()));
        System.out.println("Smaller number is - " + findSmall2(getArr()));
        System.out.println("Biggest number is - " + findBig(getArr()));
        System.out.println("Simple Sorted Array - " + Arrays.toString(arrSort(getArr())));
        System.out.println("ASC Sorted Array - " + Arrays.toString(arrSort2(getArr())));
        System.out.println("DESC Sorted Array - " + Arrays.toString(arrRSort(getArr())));
        System.out.println("ARRAY IS  - " + Arrays.toString(getArr()));
        System.out.println("DESC Sorted Array  - " + Arrays.toString(arrRevers(getArr())));
    }


}
