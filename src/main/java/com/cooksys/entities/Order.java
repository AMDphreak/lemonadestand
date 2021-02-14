package com.cooksys.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="order_table")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Order {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false)
	private double total;
	
	@OneToMany()
	private List<Lemonade> lemonades;
	
}
