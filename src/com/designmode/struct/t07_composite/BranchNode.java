package com.designmode.struct.t07_composite;

import java.util.ArrayList;
import java.util.List;

public class BranchNode extends BaseNode {
	private List<BaseNode> listNode = new ArrayList<BaseNode>();
	@Override
	public void addNode(BaseNode node) {
		listNode.add(node);
	}

	@Override
	public void deleteNode(BaseNode node) {
		listNode.remove(node);
	}

	@Override
	public void display() {
		for(BaseNode node : listNode)
			System.out.println(node.toString());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
