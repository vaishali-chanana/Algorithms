
public class MaxConsecutive {

	public static int findMaxConsecutiveOnes(int[] nums) {
        int ret=0,ans=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0)
                ans++;
            else{
                ret = Math.max(ret, ans);
                ans = 0;
            }
        }
        return Math.max(ret, ans);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,0,1,1,1,0,1,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}

}
