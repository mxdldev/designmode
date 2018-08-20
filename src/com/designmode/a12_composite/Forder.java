package com.designmode.a12_composite;

import java.util.ArrayList;
import java.util.List;

public class Forder extends BaseNode {
	private List<BaseNode> listNode = new ArrayList<BaseNode>();	
	@Override
	public void addNode(BaseNode node) {
		listNode.add(node);
	}

	@Override
	public void deleteNode(BaseNode node) {
		listNode.remove(node);
	}

}
