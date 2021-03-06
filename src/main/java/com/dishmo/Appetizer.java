package com.dishmo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Appetizer {

	@Id
	@GeneratedValue
	private Long appetizerId;

	private String name;
	private String price;
	private String imageUrl;
	private String imageUrl2;
	private String imageUrl3;

	@ManyToOne
	private SampleMenu sampleMenu;

	public Long getAppetizerId() {
		return appetizerId;
	}

	public String getName() {
		return name;
	}

	public String getPrice() {
		return price;
	}

	public SampleMenu getSampleMenu() {
		return sampleMenu;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getImageUrl2() {
		return imageUrl2;
	}

	public String getImageUrl3() {
		return imageUrl3;
	}

	private Appetizer() {

	}

	public Appetizer(String name, String price, SampleMenu sampleMenu, String imageUrl, String imageUrl2,
			String imageUrl3) {
		this.name = name;
		this.price = price;
		this.sampleMenu = sampleMenu;
		this.imageUrl = imageUrl;
		this.imageUrl2 = imageUrl2;
		this.imageUrl3 = imageUrl3;
	}

}
