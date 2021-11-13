package com.arshaa.dev;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Order {

	private int id;
	private String name;
	private int quantity;
	private long price;

	public Order(int id, String name, int quantity, long price) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

}
