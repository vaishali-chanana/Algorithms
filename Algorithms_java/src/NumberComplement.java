
public class NumberComplement {

	public static int findComplement(int num) {
//        int i;
//        for(i=0; i<32; i++){
//            if(num < Math.pow(2,i)){
//                break;
//            }
//        }
//        num = ~num;
//        System.out.println("ha: "+num);
//        num = num << i;
//        System.out.println("A: " +num);
//        num = num >> i;
//        System.out.println("B: "+num);
//        return num;
		int i = 0;
        int j = 0;
        
        while (i < num)
        {
            i += Math.pow(2, j);
            j++;
        }
        System.out.println(i);
        return i - num;
    }    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findComplement(5));
	}
	
	

}
