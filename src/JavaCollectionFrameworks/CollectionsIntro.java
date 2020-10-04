package JavaCollectionFrameworks;



	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.HashSet;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.PriorityQueue;
	import java.util.Set;
	import java.util.Stack;
	import java.util.concurrent.PriorityBlockingQueue;

	public class CollectionsIntro {
		public static void main(String[] args) {

			CollectionEditList Col = new CollectionEditList();

			Stack<String> stack = new Stack<>();
			PriorityQueue<String> q = new PriorityQueue<>();
			

			Character[] char1 = { 'r', 'c', 's', 'y' };
			Character[] char2 = new Character[5];

			String[] words1 = { "john", "kiruba", "prabhu", "dhivya", "Shabira" };
			String[] words2 = { "dhivya", "Shabira", "oormila", "revathy", "arun", "arjun", "ganga" };

			String[] words3 = { "john 1", "kiruba 1", "prabhu 1", "dhivya 1", "Shabira 1" };
			String[] words4 = { "dhivya 1", "revathy 1", "arun 1","Shabira 1", "oormila 1", "revathy 1", "arun 1", "arjun 1", "ganga 1" };
			String[] words5 = { "dhivya 2", "shabira 2", "oormila 2", "revathy 2", "arun 2", "arjun 2", "ganga 2" };

			PriorityBlockingQueue<String> pbq = new PriorityBlockingQueue<>(q);
			List<Character> theList6 = Arrays.asList(char1);
			List<Character> theList7 = Arrays.asList(char2);
			List<String>   theList8 = Arrays.asList(words4);

			ArrayList<String> theList1 = new ArrayList<>();
			ArrayList<String> theList2 = new ArrayList<>();

			List<String> theList3 = new LinkedList<>();
			List<String> theList4 = new LinkedList<>();
			Set<String> set = new HashSet<>(theList8);
			
			

			q.offer("prabhu");
			q.offer("padmanaban");
			q.offer("prabhupadmanaban");
			q.offer("names" + "namesof mine");

			pbq.offer("asdfdfd");
			pbq.addAll(q);
			
			LinkedList<String> theList5 = new LinkedList<>(Arrays.asList(words5));
			theList5.add("nivetha");
			theList5.addFirst("subbamamll");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@ printing Hasset @@@@@@@@@@@@@@@@@@@@@@@");
			
			Col.printHashSet(set);
			
			System.out.println("#############33printing priorityBlockingQueue###########");
			Col.printBlockingQueue(pbq);
			
	        pbq.poll();
			Col.printBlockingQueue(pbq);
			pbq.toArray();
			Col.printMe(pbq);
			
			System.out.println("*******printing Stack Trace**********");
			stack.push("Bottom");
			Col.printStack(stack);
			stack.push("first");
			
			Col.printStack(stack);
			stack.push("second");
			Col.printStack(stack);
			stack.push("third");
			Col.printStack(stack);
			stack.pop();
			Col.printStack(stack);
			stack.pop();
			Col.printStack(stack);
			stack.pop();
			Col.printStack(stack);
			stack.pop();
			Col.printStack(stack);
			
			
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%printing the priority queue%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			Col.printQueue(q);
			System.out.println(q.peek());
			System.out.println(q.poll());
			Col.printQueue(q);

			Collections.sort(theList5);
			System.out.println("the sorted list" + theList5);

			System.out.println();
			Col.printMe(theList5);

			System.out.println();
			System.out.println("reversing the List");
			Collections.sort(theList5, Collections.reverseOrder());
			Col.printMe(theList5);

			System.out.println();
			Collections.addAll(theList5, words2);
			System.out.println("Collections addAll functionality Testing");
			Col.printMe(theList5);
			System.out.println("the  totall elements present are  " + theList5.size());

			Collections.copy(theList7, theList6);
			System.out.println("the copy of List:");
			System.out.println();
			Col.printMechar(theList7);

			Collections.fill(theList6, 'X');
			System.out.println("the List of varialbles ");
			System.out.println();
			Col.printMechar(theList6);

			System.out.println("printing the linkedList");
			System.out.println();
			Col.printMe(theList5);
			System.out.println("");

			Col.populateValues(theList1, words1);
			Col.populateValues(theList2, words2);
			Col.populateValues(theList3, words3);
			Col.populateValues(theList4, words4);

			Col.editList(theList1, theList2);
			System.out.println();
			Col.printMe(theList1);
			System.out.println();

			System.out.println("Collections frequenct testing");

			System.out.println(Collections.frequency(theList5, "arun"));
			System.out.println();

			System.out.println("collection framework  testing dijoint");
			System.out.println(Collections.disjoint(theList5, theList3));
			System.out.println();

			System.out.println("print me execution");
			Col.printMe(theList3);
			System.out.println();

			Col.printMe(theList4);
			System.out.println();

			System.out.println("reverse me execution");
			System.out.println();
			Col.reverseMe(theList4);
			System.out.println();

			System.out.println("remove stuff execution");
			System.out.println();
			Col.removeStuff(theList4, 2, 5);
			System.out.println();

			System.out.println("Again print me execution");
			System.out.println();
			Col.printMe(theList4);
			System.out.println();

			System.out.println("End of the program");
			System.out.println();
			Col.printMechar(theList6);
			System.out.println();
			Col.printMechar(theList7);

		}

	}

