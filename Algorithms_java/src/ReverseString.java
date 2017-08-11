
public class ReverseString {

	public static String reverseString(String s) {
		StringBuilder strBdr = new StringBuilder();
		for(int i =s.length(); i>0; i--){
			strBdr.append(s.charAt(i-1));
		}
		return strBdr.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(reverseString("hello my name"));
	}

}
