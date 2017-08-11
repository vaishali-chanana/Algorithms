import java.util.ArrayList;
import java.util.List;

public class NumbersDisappeared {

	public static List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0; i<nums.length; i++){
        	int tmp = Math.abs(nums[i])-1;
        	if(nums[tmp] >0)
        		nums[tmp]= -nums[tmp];
        }
        
        List<Integer> ret = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
        	if(nums[i]>0)
        		ret.add(i+1);
        }
		return ret;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums).toString());
	}

}
