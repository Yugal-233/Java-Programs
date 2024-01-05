package com.java.programs;

import java.util.Objects;

public class EqualsAndHashcodeMethod {
  private int id;
  private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int hashCode(){
      return Objects.hash(id,name);
  }
  public boolean equals(Object o){
      if(this==o) return true;
      if(o==null || getClass()!=o.getClass()) return false;
      EqualsAndHashcodeMethod e =  (EqualsAndHashcodeMethod) o;
      return id==e.id && Objects.equals(name,e.name);
  }
    public static void main(String[] args) {
        EqualsAndHashcodeMethod obj1 = new EqualsAndHashcodeMethod();
        obj1.setId(1);
        obj1.setName("Alice");

        EqualsAndHashcodeMethod obj2 = new EqualsAndHashcodeMethod();
        obj2.setId(1);
        obj2.setName("Alice");

        EqualsAndHashcodeMethod obj3 = new EqualsAndHashcodeMethod();
        obj3.setId(2);
        obj3.setName("Bob");

        // Testing equals method
        System.out.println("obj1 equals obj2: " + obj1.equals(obj2)); // Should be true
        System.out.println("obj1 equals obj3: " + obj1.equals(obj3)); // Should be false

        // Testing hashCode method
        System.out.println("HashCode of obj1: " + obj1.hashCode());
        System.out.println("HashCode of obj2: " + obj2.hashCode());
        System.out.println("HashCode of obj3: " + obj3.hashCode());
    }
}
