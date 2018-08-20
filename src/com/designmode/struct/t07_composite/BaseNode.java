package com.designmode.struct.t07_composite;

public abstract class BaseNode {
	protected String name;
	public abstract void addNode(BaseNode node);
	public abstract void deleteNode(BaseNode node);
	public abstract  void display();
	@Override
	public String toString() {
		return "BaseNode [name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
