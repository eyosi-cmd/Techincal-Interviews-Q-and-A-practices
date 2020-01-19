import java.util.*;
public class maxSpan {
public int maxSpan1(int[] nums) {
  int leftmost = 1;
  int rightmost = 1;
  if (nums.length == 0)
    return 0;

  for (int i = 1; i < nums.length - 1; i++) {
    if (nums[0] <= nums[i+ 1]) {
      leftmost++;
    }
  }
  for (int i = nums.length - 1; 0 < i; i--) {
    if (nums[nums.length - 1] <= nums[i - 1]) {
      rightmost++;
    }
  }

  if (rightmost > leftmost) {
    leftmost = rightmost;
  }
  return leftmost;
}
    public static void main(String [] args) {
      int[] nums = {1, 4, 2, 1, 4, 1, 4};
         maxSpan obj = new  maxSpan();
        System.out.println(obj.maxSpan1(nums));

}
}