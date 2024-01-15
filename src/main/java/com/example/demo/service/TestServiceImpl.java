package com.example.demo.service;

import com.example.demo.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

@Service
public class TestServiceImpl {

    @Autowired
    TestDao testDao;

    public void run1(){
        testDao.addStr("gggg");
    }

    public void  run(){

        long start = System.currentTimeMillis();
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            // 10만개의 Virtual Thread 실행
            List<Integer> strList = new ArrayList<>();
            for(int i = 0 ; i<100_000 ; i ++) {
                strList.add(i);
            }
//
            executor.submit(() -> {
                for(Integer i : strList) {
                    testDao.addStr(i.toString());
                }
            });
//				for (int i = 0; i < 100_000; i++) {
//
//					executor.submit(() -> {
////						j.getAndIncrement();
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
