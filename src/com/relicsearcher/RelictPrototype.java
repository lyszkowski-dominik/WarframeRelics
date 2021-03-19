package com.relicsearcher;

public class RelictPrototype {
    String name;
    boolean availability;
    String b1;
    String b2;
    String b3;
    String s1;
    String s2;
    String g1;

    public String getName() {
        return name;
    }

    public boolean isAvailability() {
        return availability;
    }

    public String getB1() {
        return b1;
    }

    public String getB2() {
        return b2;
    }

    public String getB3() {
        return b3;
    }

    public String getS1() {
        return s1;
    }

    public String getS2() {
        return s2;
    }

    public String getG1() {
        return g1;
    }

    public RelictPrototype(String name, boolean availability, String b1, String b2, String b3, String s1, String s2, String g1) {
        this.name = name;
        this.availability = availability;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.s1 = s1;
        this.s2 = s2;
        this.g1 = g1;
    }
}
