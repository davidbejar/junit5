package davidbejar.fizzbuzz;

public enum FizzBuzzEnum {

		FIZZ("FIZZ"), BUZZ("BUZZ"), FIZZBUZZ("FIZZBUZZ");

	private String value;

	FizzBuzzEnum(String value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public String value() {
		return value;
	}

}
