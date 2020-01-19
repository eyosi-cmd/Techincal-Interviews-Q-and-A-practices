import java.util.*;
public class sortNonDuplicates {

public int[] sort(int[] a) {
 // int [] srt = new int[a.length];
  List<Integer> list = new ArrayList<>();
  if (a.length == 0)
    return a;
  for (int i = 0; i < a.length; i++) {
    if (i == 0) {
          list.add(a[i]);
          continue;
    }
    if (!list.contains(a[i]))
        list.add(a[i]);
  }
  int [] results = new int[list.size()];
  for (int i = 0; i < list.size(); i++) {
      results[i] = list.get(i);
  }

  return results;
}
public static void main(String [] args) {
      int[] nums = {1, 2, 3};
         sortNonDuplicates  obj = new  sortNonDuplicates();
         for (int a: obj.sort(nums))
            System.out.print(a + " ");
        System.out.println();
}
}
