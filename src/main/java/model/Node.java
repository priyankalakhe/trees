package model;

/**
 * Created by priyankalakhe on 6/3/17.
 */
public class Node<T> {

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    private T data;

    private Node left, right;


    public Node(T data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }


}
