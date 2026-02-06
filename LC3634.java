import java.util.Arrays;

class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int l = 1;
        int max= nums[0];
        int min = nums[0];
        int i =0, j =0;
        while(j<n){
            min =nums [i];
            max= nums[j];
            while(i<j && max>(long)k*min){
                i++;
                min=nums[i];
            }
            l= Math.max(l,j-i+1);
            j++;
        }
        return n-l;
    }
}
class LC3634{
    public static void main(String[] args) {
        Solution sc = new Solution();
        int[] arr = {1,6,2,9};
        int k=2;
        int res = sc.minRemoval(arr, k); 
        System.out.println(res);
    }
}