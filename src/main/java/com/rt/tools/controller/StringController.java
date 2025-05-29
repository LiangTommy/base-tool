package com.rt.tools.controller;

import com.rt.tools.core.strategy.StringStrategyInterface;
import com.rt.tools.core.strategy.StringTemplate;

public class StringController {

    // use strategy to handle the string
    public void stringHandle(String str, int limit, StringStrategyInterface stringStrategyInterface) {
        String lastStr;
        String resultStr = str;
        do {
            lastStr = resultStr;
            resultStr = stringStrategyInterface.handle(lastStr,limit);
        } while(!lastStr.equals(resultStr));
    }

    // use template to handle the string
    public void stringHandle(String str, int limit, StringTemplate stringTemplate) {
        String lastStr;
        String resultStr = str;
        do {
            lastStr = resultStr;
            resultStr = stringTemplate.handle(lastStr,limit);
        } while(!lastStr.equals(resultStr));
    }

}
