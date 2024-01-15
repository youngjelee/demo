package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
public class LeejyApplication {

	public static void main(String[] args) throws Exception {
		System.out.println("메인 메소드 실행 ");
		SpringApplication.run(LeejyApplication.class, args);
	}




}
