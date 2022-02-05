package edu.kis.vh.nursery.list;

/**
 * W klasie przechowywane są elementy dla listy dwukierunkowej
 * 
 * @author Bartlomiej Olubek
 */

public class Node {

	private int value;
	private Node previousNode;
	private Node nextNode;

	/**
	 * Konstruktor ustawiający początkową wartość węzła
	 * 
	 * @param i
	 */
	public Node(int i) {
		value = i;
	}

	/**
	 * Getter pobierający wartość węzła
	 * 
	 * @return value
	 */
	protected int getValue() {
		return value;
	}

	/**
	 * Getter pobierający porzednią wartość węzła
	 * 
	 * @return previousNode
	 */
	protected Node getPreviousNode() {
		return previousNode;
	}

	/**
	 * Setter ustawiający poprzednią wartość węzła
	 * 
	 * @param previousNode
	 */
	protected void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}

	/**
	 * Getter pobierający wartość następnego węzła
	 * 
	 * @return nextNode
	 */
	protected Node getNextNode() {
		return nextNode;
	}

	/**
	 * Setter ustawiający wartość następnego węzła
	 * 
	 * @param nextNode
	 */
	protected void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

}
