package com.github.windj.utils.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class CollUtils {

	private CollUtils() {
	}

	public static <T> Set<T> constantSet(T... elems) {
		return Collections.unmodifiableSet(new HashSet<T>(Arrays.asList(elems)));
	}
}
