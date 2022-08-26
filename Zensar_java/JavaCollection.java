package javaoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.TreeMap;

/*
 * Important Interfaces of Collection API
 * Collection :Enables you to work with groupof object, it is at top of Collection Framework hierarchy
 * Deque : Extends Queue to handle double ended queue
 * List : Extends Collection to handle sequences list of objects
 * Queue : Extends Collection to handle special kind of list in which elements are removed only from the head
 * Set : Extends Collection to handle sets,which must contain unique elements
 * SortedSet : Extends Set to handle sorted set
 * Map :
 * SortedMap :
 * 
 */

/*
 * Important Classes of Collection
 * LinkedList,ArrayList,HashSet,TreeSet,HashMap,LinkedHashSet,TreeMap,HashTable
 */
public class JavaCollection {
	
	void arrayList_Class() {
		ArrayList<String> arrList=new ArrayList<String>();
		arrList.add("ab");
		arrList.add("ac");
		for(int i=0;i<=10;i++) { String x="abc"+i; arrList.add(x); }
		System.out.println("Array List = "+arrList); //Array List = [ab, ac, abc0, abc1, abc2, abc3, abc4, abc5, abc6, abc7, abc8, abc9, abc10]
		arrList.remove(1);
		System.out.println("Array List after arrList.remove(1)  = "+arrList); //Array List = [ab, abc0, abc1, abc2, abc3, abc4, abc5, abc6, abc7, abc8, abc9, abc10]
		
		System.out.println("arrList Size= "+arrList.size());
		
		Collections.sort(arrList);
		System.out.println("Array List after sort  = "+arrList); //Array List = [ab, abc0, abc1, abc2, abc3, abc4, abc5, abc6, abc7, abc8, abc9, abc10]
				
	}//arrayList_Class()
	
	
	void linkedList_Class() {
		LinkedList<Integer> obj=new LinkedList<Integer>();
		obj.add(100);
		for(int i=10; i>1;i--) {int x=100+i; obj.add(x);}
		System.out.println("LinkedList = "+obj);
		
		System.out.println("Size of LinkedList = "+obj.size());
		//obj.remove(new Integer(100));
		obj.remove(Integer.valueOf(100));
		System.out.println("LinkedList after remove(Integer.valueOf(100)) = "+obj);
		
		Collections.sort(obj);		
		System.out.println("LinkedList after sort = "+obj);
	}//linkedList_Class()
	
	
	void hashMap_Class() {
		HashMap<Integer,String> obj=new HashMap<Integer,String>();
		obj.put(10,"abc");
		for(int i=20;i>1;i--) { String x= "abc"+i; obj.put(i, x);}
		System.out.println("HashMap element in pair key=Value  "+obj);
		
		obj.remove(8);
		System.out.println("HashMap element in pair key=Value after remove key 8  "+obj);
		
		obj.replace(2,"one");
		System.out.println("HashMap element after replace key 2=one  "+obj);
		
	}//hashMap_Class()
	
	
	void hasSet_Class() {
		HashSet<String> obj=new HashSet<String>();
		obj.add("abc");
		for(int i=1;i<=10;i++) {String x="abc"+i; obj.add(x);}
		System.out.println("HashSet = "+obj);
		
		obj.remove("abc");
		System.out.println("HashSet after remove 'abc' = "+obj);
		System.out.println("HashSet size = "+obj.size());
		
	}//hasSet_Class()
	
	void hashTable_Class() {
		Hashtable<Integer,String> obj=new Hashtable<Integer,String>(); 
		obj.put(101, "abc");
		//obj.put(null, null)// not allowed
		for(int i=1;i<=10;i++) {String x="abc"+i; obj.put(i,x);}
		System.out.println("Hashtable = "+obj);
		
	}//hashTable_Class()
	
	
	void treeMap_Class() {
		TreeMap<Integer,String> obj=new TreeMap<Integer,String>();
		obj.put(1, "xyz");
		for(int i=1;i<=10;i++) {String x="xyz"+i; obj.put(i,x);}
		System.out.println("TreeMap = "+obj);
		
		System.out.println("TreeMap  Head Map= "+obj.headMap(4));
		System.out.println("TreeMap  Tail Map= "+obj.tailMap(4));
	}//treeMap_Class()

	public static void main(String[] args) {
		JavaCollection obj=new JavaCollection();
		obj.arrayList_Class();
		obj.linkedList_Class();
		obj.hashMap_Class();
		obj.hasSet_Class();
		obj.hashTable_Class();
		obj.treeMap_Class();

	}//main()

}//end class
