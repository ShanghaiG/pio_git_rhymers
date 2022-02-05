package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int valOfEmptyList = -1;

	private Node lastNode;
	// private final int unusedVariable; -> Ta zmienna nie jest nigdzie używana

	public void push(int i) {
		if (lastNode == null)
			lastNode = new Node(i);
		else {
			lastNode.setNextNode(new Node(i));
			lastNode.getNextNode().setPreviousNode(lastNode);
			lastNode = lastNode.getNextNode();
		}
	}

	public boolean isEmpty() {
		return lastNode == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return valOfEmptyList;
		return lastNode.getValue();
	}

	public int pop() {
		if (isEmpty())
			return valOfEmptyList;
		int ret = lastNode.getValue();
		lastNode = lastNode.getPreviousNode();
		return ret;
	}

}
