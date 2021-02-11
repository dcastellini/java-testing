package com.platzi.javatests.util;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilTest {

    @Test
    public void testRepeatStringOnce(){
        Assert.assertEquals("hola" , StringUtil.repeat("hola", 1));
    }

    @Test
    public void testRepeatStringMultipleTmes(){
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3) );
    }

    @Test
    public void testRepeatZeroTimes(){
        Assert.assertEquals("", StringUtil.repeat("hola", 0) );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRepeatStringNegativeTimes(){
        Assert.assertEquals("",StringUtil.repeat("hola", -1));
    }


}