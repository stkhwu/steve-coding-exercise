package questions.algoexpert.removeduplicatesfromlinkedlist;

public class RemoveDuplicatesFromLinkedList {

  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
    // Write your code here.
    LinkedList currentNode = linkedList;
    
    while (currentNode != null) {
      LinkedList nextDistinctNode = currentNode.next;
      while (nextDistinctNode != null && nextDistinctNode.value == currentNode.value) {
        nextDistinctNode = nextDistinctNode.next;
      }

      currentNode.next = nextDistinctNode;
      currentNode = nextDistinctNode;
    }

    

    return linkedList;
  }
}
