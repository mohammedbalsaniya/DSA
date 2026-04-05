class BinarySearch{
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int target = 5;
    int low = 0;
    int lenght = arr.length;
    int mid = lenght / 2;

  while(mid <= length){

      if(target == arr[mid]){
        print("element found at " + arr[mid]);
      }
      if(target <= mid){
          lenght = mid-1;
      } else if(target >= mid){
          low = mid +1;
      }
  }
        
      function print(p){
         System.out.println(n);
      }
  }
}
