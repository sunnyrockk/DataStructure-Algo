package array;

public class productInArray {
  public static void main(String[] args) {
    int[] arr = { 8, 2, 1, 8 };
    int product = 1;

    for (int i = 0; i < arr.length; i++) {
      product *= arr[i];
    }
    System.out.println(product);
  }
}
