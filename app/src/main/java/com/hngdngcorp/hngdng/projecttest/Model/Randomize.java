package com.hngdngcorp.hngdng.projecttest.Model;

public class Randomize {
    public int id;
    public String date;
    public int result;

    public Randomize(int index, String date, int result) {
        this.id = index;
        this.date = date;
        this.result = result;
    }

    public Randomize() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
