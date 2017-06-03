package problems;

import model.Node;

/**
 * Created by priyankalakhe on 6/3/17.
 */
public class PreOrderTraversal implements Traversal{


    @Override
    public void traverse(Node root) {

        if (root == null) {
            return ;
        }
        else{
            System.out.print(" " + root.getData() + " ");
            traverse(root.getLeft());
            traverse(root.getRight());
        }
    }
}
