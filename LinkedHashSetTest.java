package lab3zad2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetTest extends MyAbstract {

	Set<Account> humans = new LinkedHashSet<Account>();
	private static final int LINKED_HASH_SET_LENGTH = 500000;
	RandomGenerator randomgenerator = new RandomGenerator();

	public double timeTestAdding() {

		double startTime = System.currentTimeMillis();
		for (int i = 0; i < LINKED_HASH_SET_LENGTH; i++) {
			humans.add(new Account(randomgenerator.generator.nextInt(1001),
					randomgenerator.generateRandomString()));
		}
		double endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

	public double timeTestRemoving() {
		double startTime = System.currentTimeMillis();
		humans.clear();
		double endTime = System.currentTimeMillis();
		return endTime - startTime;

	}

	public double timeTestGetting() {

		double startTime = System.currentTimeMillis();
		Iterator it = humans.iterator();
		while (it.hasNext()) {
			it.next();
		}
		double endTime = System.currentTimeMillis();
		return endTime - startTime;

	}

	TreeSet<Account> treeSet = new TreeSet<Account>(); // stworzone, do posortowania LinkedHashSet

	@SuppressWarnings("unchecked")
	public double timeTestSorting() {
		double startTime = System.currentTimeMillis();
		treeSet.addAll(humans);
		double endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

}
