package com.rt.tools.core.strategy;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class StringReplaceStrategy implements StringStrategyInterface {

    String characterStr = "abcdefghijklmnopqrstuvwxyz";

    private char getfrontCharacter(char item) {
        int i = characterStr.indexOf(item);
        if(i == 0) {
            return '0';
        } else {
            return characterStr.charAt(i-1);
        }
    }

    @Override
    public String handle(String str,int limit) {

        if(StringUtils.isEmpty(str)){
            return str;
        }

        List<String> logList = new ArrayList<>();
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
                    char frontCharacter = getfrontCharacter(character);
                    if(frontCharacter != '0') {
                        resultStringBuffer.append(frontCharacter);
                        String logStr = tempStringBuffer + " is replaced by "+frontCharacter;
                        if(!logList.contains(logStr)) {
                            logList.add(logStr);
                        }
                    }
                }
                tempStringBuffer.setLength(0);
                character = str.charAt(i);
                tempStringBuffer.append(str.charAt(i));
            }

        }

        if(tempStringBuffer.length()<limit) {
            resultStringBuffer.append(tempStringBuffer);
        } else {
            char frontCharacter = getfrontCharacter(character);
            if(frontCharacter != '0') {
                resultStringBuffer.append(frontCharacter);
                String logStr = tempStringBuffer + " is replaced by "+frontCharacter;
                if(!logList.contains(logStr)) {
                    logList.add(logStr);
                }
            }
        }

        String resultStr = resultStringBuffer.toString();

        if(!resultStr.equals(str)) {
            System.out.print(resultStr);
            for(String item:logList) {
                System.out.print(","+item);
            }
        }
        System.out.println();

        return resultStr;

    }
}
