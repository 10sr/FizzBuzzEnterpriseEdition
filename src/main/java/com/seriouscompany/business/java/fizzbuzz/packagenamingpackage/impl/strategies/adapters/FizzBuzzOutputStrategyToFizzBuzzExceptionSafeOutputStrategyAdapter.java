package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzExceptionSafeOutputStrategy;

public class FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter implements FizzBuzzExceptionSafeOutputStrategy {

	private FizzBuzzOutputStrategy _fizzBuzzOutputStrategy;
	
	public FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(FizzBuzzOutputStrategy fizzBuzzOutputStrategy) {
		this._fizzBuzzOutputStrategy = fizzBuzzOutputStrategy;
	}

	@Override
	public void output(String outputStringToOutput) {
		try {
			this._fizzBuzzOutputStrategy.output(outputStringToOutput);
		} catch (Exception exceptionFromDoingOutput) {
			// We're the enterprise...we don't get exceptions!
		}
	}
}
