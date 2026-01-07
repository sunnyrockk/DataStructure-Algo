package array;

public class reversArray {
  public static void main(String[] args) {
    int[] arr = { 5, 78, 90, 5, 6, 5, 4, 8 };
    int n = arr.length;
    int i = 2, j = n - 3;
    // for (i = 0; i < n / 2; i++) {
    // int temp = arr[i];
    // arr[i] = arr[n - 1 - i];
    // arr[n - 1 - i] = temp;
    // }
    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;

      i++;
      j--;
    }
    for (int ele : arr)
      System.out.print(ele + " ");
  }
}
