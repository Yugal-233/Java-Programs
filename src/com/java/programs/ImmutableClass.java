package com.java.programs;

import java.util.Arrays;
import java.util.List;

class Engine{
    private final int speed;
    private final List<String> types;
    public Engine(int speed, List<String> types) {
        this.speed = speed;
        this.types = types;
    }
    public int getSpeed() {
        return speed;
    }
    public List<String> getTypes() {
        return types;
    }
}

//make a class as final
//make variables as final and private
//no setter method
//make deep copy of the object
public final class ImmutableClass {
    private final int id;
    private final String name;
    private final Engine engine;

    public ImmutableClass(int id, String name, Engine engine){
        this.id=id;
        this.name=name;
        this.engine= new Engine(engine.getSpeed(),engine.getTypes());
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Engine eng = new Engine(50,Arrays.asList("gasoline","fuel"));
        ImmutableClass immutableClass = new ImmutableClass(1,"tata",eng);
        System.out.println(immutableClass.name=="tata");
        System.out.println(immutableClass.name=="mahindra");  ///it will return false, when I changed the value of name
        System.out.println(immutableClass.engine.getSpeed());
        System.out.println(immutableClass.engine.getTypes());
    }
}
