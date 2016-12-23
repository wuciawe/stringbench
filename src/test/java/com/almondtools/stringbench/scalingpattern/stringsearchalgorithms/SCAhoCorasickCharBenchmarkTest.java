package com.almondtools.stringbench.scalingpattern.stringsearchalgorithms;

import com.almondtools.stringbench.scalingpattern.ScalingPatternMatcherBenchmark;
import com.almondtools.stringbench.scalingpattern.ScalingPatternMatcherBenchmarkTest;

public class SCAhoCorasickCharBenchmarkTest extends ScalingPatternMatcherBenchmarkTest {

	protected ScalingPatternMatcherBenchmark getBenchmark() {
		return new SCAhoCorasickCharBenchmark();
	}

}