package ru.gb.springhwl3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.gb.springhwl3.demo.SecondBean;

@SpringBootApplication
public class SpringHwL3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringHwL3Application.class, args);

		context.getBean(SecondBean.class).postConstruct();

		/*
		1. контроллеры (controllers, api)
		2. Сервисный слой (services)
		3. Репозиторий (repository, dao)
		4. Сущности (entity, model)

		/book/**
		/reader/**
		/issue/**
		 */
	}

}
