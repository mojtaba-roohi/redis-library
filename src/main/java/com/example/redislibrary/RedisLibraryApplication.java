package com.example.redislibrary;

import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RedisLibraryApplication implements CommandLineRunner  {
	@Autowired
	private  ApplicationContext appContext;
	public static void main(String[] args)  {
		SpringApplication.run(RedisLibraryApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		RedissonClient redis=appContext.getBean(RedissonClient.class);

		System.out.print("redis keys Count: " +redis.getKeys().count());
//		String[] beans = appContext.getBeanDefinitionNames();
//		for(String bean:beans){
//			System.out.println("Bean name: " + bean);
//			Object object = appContext.getBean(bean);
//			System.out.println( "Bean object:" + object);
//		}
	}
}
