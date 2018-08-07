package com.ds;

public class LinkedList {

	private Node HEAD;
	private int count;

	public int size() {
		return count;
	}

	public void printNodes() {
		Node topNode = HEAD;
		int tempCounter = count;
		while (tempCounter != 0) {
			System.out.println(topNode.data);
			topNode = topNode.next;
			tempCounter--;
		}
	}

	public void add(String data) {
		Node node = new Node(data);
		// HEAD always set on first element of list
		if (HEAD == null) {
			HEAD = node;
			count += 1;
			return;
		}

		// new node add at last
		Node temp = HEAD;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
		count++;
	}

	public void remove() {
		if (HEAD == null) {
			System.out.println("Linkedlist is empty");
		} else {
			Node temp = HEAD;
			while (temp.next != null) {
				temp = temp.next;
			}
			System.out.println(temp.data + " remove element");
			temp.next = null;
			count--;
		}
	}
}