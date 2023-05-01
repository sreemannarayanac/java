import java.lang.*;

class Q10 {
  public static void main(String[] args) {

    int[] arr = { 1, 2, 3, 4, 5 };
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < arr.length; i++) {
      sb.append(arr[i]);
    }

    String str = sb.toString();
    System.out.println(str);
  }
}