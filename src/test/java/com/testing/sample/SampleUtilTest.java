package com.testing.sample;
import org.junit.Test;

import static org.junit.Assert.*;

public class SampleUtilTest {

    @Test
    public void testAdd(){
        System.out.println("Add");
        Integer a = 15;
        Integer b = 15;
        Integer expResult = 30;
        Integer result = SampleUtil.add(a,b);
        assertEquals(expResult,result);
    }

    @Test
    public void testAdd2(){
        System.out.println("Add");
        assertEquals(null,SampleUtil.add(null,15));
        assertEquals(null,SampleUtil.add(15,null));
        assertEquals(null,SampleUtil.add(null,null));
        assertEquals(Integer.valueOf(30),SampleUtil.add(15,15));

    }
}
