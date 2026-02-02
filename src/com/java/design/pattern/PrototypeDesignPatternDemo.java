package com.java.design.pattern;

class Network implements Cloneable{
    int ipAdress;
    String data;
    public Object clone() throws CloneNotSupportedException {
        return super.clone();

    }
}
public class PrototypeDesignPatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Network network = new Network();
        network.ipAdress=101021;
        network.data="yugals data";
        System.out.println(network.data+" "+network.ipAdress);

        //creating a new obj by copying existing one
        Network network1 = (Network) network.clone();
        System.out.println(network1.data+" "+network1.ipAdress);
    }

}
