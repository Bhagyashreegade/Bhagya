package xyz.company;

public class Chapter_16_Sorting {


    public static void printArray(int arr []) {

  for (int i=0; i<arr.length; i++){
      System.out.println(arr[i]+ " ");
  }
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};

        //Bubble Sort // sorting in ascending order

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
      printArray(arr);
    }
}




