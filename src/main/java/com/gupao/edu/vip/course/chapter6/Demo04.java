package com.gupao.edu.vip.course.chapter6;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 动态语言
 */
public class Demo04 {


    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        /**调用 javascript*/
        ScriptEngine javaScript = manager.getEngineByName("JavaScript");
        Object eval = javaScript.eval("function add(a,b) {return a + b;} add(2,3);");
        System.out.println(eval);
    }

}
