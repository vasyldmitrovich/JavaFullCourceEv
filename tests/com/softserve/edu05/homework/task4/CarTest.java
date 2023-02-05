package com.softserve.edu05.homework.task4;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCarGetTypeMethod() {
        Car car = new Car("Off-road", 2012, 5.0);
        assertEquals("Off-road", car.getType());
    }

    @Test
    void testCarSetTypeMethod() {
        Car car = new Car("Off-road", 2012, 5.0);
        car.setType("Minivan");
        assertEquals("Minivan", car.getType());
    }

    @Test
    void testCarGetYearOfProductionMethod() {
        Car car = new Car("Off-road", 2012, 5.0);
        assertEquals(2012, car.getYearOfProduction());
    }

    @Test
    void testCarSetYearOfProductionMethod() {
        Car car = new Car("Off-road", 2012, 5.0);
        car.setYearOfProduction(2015);
        assertEquals(2015, car.getYearOfProduction());
    }

    @Test
    void testCarGetEngineCapacityMethod() {
        Car car = new Car("Off-road", 2012, 5.0);
        assertEquals(5.0, car.getEngineCapacity());
    }

    @Test
    void testCarSetEngineCapacityMethod() {
        Car car = new Car("Off-road", 2012, 5.0);
        car.setEngineCapacity(3.5);
        assertEquals(3.5, car.getEngineCapacity());
    }

    @Test
    void testToStringMethod() {
        Car car = new Car("Off-road", 2012, 5.0);
        assertEquals("Car type - " + car.getType() + ", model year - "
                + car.getYearOfProduction() + ", engine capacity - " + car.getEngineCapacity() + "L.", car.toString());

    }

    @Test
    void testCarEmptyConstructor() {
        Car car = new Car();
        assertNull(car.getType());
        assertEquals(0, car.getYearOfProduction());
        assertEquals(0.0, car.getEngineCapacity());
    }

    @Test
    void testSortingByYearOfProductionMethod() {
        Car[] array = new Car[4];
        Car car1 = new Car("", 3, 0);
        Car car2 = new Car("", 1, 0);
        Car car3 = new Car("", 2, 0);
        Car car4 = new Car("", 4, 0);
        array[0] = car1;
        array[1] = car2;
        array[2] = car3;
        array[3] = car4;
        int length = array.length;
        Car[] expectedOption1 = {car2, car3, car1, car4};
        Car[] resultOption1 = Car.sortingByYearOfProduction(array, length, 1);
        assertArrayEquals(expectedOption1, resultOption1);
        Car[] expectedOption2 = {car4, car1, car3, car2};
        Car[] resultOption2 = Car.sortingByYearOfProduction(array, length, 2);
        assertArrayEquals(expectedOption2, resultOption2);
    }
    @Test
    void testPrintSortedArrayMethod() {
        String consoleOutput = null;
        PrintStream originalOut = System.out;
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(65535);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            Car[] array = new Car[4];
            Car car1 = new Car("", 3, 0);
            Car car2 = new Car("", 1, 0);
            Car car3 = new Car("", 2, 0);
            Car car4 = new Car("", 4, 0);
            array[0] = car1;
            array[1] = car2;
            array[2] = car3;
            array[3] = car4;
            System.out.println("\nHere is the sorted list of available cars:");
            for (Car cars : array) {
                System.out.println(cars);
            }
            capture.flush();
            consoleOutput = outputStream.toString();
            System.setOut(originalOut);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        String expected = """
                \nHere is the sorted list of available cars:\r
                Car type - , model year - 3, engine capacity - 0.0L.\r
                Car type - , model year - 1, engine capacity - 0.0L.\r
                Car type - , model year - 2, engine capacity - 0.0L.\r
                Car type - , model year - 4, engine capacity - 0.0L.\r
                """;
        assertEquals(expected, consoleOutput);
    }
}
