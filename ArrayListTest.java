package lab3zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ArrayListTest extends MyAbstract {

	static List<Account> humans = new ArrayList<Account>();
	private static final int ARRAY_LIST_LENGTH = 500000;
	RandomGenerator randomgenerator = new RandomGenerator();

	public double timeTestAdding() {

		double startTime = System.currentTimeMillis();
		for (int i = 0; i < ARRAY_LIST_LENGTH; i++) {

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
		for (int i = 0; i < ARRAY_LIST_LENGTH; i++) {
			humans.get(i);
		}
		double endTime = System.currentTimeMillis();
		return endTime - startTime;

	}

	@SuppressWarnings("unchecked")
	public double timeTestSorting() {

		double startTime = System.currentTimeMillis();

		Collections.sort(humans, new Comparator() {

			public int compare(Object o1, Object o2) {

				Integer x1 = ((Account) o1).getCash();
				Integer x2 = ((Account) o2).getCash();
				Integer sComp = x1.compareTo(x2);

				if (sComp != 0) {
					return sComp;
				} else {
					String x10 = ((Account) o1).getMen();
					String x20 = ((Account) o2).getMen();
					return x10.compareTo(x20);
				}
			};
		});
		double endTime = System.currentTimeMillis();
		return endTime - startTime;
	}



}