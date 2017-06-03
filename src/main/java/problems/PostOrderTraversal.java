package problems;

import model.Node;

/**
 * Created by priyankalakhe on 6/3/17.
 */
public class PostOrderTraversal implements Traversal{


    @Override
    public void traverse(Node root) {

        if (root == null) {
            return ;
        }
        else{
            traverse(root.getLeft());
            traverse(root.getRight());
            System.out.print(" " + root.getData() + " ");
        }
    }
}
