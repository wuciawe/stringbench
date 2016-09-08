package com.almondtools.stringbench.singlepattern.byteseek;

import com.almondtools.stringbench.singlepattern.SinglePatternMatcherBenchmark;
import com.almondtools.stringbench.singlepattern.SinglePatternMatcherBenchmarkTest;

public class BSBoyerMooreHorspoolBenchmarkTest extends SinglePatternMatcherBenchmarkTest {

	@Override
	protected SinglePatternMatcherBenchmark getBenchmark() {
		return new BSBoyerMooreHorspoolBenchmark();
	}
}
