package array;

public class secondMaximum {
  public static void main(String[] args) {
    int[] arr = { 4, 10, 10, 6, 3, 8, 9 };

    int max = Integer.MIN_VALUE;
    int smax = Integer.MIN_VALUE;
    // calculate max
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max)
        max = arr[i];
    }
    // calculate smax
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > smax && arr[i] != max)
        smax = arr[i];
    }
    System.out.println(smax);
  }
}
