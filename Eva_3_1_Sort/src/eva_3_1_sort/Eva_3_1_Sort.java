/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_3_1_sort;

import java.util.Scanner;

/**
 *
 * @author Alán
 */
public class Eva_3_1_Sort {

    /**
     * @param args the command line arguments
     */
    static int cont = 0;

    public static void main(String[] args) {
        // TODO code application logic here
        int[] Ar = new int[10];
        for (int i = 0; i < Ar.length; i++) {
            Ar[i] = (int) (Math.random() * 100);

        }
        imprimir(Ar);
        quickSort(Ar, 0, Ar.length-1);//bubbleSort(Ar);//InsertionSort(Ar);//SelectionSort(Ar);
        imprimir(Ar);
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor a Buscar");
        int val = sc.nextInt();
        int Resu = binarySearch(Ar, val);
        System.out.println(Resu);
        System.out.println(cont);
        Resu=linerSearch(Ar, val);
        System.out.println(Resu);
    }

    public static void imprimir(int[] Arr) {
        for (int i : Arr) {
            System.out.print("[" + i + "]");
        }
        System.out.println("");
    }

    public static void SelectionSort(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            int min = i; //Siempre el primer elemento es el mas pequeño
            for (int j = i + 1; j < Arr.length; j++) {
                if (Arr[j] < Arr[min]) {
                    min = j;
                }
            }
            int Temp = Arr[i];
            Arr[i] = Arr[min];
            Arr[min] = Temp;
        }
    }

    public static int[] InsertionSort(int[] Arr) {

        int temp;
        for (int i = 1; i < Arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (Arr[j] < Arr[j - 1]) {
                    temp = Arr[j];
                    Arr[j] = Arr[j - 1];
                    Arr[j - 1] = temp;
                }
            }
        }
        return Arr;
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements  
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
// pick the pivot
        int middle = low + (high - low) / 2;
        int pivote = arr[middle];
// make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivote) {
                i++;
            }
            while (arr[j] > pivote) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
// recursively sort two sub parts
        if (low < j) {
            quickSort(arr, low, j);
        }
        if (high > i) {
            quickSort(arr, i, high);
        }
    }

    public static int binarySearch(int arreglo[], int ValBus) {
        return binSearch(arreglo, ValBus, 0, arreglo.length - 1);
    }

    private static int binSearch(int arreglo[], int ValBus, int Lo, int Hi) {
        cont++;
        int pos = -1;
        int Mid = Lo + ((Hi - Lo) / 2);
        if (Lo <= Hi) {
            if (ValBus == arreglo[Mid]) {
                pos = Mid;
            } else if (ValBus > arreglo[Mid]) {
                pos = binSearch(arreglo, ValBus, Mid + 1, Hi);
            } else if (ValBus < arreglo[Mid]) {
                pos = binSearch(arreglo, ValBus, Lo, Mid - 1);
            }
        }
        return pos;
    }
      public static int linerSearch(int[] arr, int pos){
         
        int tam = arr.length;
        for(int i=0;i<tam;i++){
            if(arr[i] == pos){
                return i;
            }
        }
        return -1;
    }
     
}
