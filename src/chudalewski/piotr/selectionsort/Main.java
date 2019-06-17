package chudalewski.piotr.selectionsort;

public class Main {

    public static void main(String[] args) {


        int[] sortArray = {20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedIndex = sortArray.length - 1 ; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
            int largest = 0;

            for (int i= 1; i <= lastUnsortedIndex; i++) {
                if(sortArray[i] > sortArray[largest]) {
                    largest = i;
                }
            }

            swap(sortArray, largest, lastUnsortedIndex);
        }



        for (int i = 0; i < sortArray.length; i++) System.out.println(sortArray[i]);




    }

    public static void swap(int[] array, int i, int j) {
        if(i == j) return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;



    }

}
