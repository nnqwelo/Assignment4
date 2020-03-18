package org.Noluthando;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class AnimalType{

        public static void main (String []args){

            String name, animalTpe;
            Animals animals1 = new Animals ("George", "Snake");
                Animals animals2 = new Animals("Bruce", "Lion");
                Animals animals3 = new Animals("Saint","monkey");
                Animals animals4 = new Animals("Danger", "dog");

                Collection animals = new ArrayList<>();
                animals.add("snake");
                animals.add("lion");
                animals.add("monkey");
                animals.add("dog");

            HashMap<String, String> AnimalsMap = new HashMap<>();

            AnimalsMap.put("George", "Snake");
            AnimalsMap.put("Saint" , "Bruce");
            AnimalsMap.put("Type" , "monkey");
            AnimalsMap.put("name" , "dog");

            System.out.print("Print Map data structure");
            System.out.println(AnimalsMap);
            System.out.println();

            Set<Animals> AnimalsSet = new HashSet<>();
            AnimalsSet.add(animals1);
            AnimalsSet.add(animals2);
            AnimalsSet.add(animals3);
            AnimalsSet.add(animals4);
            System.out.print("Print Set data structure");
            System.out.println(AnimalsSet);
            System.out.println();

                List<Animals> AnimalsList = new ArrayList<>();
                AnimalsList.add(animals1);
                AnimalsList.add(animals2);
                AnimalsList.add(animals3);
                AnimalsList.add(animals4);
                System.out.print("Print List data structure");
                System.out.println(AnimalsList);
                System.out.println();

                System.out.print("Print Collection Sort data structure");
                System.out.println(AnimalsList);
                System.out.println();

                AnimalsList.remove("snake");
                animals.add("king");

            System.out.print("Print Collection Sort data structure");
            System.out.println(AnimalsList);
            System.out.println();
 }






            }


