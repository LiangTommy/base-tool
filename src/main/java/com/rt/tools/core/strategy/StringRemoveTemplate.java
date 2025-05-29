package com.rt.tools.core.strategy;

public class StringRemoveTemplate extends StringTemplate {
    @Override
    public void subStringHandle(StringBuffer resultStrngBuffer,StringBuffer tempStringBuffer,char character) {

    }

    @Override
    public void logHandle(String sourceStr,String resultStr) {
        if(!resultStr.equals(sourceStr)) {
            System.out.println(resultStr);
        }
    }
}
