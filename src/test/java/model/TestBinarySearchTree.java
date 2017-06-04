package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by priyankalakhe on 6/3/17.
 */
public class TestBinarySearchTree {

    BinarySearchTree tree;

    @Before
    public void setUp() throws Exception {
        tree = new BinarySearchTree();
    }

    @Test
    public void shouldShowMin(){
        Node node = new Node(8, null, null);
        node.setLeft(new Node(4, null, null));
        node.setRight(new Node(10, null, null));

        assertEquals(4, tree.getMin(node));
    }

    @Test
    public void shouldShowMinForEmptyTree(){
        Node node = null;
        assertEquals(null, tree.getMin(node));
    }

    @Test
    public void shouldShowMinForTreeWithNoLeftSubTree(){
        Node node = new Node(8, null, null);
        node.setRight(new Node(10, null, null));
        Node rightRight = node.getRight();
        rightRight.setRight(new Node(21, null, null));
        assertEquals(8, tree.getMin(node));
    }

    @Test
    public void shouldShowMax(){
        Node node = new Node(8, null, null);
        node.setLeft(new Node(4, null, null));
        node.setRight(new Node(10, null, null));

        assertEquals(10, tree.getMax(node));
    }

    @Test
    public void shouldShowMaxForEmptyTree(){
        Node node = null;
        assertEquals(null, tree.getMax(node));
    }

    @Test
    public void shouldShowMaxForTreeWithNoRightSubTree(){
        Node node = new Node(8, null, null);
        node.setLeft(new Node(6, null, null));
        Node leftleft = node.getLeft();
        leftleft.setLeft(new Node(2, null, null));
        assertEquals(8, tree.getMax(node));
    }

    @Test
    public void shouldShowDepth(){
        Node node = new Node(8, null, null);
        node.setLeft(new Node(4, null, null));
        node.setRight(new Node(10, null, null));

        assertEquals(2, tree.countDepth(node));
    }

    @Test
    public void shouldShowDepthForImbalancedTree(){
        Node node = new Node(8, null, null);
        node.setLeft(new Node(6, null, null));
        Node leftleft = node.getLeft();
        leftleft.setLeft(new Node(2, null, null));

        Node leftleftleft = leftleft.getLeft();
        leftleftleft.setLeft(new Node(-2, null, null));
        assertEquals(4, tree.countDepth(node));
    }

    @Test
    public void shouldShowPathSum(){
        Node node = new Node(8, null, null);
        node.setLeft(new Node(6, null, null));
        Node leftleft = node.getLeft();
        leftleft.setLeft(new Node(2, null, null));

        Node leftleftleft = leftleft.getLeft();
        leftleftleft.setLeft(new Node(-2, null, null));

        assertTrue(tree.hasPathSum(node, 14));
        assertFalse(tree.hasPathSum(node, 10));
    }

}