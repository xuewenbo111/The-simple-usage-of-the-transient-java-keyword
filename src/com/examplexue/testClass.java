package com.examplexue;

import java.io.Serializable;

public class testClass implements Serializable {
    private String test1;

    private transient String test2;

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    public String getTest1() {

        return test1;
    }

    public String getTest2() {
        return test2;
    }
}
