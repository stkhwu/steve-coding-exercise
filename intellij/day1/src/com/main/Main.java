package com.main;

import com.ex1.FindMaxOfAnArray;
import com.ex2.LinkedList;

public class Main {
    public static void main(String[] args) {
        int[] array = {37, 43, 24, 79, 32, 98, 22};
        LinkedList note1 = new LinkedList(3);
        LinkedList note2 = new LinkedList(5);
        LinkedList note3 = new LinkedList(9);

        note1.next = note2;
        note2.next = note3;

        LinkedList note4 = new LinkedList(4);
        LinkedList note5 = new LinkedList(10);

        note1.next = note4;
        note4.next = note2;
        note3.next = note5;

        System.out.println(note1.contains(10));


        LinkedList note = new LinkedList(23);
        note.add(45);
        note.add(12);
        note.add(10);
        note.add(98);
        note.add(17);
        note.add(55);



        System.out.println(LinkedList.findSize(note));
        System.out.println(LinkedList.findMiddleItem(note));
        System.out.println(LinkedList.findMiddleItemBetter(note));

        LinkedList aNode = new LinkedList(5);
        aNode.add(2).add(1).add(4).add(0).add(3).add(7).add(6);
        System.out.println(LinkedList.findSize(aNode));
    }
}
