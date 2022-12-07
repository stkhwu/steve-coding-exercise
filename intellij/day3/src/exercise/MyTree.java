package exercise;

public class MyTree {
    int value;
    MyTree left;
    MyTree right;

    public MyTree(int value) {
        this.value = value;
    }

    public MyTree getLeft() {
        return left;
    }

    public MyTree getRight() {
        return right;
    }

    public static MyTree BinaryTreeSearch(MyTree current, int target) {
        if (current == null) {
            return null;
        }
        if (target < current.value && current.left != null) {
            BinaryTreeSearch(current.left, target);
        }
        if (target > current.value && current.left != null) {
            BinaryTreeSearch(current.right, target);
        }
        return current;
    }

    public MyTree BinaryTreeInsert(MyTree current, int value) {
        if (current == null) {
            return new MyTree(value);
        }

        if (value < current.value) {
            current.left = BinaryTreeInsert(current.left, value);
        } else if (value > current.value) {
            current.right = BinaryTreeInsert(current.right, value);
        }
        return current;
    }
}
