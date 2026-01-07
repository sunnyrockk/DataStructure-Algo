package array;

public class towSum {
  public static void main(String[] args) {
    System.out.println("Tow sum");
  }

  public static boolean TwoSum(int arr[], int target) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i + n; j++) {
        if (arr[i] + arr[j] == target)
          return true;
      }
    }
    return false;
  }
}
