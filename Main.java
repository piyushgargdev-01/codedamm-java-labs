import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String args[]) {
    int[] arr = new int[] { 1, 1, 1, 2, 3, 2, 4, 4, 5, 6 };
    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < arr.length; i++) {
      set.add(arr[i]);
    }

    System.out.println(set);
  }
}
