
public class ReshapeMatrix {

	 public static int[][] matrixReshape(int[][] nums, int r, int c) {
		 if(nums.length*nums[0].length != r*c)
			 return nums;
		 else{
			 int ctr =0,i,j ;
			 int[][] retarr = new int[r][c];
			 for(i=0; i<nums.length;i++)
				 for(j=0;j<nums[0].length; j++){
					 System.out.println("counter " + ctr);
					 retarr[ctr/c][ctr%c] = nums[i][j];
					 ctr++;
				 }
			 return retarr;
		 }      
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = {{1,2,3,4}};
		int[][] ret = matrixReshape(nums, 2, 2);
		for(int i=0;i<ret.length; i++)
			for(int j=0; j<ret[0].length; j++)
				System.out.println(i +" "+j+" "+ret[i][j] );
				

	}

}
