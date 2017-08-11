import java.util.HashMap;

public class LongestSubstring {

	public static int lengthOfLongestSubstring(String s) {
		int ctr = 0;
		for (int i=0; i<s.length(); i++){
			HashMap<Character,Integer> map = new HashMap<Character,Integer>();
			map.put(s.charAt(i), 1);
			//ctr=1;
			System.out.println("map details"+map.toString());
			int ctr_inner = 1;
			for(int j=i+1;j<s.length();j++){
				if(map.containsKey(s.charAt(j)))
					break;
				ctr_inner++;
				map.put(s.charAt(j), 1);
				System.out.println("Map"+map.toString());
			}
			System.out.println("ctr "+ctr);
			System.out.println("ctr_inner "+ctr_inner);
			if(ctr_inner > ctr)
				ctr = ctr_inner;
		}
        return ctr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}

}
