package com.engineering.commerce.entities;

import java.util.List;

public class ProductCategory {
	private String id;
	private String name;
	private String slug;
	private String description;
	private String orderHint;
	private String externalId;
	private String metaTitle;
	private String metaDescription;
	private String metaKeywords;

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSlug() {
		return slug;
	}

	public String getDescription() {
		return description;
	}

	public String getOrderHint() {
		return orderHint;
	}

	public String getExternalId() {
		return externalId;
	}

	public String getMetaTitle() {
		return metaTitle;
	}

	public String getMetaDescription() {
		return metaDescription;
	}

	public String getMetaKeywords() {
		return metaKeywords;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setOrderHint(String orderHint) {
		this.orderHint = orderHint;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}


}