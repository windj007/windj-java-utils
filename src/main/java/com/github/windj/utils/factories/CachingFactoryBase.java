package com.github.windj.utils.factories;

import java.util.HashMap;
import java.util.Map;

import com.github.windj.utils.factories.exceptions.CannotLoadObject;

public abstract class CachingFactoryBase<KEY_TYPE, VALUE_TYPE> implements
	IFactoryBase<KEY_TYPE, VALUE_TYPE> {
	protected Map<KEY_TYPE, VALUE_TYPE>	cache	= new HashMap<KEY_TYPE, VALUE_TYPE>();

	public VALUE_TYPE get(KEY_TYPE key) throws CannotLoadObject {
		VALUE_TYPE v = cache.get(key);
		if (v == null) {
			v = load(key);
			cache.put(key, v);
		}
		return v;
	}

	protected abstract VALUE_TYPE load(KEY_TYPE key) throws CannotLoadObject;
}
