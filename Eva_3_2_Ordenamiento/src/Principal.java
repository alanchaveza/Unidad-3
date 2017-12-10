/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alán
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arA[]= new int [10];
        int arB[]= new int [50];
        int arC[]= new int [100];
        int arD[]= new int [500];
        int arE[] = new int[1000];
        int arF[]= new int [5000];
        int arG[]= new int [10000];
        int arH[]= new int [100000];
        int arI[]= new int [1000000];
      
        System.out.println("Selection");
        for (int i = 0; i < 10; i++) {
            llenar(arA);
            long in=System.nanoTime();
            SelectionSort(arA);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("Insertion");
        for (int i = 0; i < 10; i++) {
            llenar(arA);
            long in=System.nanoTime();
            InsertionSort(arA);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("BubbleSort");
         for (int i = 0; i < 10; i++) {
            llenar(arA);
            long in=System.nanoTime();
             bubbleSort(arA);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("QuickSort");
        for (int i = 0; i < 10; i++) {
            llenar(arA);
            long in=System.nanoTime();
            quickSort(arA, 0, arA.length-1);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("Selection");
        for (int i = 0; i < 10; i++) {
            llenar(arB);
            long in=System.nanoTime();
            SelectionSort(arB);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("Insertion");
        for (int i = 0; i < 10; i++) {
            llenar(arB);
            long in=System.nanoTime();
            InsertionSort(arB);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("BubbleSort");
         for (int i = 0; i < 10; i++) {
            llenar(arB);
            long in=System.nanoTime();
             bubbleSort(arB);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("QuickSort");
        for (int i = 0; i < 10; i++) {
            llenar(arC);
            long in=System.nanoTime();
            quickSort(arC, 0, arB.length-1);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("Selection");
        for (int i = 0; i < 10; i++) {
            llenar(arC);
            long in=System.nanoTime();
            SelectionSort(arC);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("Insertion");
        for (int i = 0; i < 10; i++) {
            llenar(arC);
            long in=System.nanoTime();
            InsertionSort(arC);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("BubbleSort");
         for (int i = 0; i < 10; i++) {
            llenar(arC);
            long in=System.nanoTime();
             bubbleSort(arC);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("QuickSort");
        for (int i = 0; i < 10; i++) {
            llenar(arC);
            long in=System.nanoTime();
            quickSort(arC, 0, arC.length-1);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("Selection");
        for (int i = 0; i < 10; i++) {
            llenar(arD);
            long in=System.nanoTime();
            SelectionSort(arD);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("Insertion");
        for (int i = 0; i < 10; i++) {
            llenar(arD);
            long in=System.nanoTime();
            InsertionSort(arD);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("BubbleSort");
         for (int i = 0; i < 10; i++) {
            llenar(arD);
            long in=System.nanoTime();
             bubbleSort(arD);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("QuickSort");
        for (int i = 0; i < 10; i++) {
            llenar(arD);
            long in=System.nanoTime();
            quickSort(arD, 0, arD.length-1);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("Selection");
        for (int i = 0; i < 10; i++) {
            llenar(arE);
            long in=System.nanoTime();
            SelectionSort(arE);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("Insertion");
        for (int i = 0; i < 10; i++) {
            llenar(arE);
            long in=System.nanoTime();
            InsertionSort(arE);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("BubbleSort");
         for (int i = 0; i < 10; i++) {
            llenar(arE);
            long in=System.nanoTime();
             bubbleSort(arE);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("QuickSort");
        for (int i = 0; i < 10; i++) {
            llenar(arE);
            long in=System.nanoTime();
            quickSort(arE, 0, arE.length-1);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("Selection");
        for (int i = 0; i < 10; i++) {
            llenar(arF);
            long in=System.nanoTime();
            SelectionSort(arF);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("Insertion");
        for (int i = 0; i < 10; i++) {
            llenar(arF);
            long in=System.nanoTime();
            InsertionSort(arF);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("BubbleSort");
         for (int i = 0; i < 10; i++) {
            llenar(arF);
            long in=System.nanoTime();
             bubbleSort(arF);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("QuickSort");
        for (int i = 0; i < 10; i++) {
            llenar(arF);
            long in=System.nanoTime();
            quickSort(arF, 0, arF.length-1);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("Selection");
        for (int i = 0; i < 10; i++) {
            llenar(arG);
            long in=System.nanoTime();
            SelectionSort(arG);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("Insertion");
        for (int i = 0; i < 10; i++) {
            llenar(arG);
            long in=System.nanoTime();
            InsertionSort(arG);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("BubbleSort");
         for (int i = 0; i < 10; i++) {
            llenar(arG);
            long in=System.nanoTime();
             bubbleSort(arG);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("QuickSort");
        for (int i = 0; i < 10; i++) {
            llenar(arG);
            long in=System.nanoTime();
            quickSort(arG, 0, arG.length-1);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("Selection");
        for (int i = 0; i < 10; i++) {
            llenar(arH);
            long in=System.nanoTime();
            SelectionSort(arH);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("Insertion");
        for (int i = 0; i < 10; i++) {
            llenar(arH);
            long in=System.nanoTime();
            InsertionSort(arH);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("BubbleSort");
         for (int i = 0; i < 10; i++) {
            llenar(arH);
            long in=System.nanoTime();
             bubbleSort(arH);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("QuickSort");
        for (int i = 0; i < 10; i++) {
            llenar(arH);
            long in=System.nanoTime();
            quickSort(arH, 0, arH.length-1);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("Selection");
        for (int i = 0; i < 10; i++) {
            llenar(arI);
            long in=System.nanoTime();
            SelectionSort(arI);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("Insertion");
        for (int i = 0; i < 10; i++) {
            llenar(arI);
            long in=System.nanoTime();
            InsertionSort(arI);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("BubbleSort");
         for (int i = 0; i < 10; i++) {
            llenar(arI);
            long in=System.nanoTime();
             bubbleSort(arI);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
        System.out.println("QuickSort");
        for (int i = 0; i < 10; i++) {
            llenar(arI);
            long in=System.nanoTime();
            quickSort(arI, 0, arI.length-1);
            long fin=System.nanoTime();
            long sum = fin-in;
            System.out.println(sum);
        }
// TODO code application logic here
    }

    public static void llenar(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 100) + 1;
        }
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
        int pivot = arr[middle];
// make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
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

}
