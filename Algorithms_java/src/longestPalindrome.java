
public class longestPalindrome {

	public static String longestPalindrome(String s) {
		String ret = "";
		for(int i=0; i<s.length()-1; i++){
			for(int j=i; j<=s.length(); j++){
				StringBuilder str = new StringBuilder();
				System.out.println("Value of i "+i);
				System.out.println("Value of j "+j);
				str.append(s.substring(i, j));
				str = str.reverse();
				System.out.println("substring "+s.substring(i,j));
				System.out.println("reverse " + str.toString());
				//if(s.substring(i, j)==str.toString())
					//System.out.println("Shit happens");
				String substr = s.substring(i,j);
				if(substr.equals(str.toString()) && substr.length()>ret.length())
					ret = s.substring(i,j);
			}
		}
		return ret;
    }
	
	public static String longestPanlindrome2(String s){
		int start=0, end=0;
		for(int i=0; i<s.length(); i++){
			int len1 = checkforCenter(s,i,i);
			int len2 = checkforCenter(s,i,i+1);
			int len = Math.max(len1, len2);
			System.out.println(i);
			if(len > end-start+1){
				start = i-((len-1)/2);
				end = i+len/2;
				System.out.println("start: "+start);
				System.out.println("end: "+end);
			}
			
		}
		return s.substring(start, end+1);
		
	}

	public static int checkforCenter(String s, int left, int right){
		int L = left;
		int R = right;
		
		while(L>=0 && R<s.length() && s.charAt(L)==s.charAt(R)){
			L--;
			R++;
		}
		return R-L-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPanlindrome2("babad"));

	}

}
