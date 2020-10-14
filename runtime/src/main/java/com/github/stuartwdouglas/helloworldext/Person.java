package com.github.stuartwdouglas.helloworldext;

public class Person {

    String first, last;

    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public Person() {
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
