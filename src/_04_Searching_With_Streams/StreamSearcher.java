package _04_Searching_With_Streams;

import java.util.Arrays;
import java.util.function.Consumer;

public class StreamSearcher {
    /*
     * Use stream methods to return the number of times a string appears
     * in the array of strings.
     *
     * The filter() and count() stream methods may be useful here.
     */
    public long containsCount(String[] strArr, String strToCount) {
    	//System.out.println(strToCount);
     long count  =  Arrays.stream(strArr).filter(t -> t.equals(strToCount)).count();
    		 return count;
    }
}
