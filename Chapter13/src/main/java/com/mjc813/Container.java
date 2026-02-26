package com.mjc813;

public class Container <T, H> {
    private T name;
    private H age;

    public T getName() { return this.name; }
    public H getAge() { return this.age; }
    public void setName(T name) { this.name = name; }
    public void setAge(H age) { this.age = age; }
}
