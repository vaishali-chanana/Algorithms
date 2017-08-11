import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<String>();
		for(int i=1; i<=n; i++){
			if(i%3==0 || i%5==0){
				if(i%5!=0)
					list.add("Fizz");
				else if(i%3!=0)
					list.add("Buzz");
				else
					list.add("FizzBuzz");
			}else
				list.add(Integer.toString(i));
		}
		return list;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fizzBuzz(3).toString());
	}

}
