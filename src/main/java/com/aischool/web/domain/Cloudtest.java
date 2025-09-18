package com.aischool.web.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cloudtest {
	
	@Id
	private Long id;
	private String name;
	private String gender;
	private int age;
	
}
