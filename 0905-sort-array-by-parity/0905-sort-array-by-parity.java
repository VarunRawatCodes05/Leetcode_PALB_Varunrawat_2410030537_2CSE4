class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;

        // Put even numbers first
        for (int x : nums) {
            if (x % 2 == 0)
                ans[i++] = x;
        }

        // Put odd numbers next
        for (int x : nums) {
            if (x % 2 != 0)
                ans[i++] = x;
        }

        return ans;
    }
}