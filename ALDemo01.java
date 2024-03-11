package com.collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
public class ALDemo01 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();


        myList.add("Aruna");
        myList.add("Ramya");
        myList.add("Suppu");
        myList.add("Vishnu");
      //  myList.add(1234);
        System.out.println(myList);


        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println("------------------");


        Iterator myListitr = myList.iterator();
        while (myListitr.hasNext()) {
            System.out.println(myListitr.next());
        }
        System.out.println("-----Enhanced for loop------");
        for (Object obj : myList) {
            System.out.println(obj);
        }
    }
}
