package davidbejar.fizzbuzz;

import static davidbejar.fizzbuzz.FizzBuzzEnum.BUZZ;
import static davidbejar.fizzbuzz.FizzBuzzEnum.FIZZ;
import static davidbejar.fizzbuzz.FizzBuzzEnum.FIZZBUZZ;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class FizzBuzz {

	public static List<String> fizzBuzzQuickWin() throws InterruptedException {
		List<String> output = new ArrayList<>(100);
		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) {
				output.add(FIZZBUZZ.value());
			} else if (i % 5 == 0) {
				output.add(BUZZ.value());
			} else if (i % 3 == 0) {
				output.add(FIZZ.value());
			} else {
				output.add(String.valueOf(i));
			}
		}
		Thread.sleep(10);// To help with benchmarking
		return output;
	}

	public static List<String> fizzBuzzRecursive(List<String> fizzBuzzList) throws InterruptedException {
		int i = fizzBuzzList.size() + 1;
		if (i == 100 + 1) {
			return fizzBuzzList;
		} else {
			if (i % 15 == 0) {
				fizzBuzzList.add(FIZZBUZZ.value());
			} else if (i % 5 == 0) {
				fizzBuzzList.add(BUZZ.value());
			} else if (i % 3 == 0) {
				fizzBuzzList.add(FIZZ.value());
			} else {
				fizzBuzzList.add(String.valueOf(i));
			}
			Thread.sleep(10);// To help with benchmarking
			return fizzBuzzRecursive(fizzBuzzList);
		}
	}
}