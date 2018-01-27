package class_practice.bubleSortAdvanced;

import java.util.ArrayList;
import java.util.List;

public class BubleSortAdvanced {
            public static void main(String[] args) {

            int sortare[] = new int[]{5,65,13,90,14,120,78};

                List<Integer>arrayList = new ArrayList<>();

                for (int i = 0; i <sortare.length; i++){
                    arrayList.add(sortare[i]);
                }

                long startCollections = System.currentTimeMillis();

                long endCollections = System.currentTimeMillis();

            System.out.println("Array-ul pana la sortare");
            for (int i = 0; i < sortare.length; i++){
                System.out.print(sortare[i]+ " ");
            }

            //soratrea prin algoritmul Bubble Sort

            bubleSort(sortare);

            System.out.println("\nArray-ul dupa sortare");
            for (int i = 0; i < sortare.length; i++) {
                System.out.print(sortare[i] + " ");
            }
        }

        public static void bubleSort(int[] sortare){
            int n = sortare.length;
            int temp = 0;

            for (int i = 0; i < n; i++){
                for (int j = 1; j < n; j++){
                    if (sortare[j-1] > sortare[j]){
                        //
                        temp = sortare[j-1];
                        sortare[j-1] = sortare[j];
                        sortare[j] = temp;
                    }
                }
            }
        }
    }


