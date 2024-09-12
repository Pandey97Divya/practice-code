package javapractice1.java1;
import java.util.*;

public class StringCode {
	public static void main(String args[]) {
		String str="Software Testing";
		str= str.toLowerCase();
		str= str.replaceAll("[^a-z]","");
		HashMap <Character,Integer> obj1= new HashMap<Character,Integer>();
		for (int i=0;i<str.length();i++) {
			if (obj1.containsKey(str.charAt(i))) {
				int count= obj1.get(str.charAt(i));
				obj1.put(str.charAt(i),++count);
			}
			else {
				obj1.put(str.charAt(i), 1);
			}			
		}
		System.out.println(obj1);
		
		String str1= "Divya Pandey Divya Pandey Divya Pandey Software Testing Software Testing Software Testing";
		str1= str1.toLowerCase();
		String[] str2= str1.split(" ");
		HashMap<String,Integer> obj2= new HashMap<String,Integer>();
		for(int i=0;i<str2.length;i++) {
			if (obj2.containsKey(str2[i])) {
				int count= obj2.get(str2[i]);
				obj2.put(str2[i],++count);
			}       
			else {
				obj2.put(str2[i], 1);
			}
		}
		System.out.println(obj2);
		
		String str3= "Software Testing";
		str3= str3.toLowerCase();
		str3= str3.replaceAll("[^a-z]","");
		String str4="";
		HashSet<Character> obj3= new HashSet<Character>();
		for(int i=0;i<str.length();i++) {
			if(obj3.add(str3.charAt(i))){
				str4= str4+str3.charAt(i);
			}
		}
		System.out.println(str4);
		
		String str5= "Software Testing Software Testing Manual Automation Database API";
		str5= str5.toLowerCase();
		String[] str6= str5.split(" ");
		String str7="";
		HashSet<String> obj4= new HashSet<String>();
		for(int i=0;i<str6.length;i++) {
			if(obj4.add(str6[i])) {
				str7= str7+str6[i]+" ";
			}
		}
		System.out.println(str7);
		
		String str8="Harsh Kumar Upadhyay";
		for(int i=0;i<str8.length();i++) {
			System.out.print(str8.charAt(i));
		}
		System.out.println();
		for(int i=str8.length()-1;i>=0;i--) {
			System.out.print(str8.charAt(i));
		}
		
		//String str="Divya Pandey";
//		str= str.toLowerCase();
//		str=str.replaceAll("[^a-z]", "");
//		String str1="";
//		HashSet<Character> ob2= new HashSet<Character>();
//		for(int i=0;i<str.length();i++) {
//			if(ob2.add(str.charAt(i)))
//			{
//				str1= str1+str.charAt(i);
//			}
//		}
//	//	System.out.println(ob2);
//		System.out.println(str1);
	//	    HashMap<Character,Integer> ob1=new HashMap<Character, Integer>();
//	    for(int i=0;i<str.length();i++) {
//	    	if(ob1.containsKey(str.charAt(i))) {
//	    		int count=ob1.get(str.charAt(i));
//	    	ob1.put(str.charAt(i), ++count);
//	    	}else {
//	    		ob1.put(str.charAt(i),1);
//	    	}
//	    }
//		//str=str.toLowerCase();
//		System.out.println(str);
//		System.out.println(ob1);
		//str=str.replaceAll("[^97]","");
		//str=str.replaceAll("[^pdgc]", "");
		//str=str.replaceAll("[^a-z]", "");
		//System.out.println(str);
//		str=str.replaceAll("[^A-Za-z0-9]", "");
//		System.out.println(str);
//		int count=0;
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)=='p') {
//				count++;
//			}
//		}
//		System.out.println(count);
	}
}
