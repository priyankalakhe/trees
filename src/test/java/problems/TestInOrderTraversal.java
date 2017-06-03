package problems;

import model.Node;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by priyankalakhe on 6/3/17.
 */
public class TestInOrderTraversal {

    Traversal traversal;

    @Before
    public void setUp() throws Exception {
        traversal = new InOrderTraversal();
    }

    @Test
    public void shouldPrintInorderTraversal_ValidTree(){
        Node node = new Node(8, null, null);
        node.setLeft(new Node(4, null, null));
        node.setRight(new Node(10, null, null));

        traversal.traverse(node);

    }

    @Test
    public void shouldPrintInorderTraversal_EmptyTree(){
        Node node = null;
        traversal.traverse(node);
    }

    @Test
    public void shouldPrintInorderTraversal_OnlyRootNode(){
        Node node = new Node(8, null, null);
        traversal.traverse(node);
    }



}