package com.rt.tools.core.strategy;

import org.apache.commons.lang3.StringUtils;

public abstract class StringTemplate {

    /**
     * handle the string
     * @param str sourceStr
     * @param limit character max limit condition
     * @return result
     */
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
                } else {
                    subStringHandle(resultStringBuffer,tempStringBuffer,character);
                }
                tempStringBuffer.setLength(0);
                character = str.charAt(i);
                tempStringBuffer.append(str.charAt(i));
            }

        }

        if(tempStringBuffer.length()<limit) {
            resultStringBuffer.append(tempStringBuffer);
        } else {
            subStringHandle(resultStringBuffer,tempStringBuffer,character);
        }

        String resultStr = resultStringBuffer.toString();
        logHandle(str,resultStr);

        return resultStr;

    }

    // subString handle by child class
    public abstract void subStringHandle(StringBuffer resultStrngBuffer,StringBuffer tempStringBuffer,char character);

    // log handle by child class
    public abstract void logHandle(String sourceStr,String resultStr);

}
