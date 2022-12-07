import exercise.BinarySearch;
import exercise.Ex1;
import exercise.MyTree;

import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println(Ex1.firstNonRepeatingChar("loveleetcode"));

        System.out.println(Ex1.firstNonRepeating("loveleetcode"));


        Map<Integer, Integer> map = new HashMap<>();
        int[] integers = new int[]{5, 9, 6, 10, 3, 8, 1};

        for (int i : integers) {
            map.put(i, i);
        }

        map.forEach((a, b) -> System.out.println("Key: " + a + " Value: " + b));

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() == 3) {
                map.remove(entry);
            }
        }

        System.out.println(map);

        MyTree myTree = new MyTree(8);
        myTree.BinaryTreeInsert(myTree,23);
        myTree.BinaryTreeInsert(myTree,3);
        myTree.BinaryTreeInsert(myTree,11);
        myTree.BinaryTreeInsert(myTree,5);
        myTree.BinaryTreeInsert(myTree,1);

        System.out.println(BinarySearch.binarySearch(new int[]{-1,0,3,5,9,12}, 9));
    }
}