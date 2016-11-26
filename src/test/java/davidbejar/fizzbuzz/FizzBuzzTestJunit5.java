package davidbejar.fizzbuzz;

import static davidbejar.fizzbuzz.FizzBuzzEnum.BUZZ;
import static davidbejar.fizzbuzz.FizzBuzzEnum.FIZZ;
import static davidbejar.fizzbuzz.FizzBuzzEnum.FIZZBUZZ;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * Unit tests using JUnit5
 */
@RunWith(JUnitPlatform.class)
public class FizzBuzzTestJunit5 {

	final static String[] fizzBuzzExpected = {
			"1",
			"2",
			FIZZ.value(),
			"4",
			BUZZ.value(),
			FIZZ.value(),
			"7",
			"8",
			FIZZ.value(),
			BUZZ.value(),
			"11",
			FIZZ.value(),
			"13",
			"14",
			FIZZBUZZ.value(),
			"16",
			"17",
			FIZZ.value(),
			"19",
			BUZZ.value(),
			FIZZ.value(),
			"22",
			"23",
			FIZZ.value(),
			BUZZ.value(),
			"26",
			FIZZ.value(),
			"28",
			"29",
			FIZZBUZZ.value(),
			"31",
			"32",
			FIZZ.value(),
			"34",
			BUZZ.value(),
			FIZZ.value(),
			"37",
			"38",
			FIZZ.value(),
			BUZZ.value(),
			"41",
			FIZZ.value(),
			"43",
			"44",
			FIZZBUZZ.value(),
			"46",
			"47",
			FIZZ.value(),
			"49",
			BUZZ.value(),
			FIZZ.value(),
			"52",
			"53",
			FIZZ.value(),
			BUZZ.value(),
			"56",
			FIZZ.value(),
			"58",
			"59",
			FIZZBUZZ.value(),
			"61",
			"62",
			FIZZ.name(),
			"64",
			BUZZ.toString(),
			FIZZ.value(),
			"67",
			"68",
			FIZZ.value(),
			BUZZ.value(),
			"71",
			FIZZ.value(),
			"73",
			"74",
			FIZZBUZZ.name(),
			"76",
			"77",
			FIZZ.value(),
			"79",
			BUZZ.value(),
			FIZZ.value(),
			"82",
			"83",
			FIZZ.value(),
			BUZZ.value(),
			"86",
			FIZZ.value(),
			"88",
			"89",
			FIZZBUZZ.value(),
			"91",
			"92",
			FIZZ.value(),
			"94",
			BUZZ.value(),
			FIZZ.value(),
			"97",
			"98",
			FIZZ.value(),
			BUZZ.value() };

	@DisplayName("First Test")
	@Test
	void firstTest() {
		assertEquals(1, 1);
	}

	@Test
	@DisplayName("Assert True! 😎")
	void testTrue() {
		Assertions.assertTrue(true);
	}

	@Test
	@DisplayName("Test emojis 💻 and 🇪🇸")
	void testEmoji(TestInfo testInfo) {
		Assertions.assertEquals("Test emojis 💻 and 🇪🇸", testInfo.getDisplayName());
	}

	@Test
	@DisplayName("Test Quick Win FizzBuzz- old style")
	void testQuickWin() {
		Assertions.assertEquals(Arrays.asList(fizzBuzzExpected), FizzBuzz.fizzBuzzQuickWin());
	}

	@Test
	@DisplayName("Test Quick Win FizzBuzz - Streams + Strings")
	void testQuickWinJava8() {
		String joinStr = ", ";
		Assertions.assertEquals(Arrays.stream(fizzBuzzExpected).collect(Collectors.joining(joinStr)),
				FizzBuzz.fizzBuzzQuickWin().parallelStream().collect(Collectors.joining(joinStr)));
	}

	@Test
	@DisplayName("Test Quick Win FizzBuzz- Streams + Lists")
	void testQuickWinJava8v2() {
		Assertions.assertEquals(Arrays.stream(fizzBuzzExpected).collect(Collectors.toList()),
				FizzBuzz.fizzBuzzQuickWin().parallelStream().collect(Collectors.toList()));
	}

	@Test
	@DisplayName("Test Recursive FizzBuzz - old style")
	void testRecursive() {
		Assertions.assertEquals(Arrays.asList(fizzBuzzExpected),
				FizzBuzz.fizzBuzzRecursive(new ArrayList<String>(100)));
	}

	@Test
	@DisplayName("Test Recursive FizzBuzz - Streams + Strings")
	void testRecursiveJava8() {
		String joinStr = ", ";
		Assertions.assertEquals(Arrays.stream(fizzBuzzExpected).collect(Collectors.joining(joinStr)), FizzBuzz
				.fizzBuzzRecursive(new ArrayList<String>(100)).parallelStream().collect(Collectors.joining(joinStr)));
	}

	@Test
	@DisplayName("Test Recursive FizzBuzz - Streams + Lists")
	void testRecursiveJava8v2() {
		Assertions.assertEquals(Arrays.stream(fizzBuzzExpected).collect(Collectors.toList()),
				FizzBuzz.fizzBuzzRecursive(new ArrayList<String>(100)).parallelStream().collect(Collectors.toList()));
	}

}
