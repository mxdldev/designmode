package com.designmode.struct.t07_composite;
/**
 * 组合模式：建立了一种数据结构，模糊了简单对象和复杂对象之间的概念
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		LeafNode node1 = new LeafNode();
		node1.setName("node1");
		
		LeafNode node2 = new LeafNode();
		node2.setName("node2");
		
		BranchNode root = new BranchNode();
		root.addNode(node1);
		root.addNode(node2);
		root.display();
	}
}
