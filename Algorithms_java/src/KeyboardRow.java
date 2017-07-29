import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyboardRow {

	
	    public static String[] findWords(String[] words) {
	    	String[] line = new String[]{"qwertyuiop",
	    		"asdfghjkl","zxcvbnm"};
	    	List<String> outputList = new ArrayList<String>();
	    	char[] s;
	    	Map<Character,Integer> charmap = new HashMap<Character, Integer>();
	    	for(int i=0; i<line.length ; i++){
	    		for(char c: line[i].toCharArray()){
	    			charmap.put(c, i);
	    		}
	    	}
	    	
	    	for(String word:words){
	    		char first = Character.toLowerCase(word.charAt(0));
	    		int firstval = charmap.get(first);
	    		int j=0;
	    		/*if(word.length()==1)
	    			outputList.add(word);*/
	    		for (; j<word.length(); j++){
	    			if(charmap.get(Character.toLowerCase(word.charAt(j))) != firstval)
	    				break;
	    			if(j==word.length()-1)
	    				outputList.add(word);
	    		}
	    	}
	    	System.out.println("output list: "+outputList.toString());
	    	String[] output = (String[]) outputList.toArray(new String[0]);
	        return output;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[]{"Hello","Alaska","Dad", "Piece","a","b"}; 
		System.out.println(Arrays.toString(findWords(str)));
	}

}
