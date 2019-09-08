package com.ascending.training.basic.dataStructure;

import java.util.Objects;

public class EqualsTest {
    String name;
    int id;
    String email;

    EqualsTest(String name, int id, String email){
        this.name = name;
        this.id = id;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)return true;
        if (obj == null || this.getClass() != obj.getClass())return false;

        EqualsTest e = (EqualsTest) obj;
        if (id != e.id)return false;
        if (name == null)return false;
        if (name != e.name)return false;
        if (name.equals(e.name))return true;
        if (email != e.email || name == null)return false;
        if (email.equals(e.email))return true;

        return true;
    }

    @Override
    public int hashCode(){
        EqualsTest e = new EqualsTest("Cyt", 6, "666@gmail.com");
        int m = id + name.hashCode() + email.hashCode();
        return m;
//        return Objects.hash(name, id, email);
    }

    public static void main(String[] args){
        EqualsTest e = new EqualsTest("tt", 8, "888@gmail.com");
        EqualsTest eq = new EqualsTest("tt", 8, "888@gmail.com");
        Object t = new Object();
        boolean b = e.equals(t);
        boolean bl = e.equals(eq);
        System.out.println(b);
        System.out.println(bl);

        //difference between hashcode and Objects.hash(obj)
        int i = e.hashCode();
        int i2 = Objects.hash(e);
        int j = eq.hashCode();
        int j2 = Objects.hash(eq);
        System.out.println("hashcode: " + i + " hash: " + i2);
        System.out.println("hashcode: " + j + " hash: " + j2);
    }

}
