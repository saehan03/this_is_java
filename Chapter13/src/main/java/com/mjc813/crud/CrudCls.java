package com.mjc813.crud;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CrudCls<A> implements CRUD<A> {

    private List<A> list = new LinkedList<>();

    @Override
    public void add(A item) {
        list.add(item);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public A set(int index, A item) {
        if (index >= 0 && index < list.size()) {
            return list.set(index, item);
        }
        return null;
    }

    @Override
    public A remove(int index) {
        if (index >= 0 && index < list.size()) {
            return list.remove(index);
        }
        return null;
    }

    @Override
    public A get(int index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        }
        return null;
    }

    @Override
    public String getJson(int index) {
        A item = get(index);
        if (item == null) return "{}";
        return String.format("{\"index\": %d, \"data\": \"%s\"}", index, item.toString());
    }

    @Override
    public String getJsonAllItems() {
        if (list.isEmpty()) return "[]";

        String content = list.stream()
                .map(item -> "\"" + item.toString() + "\"")
                .collect(Collectors.joining(", "));
        return "[" + content + "]";
    }
}
