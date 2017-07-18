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
	    			System.out.println("Hi");
	    			charmap.put(c, i);
	    		}
	    	}
	    	
	    	for(String word:words){
	    		char first = word.charAt(0);
	    		System.out.println("First " + first);
	    		System.out.println("charmap "+charmap.get(first));
	    		int firstval = charmap.get(first);
	    		for (int j=1; j<word.length(); j++){
	    			if(charmap.get(word.charAt(j)) != firstval)
	    				break;
	    			outputList.add(word);
	    		}
	    	}
	    	String[] output = (String[]) outputList.toArray();
	        return output;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[]{"Hello","Alaska","Dad", "Piece"}; 
		System.out.println(Arrays.toString(findWords(str)));
	}

}
