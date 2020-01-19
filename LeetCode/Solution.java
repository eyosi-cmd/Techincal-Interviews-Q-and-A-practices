class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int [] twoS = {0, 0};
        for (int i = 0; i < nums.length - 1; i++) {
            sum = nums[i] + nums[i + 1];
            if (target == sum) {
                twoS[0] = i;
                twoS[1] = i + 1;
                return twoS;

            }

        }
        return twoS;

    }
    public static void main(String [] args) {
        int [] nums = {2, 7, 11, 15};
        int target = 18;
        Solution s = new Solution();
        for (int a :s.twoSum(nums, target))
                System.out.print(a + " ");
        System.out.println();

    }
}