package com.ascending.training.basic.dataStructure;

import java.util.Map;
import java.util.HashMap;

public class HashMapTest {

    public Map<DataKey, Integer> getAllData(){
        Map<DataKey, Integer> hm = new HashMap<>();
        DataKey dk = new DataKey();
        DataKey dk2 = new DataKey();
        int i = dk.hashCode();
        int j = dk2.hashCode();

        dk.setId(1);
        dk.setName("Cyt");
        dk2.setId(2);
        dk2.setName("tt");

        hm.put(dk, i);
        hm.put(dk2, j);

        return hm;
    }

    public static void main(String[] args){
        HashMapTest hmt = new HashMapTest();
        Map<DataKey, Integer> hm = hmt.getAllData();
        System.out.println(hm);
    }

    public class DataKey{
        private String name;
        private int id;

//        public String getName(){
//            return name;
//        }

        public void setName(String name){
            this.name = name;
        }

//        public int getId() {
//            return id;
//        }

        public void setId(int id){
            this.id = id;
        }

        @Override
        public String toString(){
            return "DataKey [name = " + name + " id = " + id + " ]";
        }
    }
}
