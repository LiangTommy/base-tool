package com.rt.tools.controller;

import com.rt.tools.core.strategy.*;
import org.junit.jupiter.api.Test;

class StringControllerTemplateTest {

    @Test
    void testStringHandleByStringRemoveTemplate1() {
        // define str = aabcccbbad, limit = 3
        StringController stringController = new StringController();
        StringTemplate stringTemplate = new StringRemoveTemplate();
        stringController.stringHandle("aabcccbbad",3,stringTemplate);
    }

    @Test
    void testStringHandleByStringRemoveTemplate2() {
        // define str = aabcccbbad, limit = 2
        StringController stringController = new StringController();
        StringTemplate stringTemplate = new StringRemoveTemplate();
        stringController.stringHandle("aabcccbbad",2,stringTemplate);
    }

    @Test
    void testStringHandleByStringRemoveTemplate3() {
        // define str = bbbbbbb, limit = 3
        StringController stringController = new StringController();
        StringTemplate stringTemplate = new StringRemoveTemplate();
        stringController.stringHandle("bbbbbbb",3,stringTemplate);
    }

    @Test
    void testStringHandleByStringRemoveTemplate4() {
        // define str = aaaccccccd, limit = 3
        StringController stringController = new StringController();
        StringTemplate stringTemplate = new StringRemoveTemplate();
        stringController.stringHandle("aaaccccccd",3,stringTemplate);
    }

    @Test
    void testStringHandleByStringReplaceTemplate1() {
        // define str = abcccbad, limit = 3
        StringController stringController = new StringController();
        StringTemplate stringTemplate = new StringReplaceTemplate();
        stringController.stringHandle("abcccbad",3,stringTemplate);
    }

    @Test
    void testStringHandleByStringReplaceTemplate2() {
        // define str = cccccccccc, limit = 3
        StringController stringController = new StringController();
        StringTemplate stringTemplate = new StringReplaceTemplate();
        stringController.stringHandle("cccccccccc",3,stringTemplate);
    }

    @Test
    void testStringHandleByStringReplaceTemplate3() {
        // define str = abbbccccbccdddd, limit = 3
        StringController stringController = new StringController();
        StringTemplate stringTemplate = new StringReplaceTemplate();
        stringController.stringHandle("abbbccccbccdddd",3,stringTemplate);
    }

    @Test
    void testStringHandleByStringReplaceTemplate4() {
        // define str = abbbccccbccddddf, limit = 3
        StringController stringController = new StringController();
        StringTemplate stringTemplate = new StringReplaceTemplate();
        stringController.stringHandle("abbbccccbccddddf",3,stringTemplate);
    }
}