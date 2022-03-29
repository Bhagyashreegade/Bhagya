package com.company;

public class Mar_01 {

    private String name;
    private int id;
    private String address;

    //default constructor

    public Mar_01 (){
     }

    //Parameterized Constructor

    @Override
    public String toString() {
        return "Mar_01{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }

    public Mar_01(int id, String name, String address){
        this.id=id;
        this.name=name;
        this.address=address;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name=name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress (String address){
        this.address=address;
    }
}
