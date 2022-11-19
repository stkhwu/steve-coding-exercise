package com.ex2;

public class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int data) {
        this.value = data;
        this.next = null;
    }


    public LinkedList add(int data) {
        LinkedList temp = this;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new LinkedList(data);
        return this;
    }

    public boolean contains(int target) {
        LinkedList temp = this;
        while (temp.value != target) {
            temp = temp.next;
            if(temp == null){
                return false;
            }
        }
        return true;
    }


    public static int findSize(LinkedList head) {
        if (head == null) {
            return 0;
        }
        int size = 1;
        LinkedList temp = head;
        while (temp.next != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public static int findMiddleItem(LinkedList head) {
        int target = findSize(head) / 2;
        LinkedList temp = head;
        for (int i = 0; i < target; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    public static int findMiddleItemBetter(LinkedList head) {
        LinkedList quickPointer = head;
        LinkedList slowPointer = head;

        while (quickPointer.next != null) {
            quickPointer = quickPointer.next.next;
            slowPointer = slowPointer.next;
        }
        return slowPointer.value;
    }

}
