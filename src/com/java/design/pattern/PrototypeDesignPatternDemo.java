package com.java.design.pattern;

class NetworkConnection implements Cloneable{
    private String ip;
    private String impData;
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getImpData() {
        return impData;
    }
    public void setImpData(String impData) {
        this.impData = impData;
    }
    public void loadImportantData(){
        this.impData="very very imp data";
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", impData='" + impData + '\'' +
                '}';
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class PrototypeDesignPatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        NetworkConnection connection =  new NetworkConnection();
        connection.setIp("10.119.20.112");
        connection.loadImportantData();
        System.out.println(connection);


        //creating a new obj by copying existing one
        NetworkConnection connection1 = (NetworkConnection) connection.clone();
        System.out.println(connection1);

    }
}
