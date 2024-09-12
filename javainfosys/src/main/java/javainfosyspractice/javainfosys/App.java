package javainfosyspractice.javainfosys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String s1= "pandey97divya@gmail.com";
    	s1= s1.replaceAll("[^a-z]", "");
    	System.out.println(s1);
        String s= "Software Testing Software Testing Software Testing Development";
        s= s.toLowerCase();
        String[] str= s.split(" ");
        HashMap <String , Integer> obj1= new HashMap <String , Integer>();
        for(int i=0; i<str.length;i++) {
//        	System.out.print(str[i]);
        	String temp= str[i];
        	for(int j=temp.length()-1;j>=0;j--) {
        		System.out.print(temp.charAt(j));
        	}
        	System.out.print(" ");
        }
        for(int i=0; i<str.length;i++) {
        	if(obj1.containsKey(str[i])) {
        		int count= obj1.get(str[i]);
        		obj1.put(str[i], ++count);
        	}
        	else {
        		obj1.put(str[i], 1);
        	}
        }
        System.out.println(obj1);
        String ans= "";
        HashSet<String> obj2= new HashSet<String>();
        for(int i=0; i<str.length;i++) {
//        	obj2.add(str[i]);
        	if(!obj2.add(str[i])) {
        		ans= ans + str[i] + " ";
         	}
        }
//      System.out.print(obj2);
        System.out.println(ans);
        ArrayList<Integer> obj3= new ArrayList<Integer>();
        ArrayList<String> obj4= new ArrayList<String>();
        obj3.add(3);
        obj4.add("abcd");
        obj3.add(5);
        obj4.add("xyz");
        obj3.add(3);
        obj3.add(4);
        obj3.add(5);
        obj3.add(3);
        obj4.add("abcd");
        HashSet<Integer> obj5= new HashSet<Integer>();
        for(int i=0; i<obj3.size();i++) {
        	obj5.add(obj3.get(i));
        }
        String ans2= "";
        HashSet<Integer> obj7= new HashSet<Integer>();
        for(int i=0; i<obj3.size();i++) {
        	if(!obj7.add(obj3.get(i))) {
        		ans2= ans2 + obj3.get(i) + " ";
        	}
        }
        System.out.println(ans2);
        System.out.println(obj5);
        String ans1= "";
        HashSet<String> obj6= new HashSet<String>();
        for(int j=0; j<obj4.size();j++) {
        	if(!obj6.add(obj4.get(j))){
        		ans1=ans1 + obj4.get(j) + " ";
        	}
        }
        System.out.print(ans1);
    }
}
