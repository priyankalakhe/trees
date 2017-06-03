package problems;

import model.Node;

/**
 * Created by priyankalakhe on 6/3/17.
 */
public class InOrderTraversal implements Traversal{


    @Override
    public void traverse(Node root) {

        if (root == null) {
            return ;
        }
        else{
            traverse(root.getLeft());
            System.out.print(" " + root.getData() + " ");
            traverse(root.getRight());
        }
    }
}
