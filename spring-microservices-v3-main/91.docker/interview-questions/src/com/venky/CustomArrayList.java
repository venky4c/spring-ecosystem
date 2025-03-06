package com.venky;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayList extends ArrayList {

    ArrayList arrayList = new ArrayList<String>();
    List<String> list = new ArrayList<>();//runtie polymorphism
    static String s1 = "hello";
    static String s2 = "hello";
    public boolean add(Object obj){
        if(this.contains(obj))
            return true;
        else
            return super.add(obj);
    }
    public static void main(String[] args){
        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(1);
        list.add(3);
        //System.out.println(list);
        boolean isSameReference = s1 == s2;
        System.out.println("s1 == s2: "+ (s1 ==s2));
    }
}
