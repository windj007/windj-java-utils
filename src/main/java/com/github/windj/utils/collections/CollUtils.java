package com.github.windj.utils.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class CollUtils {

	private CollUtils() {
	}

	public static <T> Set<T> constantSet(T... elems) {
		return Collections.unmodifiableSet(new HashSet<T>(Arrays.asList(elems)));
	}

	public static <T> List<T> listFromValues(T... values) {
		return new ArrayList<T>(Arrays.asList(values));
	}
}
