//package com.softserve.project;
//
//
//
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//public class AnimalTest {
//
//    private Dog dog;
//    private Cat cat;
//    private List<Animal> animals;
//
//    @Before
//    public void setUp() {
//        dog = new Dog("Jack", "Black", 5);
//        cat = new Cat("Miki", "Brown", 9);
//
//        animals = new ArrayList<>();
//        animals.add(dog);
//        animals.add(cat);
//        animals.add(new Dog("Buddy", "White", 3));
//        animals.add(new Cat("Lucy", "Black", 2));
//        animals.add(new Dog("Rocky", "Brown", 4));
//    }
//
//    @Test
//    public void testAnimalGettersAndSetters() {
//        Animal animal = new Animal("name", "color", 10);
//
//        assertEquals("name", animal.getName());
//        assertEquals("color", animal.getColor());
//        assertEquals(10, animal.getAge());
//
//        animal.setName("newName");
//        animal.setColor("newColor");
//        animal.setAge(20);
//
//        assertEquals("newName", animal.getName());
//        assertEquals("newColor", animal.getColor());
//        assertEquals(20, animal.getAge());
//    }
//
//    @Test
//    public void testMakeSound() {
//        Animal animal = mock(Animal.class);
//        when(animal.getType()).thenReturn("animal");
//        animal.makeSound();
//
//        Dog dog = new Dog("name", "color", 10);
//        Cat cat = new Cat("name", "color", 10);
//        dog.makeSound();
//        cat.makeSound();
//    }
//
//    @Test
//    public void testAnimalsWithBlackColor() {
//        List<Animal> blackAnimals = new ArrayList<>();
//        blackAnimals.add(cat);
//        blackAnimals.add(new Cat("Lucy", "Black", 2));
//
//        List<Animal> result = Animal.getAnimalsWithColor(animals, "black");
//
//        assertEquals(blackAnimals.size(), result.size());
//        assertTrue(result.containsAll(blackAnimals));
//    }
//
//    @Test
//    public void testSortAnimalsByName() {
//        List<Animal> sortedAnimals = new ArrayList<>();
//        sortedAnimals.add(cat);
//        sortedAnimals.add(new Cat("Lucy", "Black", 2));
//        sortedAnimals.add(dog);
//        sortedAnimals.add(new Dog("Buddy", "White", 3));
//        sortedAnimals.add(new Dog("Rocky", "Brown", 4));
//
//        List<Animal> result = Animal.sortAnimalsByName(animals);
//
//        assertEquals(sortedAnimals.size(), result.size());
//        assertEquals(sortedAnimals, result);
//    }
//
//    @Test
//    public void testWriteAnimalsToFile() throws IOException {
//        String expected = "Buddy (Dog)\n" +
//                "Jack (Dog)\n" +
//                "Lucy (Cat)\n" +
//                "Miki (Cat)\n" +
//                "Rocky (Dog)\n";
//
//        File file = mock(File.class);
//        when(file.getPath()).thenReturn("test.txt");
//        FileWriter writer = mock(FileWriter.class);
//        whenNew(FileWriter.class).withArguments(file).thenReturn(writer);
//
//        Animal.writeAnimalsToFile(animals, file.getPath());
//
//        verify(writer).write(expected);
//        verify(writer).close();
//    }
