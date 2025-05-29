package com.rt.tools.core.strategy;

import org.apache.commons.lang3.StringUtils;

public class StringRemoveStrategy implements StringStrategyInterface{
    @Override
    public String handle(String str,int limit) {
        if(StringUtils.isEmpty(str)) {
            return str;
        }

        StringBuffer resultStringBuffer = new StringBuffer();
        StringBuffer tempStringBuffer = new StringBuffer();

        char character=str.charAt(0);
        tempStringBuffer.append(str.charAt(0));

        for(int i=1;i<str.length();i++) {

            if(character == str.charAt(i)) {
                tempStringBuffer.append(str.charAt(i));
            } else {
                if(tempStringBuffer.length()<limit) {
                    resultStringBuffer.append(tempStringBuffer);
                }
                tempStringBuffer.setLength(0);
                character = str.charAt(i);
                tempStringBuffer.append(str.charAt(i));
            }

        }

        if(tempStringBuffer.length()<limit) {
            resultStringBuffer.append(tempStringBuffer);
        }

        String resultStr = resultStringBuffer.toString();

        if(!resultStr.equals(str)) {
            System.out.println(resultStr);
        }

        return resultStr;

    }
}
