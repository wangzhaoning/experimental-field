package com.wzn.collection;


public class LinkedTest {
    private Node node = new Node();

    public void insert(int index, int value) {

    }

    public void insertHead(int value) {
        Node nodeHead = node.getHead();
        if (nodeHead != null) {
            Node newNode = new Node();
            newNode.setVal(value);
            nodeHead.setHead(newNode);
        }
    }

    public void put(int value) {
        Node nodeEnd = node;
        while (nodeEnd.getEnd() != null) {
                nodeEnd = nodeEnd.getEnd();
        }
        Node newNode = new Node();
        newNode.setVal(value);
        nodeEnd.setEnd(newNode);
    }

    @Override
    public String toString(){
        return node.toString();
    }
}

class Main{
    public static void main(String[] args) {
        LinkedTest linkedTest = new LinkedTest();
        linkedTest.put(1);
        linkedTest.put(2);
        System.out.println(linkedTest);

//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.add(1);
//        linkedList.add(2);
//        System.out.println(linkedList);


    }
}
