package com.arshaa.dev;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/orders")
public class OrderCiCdApplication {

	@Autowired
	private OrderDao dao;

	public List<Order> fetchOrders() {
		return dao.getOrders();
	}

	public static void main(String[] args) {
		SpringApplication.run(OrderCiCdApplication.class, args);
	}

}
