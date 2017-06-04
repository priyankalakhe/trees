package problems;

import model.Node;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import static com.google.common.primitives.Ints.max;

/**
 * Created by priyankalakhe on 6/3/17.
 */
public class BinarySearchTree<T> {

    private Node root;

    public void insert(Node root, T data){
        throw new NotImplementedException();
    }

    public int countDepth(Node root){
        if (null == root) {
            return 0;
        }
        else{
            return (max(countDepth(root.getLeft()), countDepth(root.getRight())) + 1);
        }
    }

    public void delete(Node root){
        throw new NotImplementedException();
    }

    public T getMin(Node root) {
        if ( null == root ){
            return null;
        } else if (null == root.getLeft()) {
            return (T) root.getData();
        } else {
            return getMin(root.getLeft());
        }
    }

    public T getMax(Node root){
        if ( null == root ){
            return null;
        } else if (null == root.getRight()) {
            return (T) root.getData();
        } else {
            return getMin(root.getRight());
        }
    }

    public boolean hasPathSum(Node root, int sum){
        if(null == root) {
            return sum == 0;
        }
        else{
            int subsum = (int)sum - (int)root.getData();
            return hasPathSum(root.getLeft(), subsum) || hasPathSum(root.getRight(), subsum);
        }
    }

}
