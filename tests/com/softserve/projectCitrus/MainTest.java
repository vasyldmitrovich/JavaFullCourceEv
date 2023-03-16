package com.softserve.projectCitrus;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;


    public class MainTest {

        @Test
        public void testMainMethod() {

            ByteArrayOutputStream output = new ByteArrayOutputStream();
            System.setOut(new PrintStream(output));


            List<Fruit> fruits = new ArrayList<>();
            fruits.add(new Fruit("Apple", "Green"));
            fruits.add(new Citrus("Orange", "Orange", 18.3));
            fruits.add(new Citrus("Lemon", "Yellow", 15.8));
            fruits.add(new Fruit("Banana", "Yellow"));
            fruits.add(new Citrus("Grapefruit", "Pink", 25.6));


            Main.main(null);

            String expectedOutput = "Fruits with yellow color:\r\n" +
                    "Lemon (Yellow, 15.8)\r\n" +
                    "Banana (Yellow)\r\n" +
                    "Deserialized fruits:\r\n" +
                    "Apple (Green)\r\n" +
                    "Banana (Yellow)\r\n" +
                    "Grapefruit (Pink, 25.6)\r\n" +
                    "Lemon (Yellow, 15.8)\r\n" +
                    "Orange (Orange, 18.3)\r\n";
            assertEquals(expectedOutput, output.toString());


            File file = new File("fruits.txt");
            assertEquals(true, file.exists());


            file = new File("fruits.xml");
            assertEquals(true, file.exists());

    }
}