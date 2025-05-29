package com.rt.tools.controller;

import com.rt.tools.core.strategy.*;
import org.junit.jupiter.api.Test;

class StringControllerStrategyTest {

    @Test
    void testStringHandleByStringRemoveStrategy1() {
        // define str = aabcccbbad, limit = 3
        StringController stringController = new StringController();
        StringStrategyInterface stringStrategyInterface = new StringRemoveStrategy();
        stringController.stringHandle("aabcccbbad",3,stringStrategyInterface);
    }

    @Test
    void testStringHandleByStringRemoveStrategy2() {
        // define str = aabcccbbad, limit = 2
        StringController stringController = new StringController();
        StringStrategyInterface stringStrategyInterface = new StringRemoveStrategy();
        stringController.stringHandle("aabcccbbad",2,stringStrategyInterface);
    }

    @Test
    void testStringHandleByStringRemoveStrategy3() {
        // define str = bbbbbbb, limit = 3
        StringController stringController = new StringController();
        StringStrategyInterface stringStrategyInterface = new StringRemoveStrategy();
        stringController.stringHandle("bbbbbbb",3,stringStrategyInterface);
    }

    @Test
    void testStringHandleByStringRemoveStrategy4() {
        // define str = aaaccccccd, limit = 3
        StringController stringController = new StringController();
        StringStrategyInterface stringStrategyInterface = new StringRemoveStrategy();
        stringController.stringHandle("aaaccccccd",3,stringStrategyInterface);
    }

    @Test
    void testStringHandleByStringReplaceStrategy1() {
        // define str = abcccbad, limit = 3
        StringController stringController = new StringController();
        StringStrategyInterface stringStrategyInterface = new StringReplaceStrategy();
        stringController.stringHandle("abcccbad",3,stringStrategyInterface);
    }

    @Test
    void testStringHandleByStringReplaceStrategy2() {
        // define str = cccccccccc, limit = 3
        StringController stringController = new StringController();
        StringStrategyInterface stringStrategyInterface = new StringReplaceStrategy();
        stringController.stringHandle("cccccccccc",3,stringStrategyInterface);
    }

    @Test
    void testStringHandleByStringReplaceStrategy3() {
        // define str = abbbccccbccdddd, limit = 3
        StringController stringController = new StringController();
        StringStrategyInterface stringStrategyInterface = new StringReplaceStrategy();
        stringController.stringHandle("abbbccccbccdddd",3,stringStrategyInterface);
    }

    @Test
    void testStringHandleByStringReplaceStrategy4() {
        // define str = abbbccccbccddddf, limit = 3
        StringController stringController = new StringController();
        StringStrategyInterface stringStrategyInterface = new StringReplaceStrategy();
        stringController.stringHandle("abbbccccbccddddf",3,stringStrategyInterface);
    }
}