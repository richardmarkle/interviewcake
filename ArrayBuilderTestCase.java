/**
 * 
 */
package com.markle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author rich
 *
 */
public class ArrayBuilderTestCase {
	ArrayBuilder ab;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ab = new ArrayBuilder(100);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		ab = null;
	}

	@Test
	public void test() {
		
		assert(ab != null);
		
	}

}
