package com.designmode.a12_composite;

public abstract class BaseNode {
	public String name;
	public abstract void addNode(BaseNode node);
	public abstract void deleteNode(BaseNode node);
}
