package com.java.design.pattern;

class YugalDetails{
    private int height;
    private String color;
    private String profession;

    public YugalDetails(int height, String color, String profession) {
        this.height = height;
        this.color = color;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "YugalDetails{" +
                "height=" + height +
                ", color='" + color + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
class YugalDetailsBuilder{
    private int height;
    private String color;
    private String profession;

    public YugalDetailsBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    public YugalDetailsBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public YugalDetailsBuilder setProfession(String profession) {
        this.profession = profession;
        return this;
    }
    public YugalDetails getDetails() {
        return new YugalDetails(height,color,profession);
    }
}

public class BuilderDesignPatternDemo {
    public static void main(String[] args) {
        YugalDetails details = new YugalDetailsBuilder().setHeight(6).setProfession("Software Engineer").getDetails();
        System.out.println(details);
    }
}
