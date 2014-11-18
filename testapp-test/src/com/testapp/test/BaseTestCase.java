package com.testapp.test;

import com.testapp.Dummy;

import android.test.InstrumentationTestCase;

public class BaseTestCase extends InstrumentationTestCase {

    public void test_broken() {
        Dummy d = new Dummy();
        assertTrue(d.broken() >= 0);
    }
    
}
