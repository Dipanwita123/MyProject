package JavaPractice;

import java.util.HashSet;

public class Collectionsdemo {

	public static void main(String[] args) {
		
		//for non-generic type: LinkedList
//LinkedList ll = new LinkedList();
//ll.add("dipa");
//ll.add("846");
//ll.add("testing");

//Iterator itr = ll.iterator();
// System.out.println(itr.hasNext());
// System.out.println(itr.next());
// 
// while(itr.hasNext())
// {
//	 System.out.println(itr.next());
// }
	
//	for (Object obj : ll)
//	{
//		System.out.println(obj);
//	}
	
		// For generic type: linkedList
//	LinkedList<Integer> ll2 = new LinkedList<Integer>();
//	ll2.add(5430);
//	ll2.add(78655);
//	ll2.add(865);
	
//	Iterator<Integer> itr2 = ll2.iterator();
//	while(itr2.hasNext())
//	{
//		System.out.println(itr2.next());
//	}
//	for (Integer obj : ll2)
//	{
//		System.out.println(obj);
//	}
//	}


	//For non-generic type: HashSet
//		HashSet hs = new HashSet();
//		hs.add("dipa");
//		hs.add(865);
//		
//		Iterator itr = hs.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//	
//	for (Object obj:hs)
//	{
//		System.out.println(obj);
//	}
	
	//For generic type: HashSet
		HashSet<Integer> hs2 = new HashSet<Integer>();
		
		hs2.add(557);
		hs2.add(87687);
//		Iterator<Integer> itr2 = hs2.iterator();
//		
//		while(itr2.hasNext())
//		{
//			System.out.println(itr2.next());
//		}
	
	for (Integer obj: hs2) {
		System.out.println(obj);
	}
	}
}
