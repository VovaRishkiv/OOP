package com.tasks3.linkedlist;

public class LinkedList {
    private Node first;
    private Node last;
    private int size = 0;

    public LinkedList() {
    }

    public void add(Integer data) {
        Node newNode = new Node();
        newNode.setData(data);

        if (size == 0){
            first = newNode;
            }
        else{
            last.setNext(newNode);
            }

        last = newNode;
        size++;
    }

    public Integer get(int index) {
        return nodeSearchByIndex(index).getData();
    }

    public boolean delete(int index) {
        if (nodeSearchByIndex(index) != null ) {
            
            if (index == 0){
                first = first.getNext();
            }
            else{
                nodeSearchByIndex(index - 1).setNext(nodeSearchByIndex(index+1));
                }
            size--;
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    private Node nodeSearchByIndex(int index) {
        if (index < size && index >= 0) {
            Node currentN = first;
            int currentI = 0;
            while (currentI < index){
                if (currentN.getNext() != null) {
                    currentN = currentN.getNext();
                    currentI++;
                }

            }
            return currentN;
        }
        else
            return null;
    }
}  