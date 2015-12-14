package lab3zad2;

public class Account implements Comparable {

	private int cash;
	private String men;

	public Account(int cash, String men) {
		this.cash = cash;
		this.men = men;
	}

	public int getCash() {
		return cash;
	}

	public String getMen() {
		return men;
	}

	@Override
	public int compareTo(Object obj) {
		Account s = (Account) obj;
		if (men.equals(s.men)) { // achieving uniqueness
			return 0;
		} else {
			if (cash < s.cash) {
				return -1;
			} else if (cash > s.cash) {
				return 1;
			} else {

				return men.compareTo(s.men);
			}
		}
	}

	@Override
	public String toString() {
		return "Account [cash=" + cash + ", men=" + men + "]";
	}

}
