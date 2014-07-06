package com.github.windj.utils.factories;

import java.util.HashMap;
import java.util.Map;

public abstract class CachingFactoryBase<KEY_TYPE, VALUE_TYPE> {
	private Map<KEY_TYPE, VALUE_TYPE>	cache	= new HashMap<KEY_TYPE, VALUE_TYPE>();

	public VALUE_TYPE get(KEY_TYPE key) {
		VALUE_TYPE v = cache.get(key);
		if (v == null) {
			v = load(key);
			cache.put(key, v);
		}
		return v;
	}

	protected abstract VALUE_TYPE load(KEY_TYPE value);
}
