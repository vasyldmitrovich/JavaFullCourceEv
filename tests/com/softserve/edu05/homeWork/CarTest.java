package com.softserve.edu05.homeWork;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CarTest {

    @Test
    public void testCarGetYear(){
        Car cr0 = new Car("Audi", 2012, 2.0);
        assertEquals(2012, cr0.getYear());
    }

    @Test
    public void testCarSetYear(){
        Car cr0 = new Car("Audi", 2012, 2.0);
        cr0.setYear(2012);
        assertEquals(2012, cr0.getYear());
    }

    @Test
    public void testCarGetType(){
        Car cr1 = new Car("non", 2013, 3.0);
        assertEquals("non", cr1.getType());
    }

     @Test
     public  void testCarSetType(){
         Car cr1 = new Car("non", 2013, 3.0);
         cr1.setType("BMV");
     assertEquals("BMV", cr1.getType());
     }

    @Test
    public  void testCarConst(){
        Car car = new Car();
        assertNull(car.getType());
        assertEquals(0, car.getYear());
        assertEquals(0.0, car.getEngineCapacity());
        assertEquals(0.0, car.getEngineCapacity());
    }


 @Test
    public void testCarGetDouble(){
        Car cr2 = new Car("Mercedes-Benz", 2014, 1.1);
       assertEquals(3.2, cr2.getEngineCapacity());
 }

    @Test
    public void testCarSetDouble(){
        Car cr2 = new Car("Mercedes-Benz", 2014, 0.1);
        cr2.setEngineCapacity(3.2);
        assertEquals(3.2, cr2.getEngineCapacity());
    }
}
