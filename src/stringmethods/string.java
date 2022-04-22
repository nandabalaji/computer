package stringmethods;

public class string {
public static void main(String[] args) {
	 String s="beast trailer today";
	 
	 int a= s.length();
	 System.out.println("lenght of string:"+a);
	 
	char b= s.charAt(4);
	System.out.println("character at given position:"+b); 
	
	int c=s.indexOf("t");
	System.out.println("index of t:"+c);
	
	boolean d= s.equals("today");
	System.out.println("result is same:"+d);
	
	boolean e =s.isEmpty();
	System.out.println("empty:"+e);
	
	String f = s.trim();
	System.out.println("tri:"+f);
	
	String replace = s.replace("today", "evenning");
	System.out.println(replace);
	
	boolean startsWith = s.startsWith("beast");
	System.out.println(startsWith);
	
    boolean contains = s.contains("be");
    System.out.println(contains);
    
    boolean equalsIgnoreCase = s.equalsIgnoreCase("beast trailer TODAY");
    System.out.println(equalsIgnoreCase);
    String substring = s.substring(0, 5);
    System.out.println(substring);
    
    String[] split = s.split("trailer "
    		+ "");
    for (int i = 0; i < split.length; i++) {
    	System.out.println(split[i]);
    	
    	
    	
    	
    	
		
	}
    
    
    
   
    
    
	
	
	
	
	
	
	 
	
	
	 
	
	
	
	
	
}
	
	
	
	
	

}
