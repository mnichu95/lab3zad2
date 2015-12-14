package lab3zad2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Menu {

	static ArrayListTest arraylisttest = new ArrayListTest();
	static LinkedListTest linkedlisttest = new LinkedListTest();
	static HashSetTest hashsettest = new HashSetTest();
	static TreeSetTest treesettest = new TreeSetTest();
	static LinkedHashSetTest linkedhashsettest = new LinkedHashSetTest();

	public static void main(String[] args) throws FileNotFoundException {

		PrintWriter record = new PrintWriter("test.txt");

		record.println("ArrayList:");
		record.println("Adding: " + arraylisttest.timeTestAdding());
		record.println("Sorting: " + arraylisttest.timeTestSorting());
		record.println("Getting: " + arraylisttest.timeTestGetting());
		record.println("Removing: " + arraylisttest.timeTestRemoving());
		record.println("");
		record.println("Test LinkedList:");

		record.println("Adding: " + linkedlisttest.timeTestAdding());
		record.println("Sorting: " + linkedlisttest.timeTestSorting());
		record.println("Getting: " + linkedlisttest.timeTestGetting());
		record.println("Removing: " + linkedlisttest.timeTestRemoving());
		record.println("");
		record.println("Test HashSetTest:");

		record.println("Adding: " + hashsettest.timeTestAdding());
		record.println("Sorting: " + hashsettest.timeTestSorting());
		record.println("Getting: " + hashsettest.timeTestGetting());
		record.println("Removing: " + hashsettest.timeTestRemoving());
		record.println("");
		record.println("Test TreeSetTest:");

		record.println("Adding: " + treesettest.timeTestAdding());
		record.println("Sorting: " + treesettest.timeTestSorting());
		record.println("Getting: " + treesettest.timeTestGetting());
		record.println("Removing: " + treesettest.timeTestRemoving());
		record.println("");
		record.println("Test LinkedHashTestTest:");

		record.println("Adding:: " + linkedhashsettest.timeTestAdding());
		record.println("Sorting: " + linkedhashsettest.timeTestSorting());
		record.println("Getting " + linkedhashsettest.timeTestGetting());
		record.println("Removing: " + linkedhashsettest.timeTestRemoving());

		record.close();

	}

}
