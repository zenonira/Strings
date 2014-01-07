public class Test {
	private String [] scrambledWords;

	public Test(String[] wordArr) {
		scrambledWords = mixedWords(wordArr);
	}
   
	private String recombine(String word1, String word2) {
		return word1.substring(0, (word1.length()/2)) + word2.substring((word2.length()/2), word2.length());
	}

	private String[] mixedWords(String[] words) {
		String[] newArray = new String[0];
		String word1, word2;
		for (int i = 1; i < words.length-1; i = i + 2) {
			word1 = words[i-1];
			word2 = words[i];
		}
		return words;
	}
}