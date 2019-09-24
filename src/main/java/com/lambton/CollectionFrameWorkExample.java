package com.lambton;

import java.util.*;

public class CollectionFrameWorkExample {
    public static void main(String[] args) {

        ArrayList<String> mStringArrayList=new ArrayList<>();
        mStringArrayList.add("A");
        mStringArrayList.add("B");
        mStringArrayList.add("C");
        mStringArrayList.add("D");

        mStringArrayList.add("D");
        mStringArrayList.add("D");


        //System.out.println(mStringArrayList);
        for(int i=0;i<mStringArrayList.size();i++)
        {
            System.out.println(mStringArrayList.get(i));
        }
        System.out.println("\n\n\n Using Different For Loop");

        for(String s: mStringArrayList)
        {
            System.out.println(s);
        }
        System.out.println("\n\n\n Using Iterator");

        Iterator<String>iterator=mStringArrayList.iterator();
        while(iterator.hasNext())
        {
            String s=iterator.next();
            System.out.println(s);
        }

        Set<String>mySet=new HashSet<>();
        mySet.add("India");
        mySet.add("China");
        mySet.add("USA");
        mySet.add("Canada");
        System.out.println(mySet);

        mySet.add("India");
        System.out.println(mySet);


        Map<String,String>stringMap=new HashMap<>();
        stringMap.put("IND","India");
        stringMap.put("CA","Canada");
        stringMap.put("USA","United States");
        stringMap.put("Pak","Pakistan");
        System.out.println(stringMap);

        stringMap.put("CA","New Canada");
        System.out.println(stringMap);

        System.out.println(stringMap.entrySet());
        stringMap.putIfAbsent("TO","Toronto");
        System.out.println(stringMap);
    }
}
