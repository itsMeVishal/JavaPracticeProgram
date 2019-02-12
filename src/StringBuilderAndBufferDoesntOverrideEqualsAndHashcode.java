import java.util.HashMap;

public class StringBuilderAndBufferDoesntOverrideEqualsAndHashcode {

	public static void main(String[] args) {
		
		HashMap<StringBuilder, String> map = new HashMap<>();
		StringBuilder key1= new StringBuilder("key");
		StringBuilder key2= new StringBuilder("key");
		map.put(key1, "vishal");
		map.put(key2, "vishal");
		System.out.println(map);
		System.out.println(key1.hashCode()+" "+key2.hashCode());
	}
}
