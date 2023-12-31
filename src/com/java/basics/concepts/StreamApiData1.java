package com.java.basics.concepts;

import java.util.*;
        import java.util.stream.Collectors;
class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class StreamApiData1 {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        productsList.stream().filter(i->i.price>30000).collect(Collectors.toList()).forEach(product -> System.out.println(product.price));

        System.out.println("****************************************");
        productsList.stream().filter(i->i.price>30000).map(p->p.price).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("****************************************");
        productsList.stream().filter(i->i.price>30000).map(p->p.price).forEach(System.out::println);

        System.out.println("****************************************");
        productsList.stream().filter(i->i.price>30000).forEach(product-> System.out.println(product.price));
    }
}