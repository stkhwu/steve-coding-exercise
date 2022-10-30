package com.leetcode;

public class MergeTwoSortedList {
  public static void main(String[] args) {
    ListNode a = new ListNode(5);
    ListNode b = new ListNode(1, new ListNode(3, new ListNode(4)));

    a.print();

    Merge.mergeTwoLists(a, b).print();

    // MergeTwoSortedListsSolution.mergeTwoLists(a, b).printString();
  }
}

class Merge {
  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        list1.next = mergeTwoLists(list1.next, list2);
        return list1;
      }

      if (list2.val < list1.val) {
        list2.next = mergeTwoLists(list2.next, list1);
        return list2;
      }
    }
    return list1 == null ? list2 : list1;
  }
}



class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public String printString() {
    return val + ((next == null) ? "" : " " + next.printString());
  }

  public void print() {
    System.out.println(printString());
  }
}