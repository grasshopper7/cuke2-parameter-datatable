package dataobject;

import java.util.Objects;

public class Money {

	public String currency = "";
	
	public int main = 0;
	
	public int sec = 0;

	public Money(String currency, int main, int sec) {
		this.currency = currency;
		this.main = main;
		this.sec = sec;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getMain() {
		return main;
	}

	public void setMain(int main) {
		this.main = main;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}

	@Override
	public int hashCode() {
		return Objects.hash(currency, main, sec);
	}

	@Override
	public boolean equals(Object obj) {
		return Objects.equals(this, obj);
	}

	@Override
	public String toString() {
		return "Money [currency=" + currency + ", main=" + main + ", sec=" + sec + "]";
	}
	
	
}
