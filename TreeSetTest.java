package lab3zad2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest extends MyAbstract {

	Set<Account> humans = new TreeSet<Account>();
	private static final int TREE_SET_LENGTH = 500000;
	RandomGenerator randomgenerator = new RandomGenerator();

	public double timeTestAdding() {

		double startTime = System.currentTimeMillis();
		for (int i = 0; i < TREE_SET_LENGTH; i++) {
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

	@SuppressWarnings("unchecked")
	public double timeTestSorting() {

		return 0; // zwraca 0, poniewaz ten set jest ju¿ posortowany
	}

}
