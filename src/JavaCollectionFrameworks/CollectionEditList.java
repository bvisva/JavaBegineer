package JavaCollectionFrameworks;



	import java.util.Collection;
	import java.util.Iterator;
	import java.util.List;
	import java.util.ListIterator;
	import java.util.PriorityQueue;
	import java.util.Set;
	import java.util.Stack;
	import java.util.concurrent.PriorityBlockingQueue;

	public class CollectionEditList {

		public void editList(Collection<String> l1, Collection<String> l2) {

			Iterator<String> it = l1.iterator();
			while (it.hasNext()) {
				if (l2.contains(it.next()))
					it.remove();
			}

			while (it.hasNext()) {
				if (l2.equals(l1)) {
					it.notifyAll();
				}
			}
		}

		public void printMe(Collection<String> printList) {
			System.out.println("printing from subClass");

			for (String s : printList) {
				System.out.println(s);
			}
		}

		public void printMechar(Collection<Character> printList) {
			System.out.println("printing from subClass");

			for (Character s : printList) {
				System.out.println(s);
			}
		}

		
		public void printQueue(PriorityQueue<String> pQ) {
			System.out.println("element present in Queue");
			System.out.printf("%s  ", pQ);
			System.out.println();
			System.out.println();
		}

		public void printBlockingQueue(PriorityBlockingQueue<String> pQ) {
			System.out.println("element present in BlockingQueue");
			System.out.printf("%s  ", pQ);
			System.out.println();
			System.out.println();
		}
		public void printHashSet(Set<String> set) {
			System.out.println("element present in Hashset");
			System.out.printf("%s  ", set);
			System.out.println();
			System.out.println();
		}

		public void printStack(Stack<String> st) {

			System.out.println();

			if (st.isEmpty()) {
				System.out.println("You have nothing in your stack");
			} else
				System.out.printf("%s TOP\n", st);
		}

		public void removeStuff(List<String> removeList, int from, int to) {

			removeList.subList(from, to).clear();
			System.out.println();

		}

		public void reverseMe(List<String> reverseList) {

			ListIterator<String> prabhu = reverseList.listIterator(reverseList.size());
			while (prabhu.hasPrevious()) {
				System.out.println(prabhu.previous());
			}
		}

		public void populateValues(Collection<String> popList, String[] sArray) {
			for (String s : sArray) {
				popList.add(s);
			}
		}
	}


