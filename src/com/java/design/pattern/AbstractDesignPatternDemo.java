package com.java.design.pattern;

interface Engineer{
    int salary();
    String name();
}
class AndroidEngineer implements Engineer{
    @Override
    public int salary() {
        return 50000;
    }
    @Override
    public String name() {
        return "Yugal";
    }
}
class WebEngineer implements Engineer{
    @Override
    public int salary() {
        return 800000;
    }
    @Override
    public String name() {
        return "Mayur";
    }
}
abstract class EngineerAbstractFactory{
    public abstract Engineer createEngineer();
}
class AndroidFactory extends EngineerAbstractFactory{

    @Override
    public Engineer createEngineer() {
        return new AndroidEngineer();
    }
}
class WebFactory extends EngineerAbstractFactory{

    @Override
    public Engineer createEngineer() {
        return new WebEngineer();
    }
}
class EngineerFactory{
    public static Engineer getEngineer(EngineerAbstractFactory engineerAbstractFactory) {
        return engineerAbstractFactory.createEngineer();
    }
}

public class AbstractDesignPatternDemo {
    public static void main(String[] args) {
        Engineer e1 = EngineerFactory.getEngineer(new AndroidFactory());
        System.out.println(e1.name()+" : "+e1.salary());

        Engineer e2 = EngineerFactory.getEngineer(new WebFactory());
        System.out.println(e1.name()+" : "+e1.salary());
    }
}
