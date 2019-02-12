import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReturnValueFromTryCatchFinally
{
    public static void main(String[] args)
    {
    	Map<String, List<String>> people = new HashMap<>();
    	people.put("John", Arrays.asList("555-1123", "555-3389"));
    	people.put("Mary", Arrays.asList("555-2243", "555-5264"));
    	people.put("Steve", Arrays.asList("555-6654", "555-3242"));
    	 
    	List<String> phones = people.values().stream().flatMap(x->x.stream()).collect(Collectors.toList());
    	  
    	System.out.println(phones);
       // System.out.println(methodReturningValue());    //Output : 10
    }
    static int methodReturningValue()
    {
        try
        {
        	System.out.println("try block");
            return 10;    //control will not be passed to main() method here
        }
        catch (Exception e)
        {
            return 20;    //Control will not be passed to main() method here
        }
        finally
        {
            System.out.println("finally block is always executed");
            return 30;
            //Control will be passed to main() method after executing this block
        }
    }
}