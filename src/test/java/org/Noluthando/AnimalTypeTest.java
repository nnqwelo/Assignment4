package org.Noluthando;


import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.Timeout;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import java.util.*;
import static org.hamcrest.CoreMatchers.hasItems;

    public class AnimalTypeTest {

        private Animals Animalname;
        private Animals animalType;

        @Rule
        public Timeout globalTimeout = new Timeout(2000);

        @Test
        public void testList(){
            String name, animalTpe;
            Animals animals1 = new Animals ("George", "Snake");
            Animals animals2 = new Animals("Bruce", "Lion");
            Animals animals3 = new Animals("Saint","monkey");
            Animals animals4 = new Animals("Danger", "dog");


            List<Animals> AnimalsList = new ArrayList<>();
            AnimalsList.add(animals1);
            AnimalsList.add(animals2);
            AnimalsList.add(animals3);
            AnimalsList.add(animals4);

            AnimalsList.remove("snake");
            System.out.print("Animals");

            assertThat(AnimalsList,hasItems(animals1, animals2, animals3, animals4));
        }
        @Test
        public void testSet(){
            Animals animals1 = new Animals ("George", "Snake");
            Animals animals2 = new Animals("Bruce", "Lion");
            Animals animals3 = new Animals("Saint","monkey");
            Animals animals4 = new Animals("Danger", "dog");

            Set<Animals> AnimalsSet = new HashSet<>();
            AnimalsSet.add(animals1);
            AnimalsSet.add(animals2);
            AnimalsSet.add(animals3);
            AnimalsSet.add(animals4);

            assertThat(AnimalsSet, hasItems(animals1,animals2, animals3, animals4));
        }
        @Test
        public void testMap(){
            Animals animals1 = new Animals ("George", "Snake");
            Animals animals2 = new Animals("Bruce", "Lion");
            Animals animals3 = new Animals("Saint","monkey");
            Animals animals4 = new Animals("Danger", "dog");

            HashMap<String, String> AnimalsMap = new HashMap<>();
            AnimalsMap.put("George", "Snake");
            AnimalsMap.put("Saint" , "Bruce");
            AnimalsMap.put("Type" , "monkey");
            AnimalsMap.put("name" , "dog");

            HashMap<String, String> testing = new HashMap<>();
            testing.put("George" , "Snake");
            testing.put("name" , "dog");
            testing.put("Type" , "monkey");
            testing.put("Saint" , "Bruce");

            assertThat(AnimalsMap, is(testing));
        }

        @Test
        public void testDisable(){
            System.out.println("The test not execute");
        }

    }