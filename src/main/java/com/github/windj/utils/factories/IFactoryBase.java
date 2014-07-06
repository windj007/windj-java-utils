package com.github.windj.utils.factories;

import com.github.windj.utils.factories.exceptions.CannotLoadObject;

public interface IFactoryBase<KEY_TYPE, VALUE_TYPE> {
	VALUE_TYPE get(KEY_TYPE k) throws CannotLoadObject;
}
