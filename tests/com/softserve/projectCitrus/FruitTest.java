package com.softserve.projectCitrus;

import org.junit.Test;
import org.junit.Before;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class FruitTest {

        private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    Scanner sc = new Scanner(System.in);
        @Before
        public void setUpStreams() {
            System.setOut(new PrintStream(outContent));
            System.setErr(new PrintStream(errContent));
        }

        @Test
        public void testGetName() {
            Fruit fruit = new Fruit("Apple", "Green");
            assertEquals("Apple", fruit.getName());
        }

        @Test
        public void testGetColor() {
            Fruit fruit = new Fruit("Apple", "Green");
            assertEquals("Green", fruit.getColor());
        }

        @Test
        public void testInput() throws IOException {
            String input = "Banana\nYellow\n";
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            Fruit fruit = new Fruit("", "");
            fruit.input();
            assertEquals("Banana", fruit.getName());
            assertEquals("Yellow", fruit.getColor());
        }

        @Test
        public void testPrint() {
            Fruit fruit = new Fruit("Apple", "Green");
            fruit.print();
            assertEquals("Name: Apple\nColor: Green\n", outContent.toString());
        }

        @Test
        public void testPrintWithWriter() {
            Fruit fruit = new Fruit("Apple", "Green");
            PrintWriter pw = new PrintWriter(System.out);
            fruit.print(pw);
            pw.flush();
            assertEquals("Name: Apple\nColor: Green\n", outContent.toString());
        }

        @Test
        public void testToString() {
            Fruit fruit = new Fruit("Apple", "Green");
            assertEquals("Fruit{name='Apple', color='Green'}", fruit.toString());
        }
    }
