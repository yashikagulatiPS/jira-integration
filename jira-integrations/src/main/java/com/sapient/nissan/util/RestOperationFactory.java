package com.sapient.nissan.util;


/**
 * A class that provides object of some type
 */
public interface RestOperationFactory<T> {

	/**
	 * Returns an instance of given type.
	 *
	 * @return an instance of type provided
	 */
	T getTypeInstance();
}