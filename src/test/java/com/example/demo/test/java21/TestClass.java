package com.example.demo.test.java21;

import org.junit.jupiter.api.Test;

public class TestClass {

    @Test
    public void switchTest1(){
        int month = 4;
        String season = switch(month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Fall";
            default -> "Unknown";
        };
        System.out.println(season);
    }
    public enum Status {
        SUBSCRIBER,
        FREE_TRIAL,
        OTHER_STATUS
    }

    @Test
    public void switchTest(){
        Status status = Status.SUBSCRIBER;
        boolean result = switch (status) {
            case SUBSCRIBER -> true;
            case FREE_TRIAL -> false;
            default -> throw new IllegalArgumentException("something is murky!");
        };
        System.out.println(result);
    }

    @Test
    public void MultilineStringTest(){
        String TEXT_BLOCK_JSON = """
                                        {
                                            "name" : "Baeldung",
                                            "website" : "https://www.%s.com/"
                                        }
                                    """;

        System.out.println(TEXT_BLOCK_JSON);

    }

    @Test
    public void instanceTest() {

        Object obj = "hiroo";
        Object obj2 = 3;

        class A {
            public String b;
            public String c;
        }

//        if( obj instanceof String s ) {
//            System.out.println(s);
//        }
//
//        if(obj2 instanceof Integer i ) {
//            System.out.println( i ) ;
//        }
        A a = null;
        a.b = "3";

        System.out.println(a.b);
        System.out.println(a.c);
    }

    @Test
    public void recordTest(){

    }




}
