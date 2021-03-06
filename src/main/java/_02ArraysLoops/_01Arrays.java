package _02ArraysLoops;

import java.util.Arrays;

public class _01Arrays {

    public static void main(String[] args) {

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        //arr1[3] = 4;   // runtime hatasi
        //arr3[3] = 4;   // compiler hatasi (cünkü arr3 tanimlanmadi)

        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[]{10,11,12};
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {21,22,23};
        System.out.println(Arrays.toString(arr3));

        int[][] arr2dim = {
                            {1,2,3},
                            {4,5},
                            {6}
                          };

        System.out.println(arr2dim[0][0]);
        System.out.println(arr2dim[1][1]);
        System.out.println(arr2dim[2][2]);   // out of bounds hatasi

        int [][] arr2dim2 = new int[3][3];

        arr2dim2[0][0] = 1;
        arr2dim2[0][1] = 2;
        arr2dim2[0][2] = 3;
        arr2dim2[1][0] = 4;
        arr2dim2[1][1] = 5;
        arr2dim2[2][0] = 6;

        System.out.println("x : " + arr2dim2[2][2]);
    }
}
