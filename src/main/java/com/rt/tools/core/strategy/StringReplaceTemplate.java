package com.rt.tools.core.strategy;

import java.util.ArrayList;
import java.util.List;

public class StringReplaceTemplate extends StringTemplate {

    String characterStr = "abcdefghijklmnopqrstuvwxyz";
    List<String> logList = new ArrayList<>();

    private char getfrontCharacter(char item) {
        int i = characterStr.indexOf(item);
        if(i == 0) {
            return '0';
        } else {
            return characterStr.charAt(i-1);
        }
    }

    @Override
    public void subStringHandle(StringBuffer resultStrngBuffer,StringBuffer tempStringBuffer,char character) {
        char frontCharacter = getfrontCharacter(character);
        if(frontCharacter != '0') {
            resultStrngBuffer.append(frontCharacter);
            String logStr = tempStringBuffer + " is replaced by "+frontCharacter;
            if(!logList.contains(logStr)) {
                logList.add(logStr);
            }
        }
    }

    @Override
    public void logHandle(String sourceStr,String resultStr) {
        if(!resultStr.equals(sourceStr)) {
            System.out.print(resultStr);
            for(String item:logList) {
                System.out.print(","+item);
            }
        }
        logList.clear();
        System.out.println();
    }
}
