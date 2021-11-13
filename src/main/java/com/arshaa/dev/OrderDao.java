package com.arshaa.dev;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {

	public List<Order> getOrders() {

		return Stream
				.of(new Order(101, "mobile", 1, 30000),
						new Order(43, "book", 3, 2000),
						new Order(433, "laptop", 2, 150000),
						new Order(101, "headset", 6, 3000))
				.collect(Collectors.toList());
	}
}
