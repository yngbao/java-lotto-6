package lotto.validation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lotto.utils.Utils;

public class Validation {
	
    public static void validateDistinctedNumbers(List<Integer> numbers) {
    	Set<Integer> DistinctedNumbers = new HashSet<Integer>(numbers);
    	if (numbers.size() != DistinctedNumbers.size()) {
    		throw new IllegalArgumentException();
		}
    }
    
    public static void validateListNumbersInRange(List<Integer> numbers, int startInclusive, int endInclusive) {
		for (Integer number : numbers) {
			validateNumberInRange(number, startInclusive, endInclusive);
		}
	}
	public static void validateNumberInRange(int number, int startInclusive, int endInclusive) {
		if (number < startInclusive || number > endInclusive) {
			throw new IllegalArgumentException();
		}
	}
	
	public static int validateNaturalNumber(String input) {
		if (!input.matches("\\d+")) {
			throw new IllegalArgumentException();
		}
		return Integer.valueOf(input);
	}
	
	public static void validateNaturalNumberList(List<String> inputStirng) {
		for (String value : inputStirng) {
			validateNaturalNumber(value);
		}
	}
	
	public static void validateNumberNotInList(List<Integer> list, int number) {
		if (list.contains(number)) {
			throw new IllegalArgumentException();
		}
	}
	
	public static void validateDividablePaid(int paid, int price) {
		if ( paid < price || paid % price != 0) {
			throw new IllegalArgumentException();
		}
	}
	
	public static void validateBuyableAmount(int paid, int max) {
		if ( max < paid ) {
			throw new IllegalArgumentException();
		}
	}
	
	public static void validateListSize (List<Integer> numbers, int correctSize) {
        if (numbers.size() != correctSize) {
            throw new IllegalArgumentException();
        }
    }

}
