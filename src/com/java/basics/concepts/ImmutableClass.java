package com.java.basics.concepts;

import java.lang.reflect.Field;

final class ImmuteData{
    private final int id;
    private final String name;

    public ImmuteData(int id, String name) {
        this.id=id;
        this.name=name;

    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
public class ImmutableClass {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ImmuteData i1  = new ImmuteData(10,"tushar");
        System.out.println(i1.getId()+ "  "+ i1.getName());



//        The Field class in Java is a part of the Reflection API, which allows you to examine and manipulate the fields (member variables) of a class at runtime.
//        The Field class represents a single field of a class and provides methods to access and modify the values of that field, even
//        if the field is private or inaccessible through regular code. Reflection is useful in scenarios where you need to inspect
//        or modify the fields of a class dynamically, such as during serialization, deserialization, or implementing generic data mapping tools.
        Class clazz = i1.getClass();
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        // Set the value of the "name" field
        nameField.set(i1, "Amit");
        System.out.println("After reflection:"+i1.getId()+ "  "+ i1.getName());

    }
}
