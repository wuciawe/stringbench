package com.almondtools.stringbench.multipattern.incubation.byteseek;

import net.byteseek.matcher.multisequence.MultiSequenceMatcher;
import net.byteseek.matcher.sequence.SequenceMatcher;
import net.byteseek.searcher.Searcher;
import net.byteseek.searcher.multisequence.set_horspool.SetHorspoolSearcher;

public class BSSetHorspoolBenchmark extends ByteSeekMultiBenchmark {

	private static final String ID = "ByteSeek Set Horspool";

	@Override
	public String getId() {
		return ID;
	}

	@Override
	public Searcher<SequenceMatcher> create(MultiSequenceMatcher matcher) {
		return new SetHorspoolSearcher(matcher);
	}

}
