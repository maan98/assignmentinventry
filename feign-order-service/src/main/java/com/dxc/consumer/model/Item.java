package com.dxc.consumer.model;


public class Item {
	
	private int id;
	private String description;
	private int qty;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int id, String description, int qty) {
		super();
		this.id = id;
		this.description = description;
		this.qty = qty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + qty;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (qty != other.qty)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", description=" + description + ", qty=" + qty + "]";
	}

}
