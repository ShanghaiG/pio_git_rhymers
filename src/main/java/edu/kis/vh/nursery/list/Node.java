package edu.kis.vh.nursery.list;

public class Node {

	private int value;
	private Node previousNode;
	private Node nextNode;

	public Node(int i) {
		value = i;
	}

	protected int getValue() {
		return value;
	}

	protected void setValue(int value) {
		this.value = value;
	}

	protected Node getPreviousNode() {
		return previousNode;
	}

	protected void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}

	protected Node getNextNode() {
		return nextNode;
	}

	protected void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

}
