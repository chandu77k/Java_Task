package collection_task;

import java.util.*;

public class MainTest {
	public static void main(String[] args) {
		System.out.println("User Sessions : ");
	Map<String,CustomSession> map=new HashMap<String,CustomSession>();
	map.put("1",new CustomSession("Chandu", " Java"," 12345"));
	map.put("2",new CustomSession("Dhanush", " Python"," 12345"));
	map.put("3",new CustomSession("Jagadeesh", " C++"," 12345"));
	map.put("4",new CustomSession("Venkat", " Data Structure"," 12345"));
	
	Iterator<Map.Entry< String, CustomSession>> iterator = map.entrySet().iterator();
    while(iterator.hasNext())
    {
    	Map.Entry<String, CustomSession> entry = iterator.next();
    	
    	if (entry.getKey().equals("2")) {
            iterator.remove();
        }
        if (entry.getKey().equals("3")) {
            map.put("3", new CustomSession("Raju", "C++", " 54321"));
        }	
        
    }
    for (Map.Entry<String, CustomSession> entry : map.entrySet()) {
        System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    }
    
  }

}
