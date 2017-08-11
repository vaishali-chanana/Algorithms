
public class DetectCapitalUse {

	public static boolean detectCapitalUse(String word) {
        return (word.equals(word.toLowerCase()) || word.equals(word.toUpperCase()) ||
               Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase()));
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(detectCapitalUse("USA"));
		System.out.println(detectCapitalUse("FlaG"));
	}

}
