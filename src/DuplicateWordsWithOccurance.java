import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordsWithOccurance {

	public static void main(String[] args) {
		
		String input = "In this post, I have collected some of the frequently In In In asked java interview programs on strings. I hope it will be helpful to you guys.";
		String[] wordList = input.split("\\s");
		Map<String, Long> wordCount = new HashMap<>();
		for(String word:wordList) {
			if(wordCount.containsKey(word)) {
				wordCount.put(word,wordCount.get(word)+1L );
			}else {
				wordCount.put(word,1L );
			}
			
		}
		//wordCount=Arrays.stream(wordList).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(wordCount);
	}

}
