package com.hngdngcorp.hngdng.projecttest.Model;

public class Randomize {
    public int index;
    public String date;
    public int result;

    public Randomize(int index, String date, int result) {
        this.index = index;
        this.date = date;
        this.result = result;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
