package com.lambton;

import javax.sound.midi.Soundbank;
import java.security.Key;
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



        ArrayList<String> Canada=new ArrayList<>();
        Canada.add("Ontario");
        Canada.add("Alberta");
        Canada.add("British Colombia");

        ArrayList<String> India=new ArrayList<>();
        India.add("Punjab");
        India.add("Gujrat");
        India.add("Himachal");
        India.add("Goa");

        ArrayList<String> US=new ArrayList<>();
        US.add("New York");
        US.add("California");
        US.add("Texas");
        US.add("New Jersey");

        Map<String, ArrayList<String>> Country=new HashMap<>();
        Country.put("CA",Canada);
        Country.put("IND",India);
        Country.put("USA",US);
        System.out.println(Country);


        System.out.println("\n\n\nNew Class Excersice\n\n\n");


        ArrayList<String> data=new ArrayList<>();
        data.add("abc");
        data.add("cab");
        data.add("cat");
        data.add("mate");
        data.add("atem");
        data.add("bac");
        data.add("tac");
        data.add("atc");
        data.add("pop");
        data.add("pat");
        data.add("123");
        data.add("231");
        data.add("431");

        System.out.println(data);


        Map<String,ArrayList<String>> hm=new HashMap<>();

        for(String s:data)
        {
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String key=new String (c);
            ArrayList<String> al=hm.get(key);
            if(al==null)
            {
                al=new ArrayList<>();
            }

            al.add(s);
            hm.put(key,al);
        }

        System.out.println(hm);











    }
}
