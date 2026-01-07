package array;

public class SrechInArray { // lenearSearch
  public static void main(String[] args) {
    int[] arr = { 2, 4, 4, 3, 6, 7, 8, 9, 8 };
    int target = 7;
    int found = -1; // TARGET ARRAY MIAN NAHI HAI
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {

        found = -1; // TARGET ARRAY MAIN HAI
        break;
      }
    }
    if (found != -1)
      System.out.println("target is not exist in array");
    else
      System.out.println("Target misssing in array");
  }
}