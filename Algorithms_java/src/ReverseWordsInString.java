
public class ReverseWordsInString {

    public static String reverseWords(String s) {
    	String[] strArr = s.split(" ");
    	StringBuilder retStr = new StringBuilder();
    	for(String str: strArr){
			int len = str.length();
    		for(; len>0;len--){
    			System.out.println(str.charAt(len-1));
    			retStr.append(Character.toString(str.charAt(len-1)));
    		}
    		retStr.append(" ");
    	}
    	//retStr.deleteCharAt(retStr.length()-1);
        return retStr.toString().trim();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}

}
