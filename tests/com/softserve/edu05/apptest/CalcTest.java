package com.softserve.edu05.apptest;

import org.junit.*;

public class CalcTest {
    private static Calc calc;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
        calc = new Calc();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("@AfterClass tearDownAfterClass()");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("\t@Before setUp()");
    }

    @Before
    public void setUp2() throws Exception {
        System.out.println("\t@Before setUp2()");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("\t@After tearDown()");
    }

    @Test(expected = ArithmeticException.class)
    public void testException() {
        System.out.println("\t\t@Test testException()");
        int i = 0;
        i = 10 / i;
        System.out.println("\t\t\ti = " + i);
    }

    @Test
    public void testAdd1() {
        System.out.println("\t\t@Test testAdd1()");
        //Assert.fail("Not yet implemented");


        //int i = 0;
        double i = 0;
        i = 10 / i;
        System.out.println("\t\t\ti = " + i);
//        throw new RuntimeException("Hahaha");


        Calc calc = new Calc();
        double actual;
        double expected;

        actual = calc.add(4, 5);
        expected = 9.0001;

        Assert.assertEquals(expected, actual, 0.001);
        System.out.println("\t\t@Test testAdd1() - work correct");
    }

    @Test
    public void testAdd2() {
        System.out.println("\t\t@Test testAdd2()");
        //
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        actual = calc.add(4, 6);
        expected = 10;
        //
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testDiv1() {
        System.out.println("\t\t@Test testDiv1()");
        //
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        actual = calc.div(20, 4);
        expected = 5;
        //
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testDiv2() {
        System.out.println("\t\t@Test testDiv2()");
        //
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        actual = calc.div(20, 8);
        expected = 2.5;
        //
        Assert.assertEquals(expected, actual, 0.001);
    }

}

