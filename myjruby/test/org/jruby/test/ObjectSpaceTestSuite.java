/*
 * TestUnitTestSuite.java
 * JUnit based test
 *
 * Created on January 15, 2007, 4:06 PM
 */

package org.jruby.test;


import junit.framework.Test;
import junit.framework.TestSuite;


/**
 *
 * @author headius
 */
public class ObjectSpaceTestSuite extends TestSuite {
    public static final String TEST_INDEX = "jruby_objectspace_index";

    /**
     * suite method automatically generated by JUnit module
     */
    public static Test suite() throws Exception {
        return new TestUnitTestSuite(TEST_INDEX);
    }
}
