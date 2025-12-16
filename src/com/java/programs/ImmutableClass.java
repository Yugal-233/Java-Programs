package com.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class Engine {

    private final int speed;

    private final List<String> types;

    public Engine(int speed, List<String> types) {
        this.speed = speed;
        this.types = Collections.unmodifiableList(new ArrayList<>(types));
    }

    public int getSpeed() {
        return speed;
    }

    public List<String> getTypes() {
        return types;
    }

}

public final class ImmutableClass {

    private final int id;
    private final String name;
    private final Engine engine;

    public ImmutableClass(int id, String name, Engine engine) {
        super();
        this.id = id;
        this.name = name;
        // Deep copy of Engine
        this.engine = new Engine(engine.getSpeed(), engine.getTypes());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine; // Safe because Engine is immutable
    }

    public static void main(String[] args) {

        List<String> engTypes = new ArrayList<String>();
        engTypes.add("gasoline");
        engTypes.add("fuel");

        // Try modifying original objects
        Engine newEngine = new Engine(50, engTypes);
        // eng.getTypes().add("diesel"); // will throw exception

        ImmutableClass immutableClass = new ImmutableClass(10, "Tata", newEngine);

        engTypes.add("diesel");

        System.out.println(immutableClass.getEngine().getSpeed());
        System.out.println(immutableClass.getEngine().getTypes());

    }

}
