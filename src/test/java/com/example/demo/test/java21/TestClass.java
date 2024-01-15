package com.example.demo.test.java21;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SequencedCollection;
import java.util.concurrent.Executors;

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
        User u   = new  User("ljy","52525" ,"아파트");
        User u1   = new  User("ljy","52525" ,"아파트");

        System.out.println(u);
        System.out.println("u  eq u1 " + u.userName().equals(u1.userName()));



        if( u instanceof User(String username, String phone , String address)) {
            System.out.println(username +  phone + address) ;

        }

//        A a = null;
//        a.b = "3";
//
//        System.out.println(a.b);
//        System.out.println(a.c);


    }

    @Test
    public void recordTest(){

    }


    @Test
    public void sequenceCollectionTest(){

//        List<String> list = List.of("1","2","3","4");
//        System.out.println(list.getFirst());
//        System.out.println(list.removeFirst());
//        System.out.println(list.getFirst());
//
//
//        List<String> list2 = Arrays.asList("1","2","3","4");
//        System.out.println(list2.getFirst());
//        System.out.println(list2.removeFirst());
//        System.out.println(list2.getFirst());

        List<String> list3 = new ArrayList<>();
        list3.add("1");
        list3.add("2");
        list3.add("3");
        System.out.println(list3.getFirst());
        System.out.println(list3.removeFirst());
        System.out.println(list3.getFirst());

        System.out.println("하이");
    }


    @Test
    public void switchReturnValue  () throws Exception{

        String res ="1";
        var a= switch(res) {

            case "1" ->  "asgdasdgasdg";
            default ->  throw new IllegalStateException("Unexpected value: " + res);
        };

        System.out.println(a);

    }

    @Test
    public void virtualThread() throws Exception {

        long start = System.currentTimeMillis();
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            // 10만개의 Virtual Thread 실행
            List<Integer> strList = new ArrayList<>();
            for(int i = 0 ; i<100 ; i ++) {
                strList.add(i);
            }

            executor.submit(() -> {
                for(Integer i : strList) {
                    System.out.println( i+ "하이");
                }
            });
//				for (int i = 0; i < 100_000; i++) {
//
//					executor.submit(() -> {
//						j.getAndIncrement();
//						Thread.sleep(Duration.ofSeconds(2));
//
//						return null;
//					});
//				}

        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");

    }






}
