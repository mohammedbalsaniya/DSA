public class InsertionSort {
  public static void main(String[] args) {
      int arr[] = {4, 6, 8, 3, 1, 0, 9, 5};
      for (int i = 1; i< arr.length; i++) {
        int last = arr[i];

        for(int j =0; j<i; j++){

          if(arr[j]> last){

            int temp = arr[j];
            arr[j] = last;
            arr[i] = temp;
            last = temp;
          }

        }
      }
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }

  }
}
