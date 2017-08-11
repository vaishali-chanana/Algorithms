public class IslandPerimeter {

	public static int islandPerimeter(int[][] grid) {
		int ret =0;
		for(int i=0; i<grid.length; i++)
			for(int j=0; j<grid[0].length; j++){
				System.out.println("Matrix value: " +i+" "+j);
				if(grid[i][j]==1){
					ret = ret+4;
					if((j-1)>=0 && grid[i][j-1]==1)
						ret--;
					if((j+1)<grid[0].length && grid[i][j+1]==1)
						ret--;
					if((i-1)>=0 && grid[i-1][j]==1)
						ret--;
					if((i+1)<grid.length && grid[i+1][j]==1)
						ret--;
				System.out.println("ret now :"+ret);
				}
			}
        return ret;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grid[][] = {{0,1,0,0},
		                {1,1,1,0},
		                {0,1,0,0},
		                {1,1,0,0}}; 
		System.out.println(islandPerimeter(grid));
	}

}
