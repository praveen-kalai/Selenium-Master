package basicPgm;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class InbuildSort {
	
    private static void sortArrayElementsByFrequency(int[] inputArray)
    {
        //Create LinkedHashMap with elements as keys and their occurrences as values
        //Remember LinkedHashMap maintains insertion order of elements
         
        Map<Integer, Integer> elementCountMap = new LinkedHashMap<>();
         
        //Check presence of each element in elementCountMap 
         
        for (int i = 0; i < inputArray.length; i++) 
        {
            if (elementCountMap.containsKey(inputArray[i]))
            {
                //If element is present in elementCountMap, increment its value by 1
                 
                elementCountMap.put(inputArray[i], elementCountMap.get(inputArray[i])+1);
            }
            else
            {
                //If element is not present, insert this element with 1 as its value
                 
                elementCountMap.put(inputArray[i], 1);
            }
        }
         
        //Construct an ArrayList holding all Entry objects of elementCountMap
         
        ArrayList<Entry<Integer, Integer>> listOfEntry = new ArrayList<>(elementCountMap.entrySet());
         
        //Sort listOfEntry based on values
        System.out.println(listOfEntry);
         
        Collections.sort(listOfEntry, new Comparator<Entry<Integer, Integer>>() 
                                        {
                                            @Override
                                            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) 
                                            {
                                            	System.out.println(o2.getValue()+""+(o1.getValue()));
                                                return o2.getValue().compareTo(o1.getValue());
                                            }
                                        }
        );
         
        //Print sorted array elements in descending order of their frequency
         
        System.out.println("Input Array : "+Arrays.toString(inputArray));
         
        System.out.println("Sorted Array Elements In Descending Order Of Their Frequency :");
         
        System.out.print("[ ");
         
        for (Entry<Integer, Integer> entry : listOfEntry) 
        {
            int frequency = entry.getValue();
             
            while (frequency >= 1)
            {
                System.out.print(entry.getKey()+" ");
                 
                frequency--;
            }
        }
         
        System.out.print("]");
    }
	public static void main(String[] args) {
		Integer arr[]= {4,6,7,8,3};
		
		Arrays.sort(arr,Collections.reverseOrder());
		List<Integer> arr1 = Arrays.asList(arr);
		System.out.println(arr1);
		 sortArrayElementsByFrequency(new int[] {7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3});
	}

}
