class BinarySearch{
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int target = 5;
    int lenght = arr.length;
    int mid = lenght / 2;
    if(target == arr[mid]) {
        System.out.println("Element found at index: " + mid);
    } else if (target < arr[mid]) {
        for (int i = 0; i < mid; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
    } else {
        for (int i = mid + 1; i < lenght; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
    }
  }
}