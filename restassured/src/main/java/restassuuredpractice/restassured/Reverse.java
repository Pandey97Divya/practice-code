package restassuuredpractice.restassured;

import java.util.HashMap;

public class Reverse {
		public static void main(String args[])
		{
		String s= "Jackie Pandey Jackie Pandey";
		s = s.toUpperCase();
		System.out.println(s);
//			for(int i=s.length()-1;i>=0;i--) {
//				System.out.print(s.charAt(i));
//			}
//			System.out.println("");
//			System.out.println(s);
//			StringBuilder sb= new StringBuilder(s);
//			System.out.println(sb.reverse());
//		s= s.replaceAll("[^a-zA-Z]","");
//		HashMap<Character, Integer> hp= new HashMap<Character,Integer>();
//		for(int i=0;i<=s.length()-1;i++) {
//			if(hp.containsKey(s.charAt(i))) {
//				int count= hp.get(s.charAt(i));
//				hp.put(s.charAt(i),++count);
//			}else {
//				hp.put(s.charAt(i),1);
//			}
//		}
//		System.out.println(hp);
		String[] s1= s.split(" ");
		HashMap<String,Integer> hp1= new HashMap<String,Integer>();
		for(int i=0;i<s1.length;i++) {
			System.out.println(s1[i]);
			if(hp1.containsKey(s1[i])) {
				System.out.println("IF is working");
				int c1= hp1.get(s1[i]);
				hp1.put(s1[i], ++c1);
				System.out.println(hp1);
				
			}else {
				System.out.println("else is working");
				hp1.put(s1[i],1);
				System.out.println(hp1);
			}
		}
		System.out.println(hp1);
		}
}
