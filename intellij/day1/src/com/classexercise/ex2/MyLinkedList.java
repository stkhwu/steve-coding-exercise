package com.classexercise.ex2;

public class MyLinkedList {
    public int value;
    public MyLinkedList next;

    public MyLinkedList(int data) {
        this.value = data;
        this.next = null;
    }


    public MyLinkedList add(int data) {
        MyLinkedList temp = this;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new MyLinkedList(data);
        return this;
    }

    public boolean contains(int target) {
        MyLinkedList temp = this;
        while (temp.value != target) {
            temp = temp.next;
            if(temp == null){
                return false;
            }
        }
        return true;
    }


    public static int findSize(MyLinkedList head) {
        if (head == null) {
            return 0;
        }
        int size = 1;
        MyLinkedList temp = head;
        while (temp.next != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public static int findMiddleItem(MyLinkedList head) {
        int target = findSize(head) / 2;
        MyLinkedList temp = head;
        for (int i = 0; i < target; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    public static int findMiddleItemBetter(MyLinkedList head) {
        MyLinkedList quickPointer = head;
        MyLinkedList slowPointer = head;

        while (quickPointer.next != null) {
            quickPointer = quickPointer.next.next;
            slowPointer = slowPointer.next;
        }
        return slowPointer.value;
    }

}
