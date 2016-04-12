package it.reexon.lib.test;

import org.junit.Test;

import it.reexon.lib.ConvertUtils;


public class ConvertUtilsTest
{

    @Test
    public final void testByteArrayToHexString()
    {
        System.out.println(ConvertUtils.byteArrayToHexString("[B@17579e0f".getBytes()));
    }

}
