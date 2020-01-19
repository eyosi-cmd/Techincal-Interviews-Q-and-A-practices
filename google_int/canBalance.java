import java.util.*;
public class canBalance {
public boolean solution(int[] nums) {
  int n = nums.length;
//  int i = 0;
  boolean check = false;
//  int j = n - 1;
  int sum1 = 0, sum2 = 0;
     if (n == 2 && nums[0] == nums[1])
        return true;
    for (int j = n;  0 < j; j--) {
      if (j != 1)
          sum2 += nums[j - 1];
      for (int i = 1; i <= n; i++) {

       if (sum1 != 0 && sum2 != 0 && sum1 == sum2)
         check = true;
        if(i != n)
          sum1 += nums[i - 1];


        }


    }
  return check;
}

    public static void main(String [] args) {
      int[] nums = {2, 1, 1, 2, 1};
         canBalance obj = new canBalance();
        System.out.println(obj.solution(nums));

}
}

