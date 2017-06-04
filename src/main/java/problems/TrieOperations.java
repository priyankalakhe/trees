package problems;

import model.TrieNode;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Map;

/**
 * Created by priyankalakhe on 6/3/17.
 */
public class TrieOperations {

    TrieNode root;

    public void insert(final String word){

        if(root == null){
            root = new TrieNode((char)0);
        }
        TrieNode currentTrieNode = root;

        for(int level = 0 ; level < word.length(); level++){
            Map<Character, TrieNode> child = currentTrieNode.getChildren();
            char ch = word.charAt(level);

            if(child.containsKey(ch)){
                currentTrieNode = child.get(ch);
            }
            else{
                TrieNode newChildNode = new TrieNode(ch);
                child.put(ch, newChildNode);
                currentTrieNode = newChildNode;
            }
        }

        currentTrieNode.setEnd(true);
    }

    public void delete(final String word){
        // search key not present
        // search key present and unique (i.e. not prefix for anything)
        // search key present and is prefix
        // search key present and has another key as prefix
        throw new NotImplementedException();
    }

    public boolean contains(final String word){
        TrieNode currentTrieNode = root;
        boolean found = true;

        for(int level = 0 ; level < word.length(); level++) {
            Map<Character, TrieNode> child = currentTrieNode.getChildren();
            char ch = word.charAt(level);
            if (child.containsKey(ch)) {
                currentTrieNode = child.get(ch);
            } else {
                found = false;
            }
        }
        return found;
    }

    public String findLongestPrefix(final String word){
        TrieNode currentTrieNode = root;
        StringBuilder sb = new StringBuilder();

        for(int level = 0 ; level < word.length(); level++) {
            Map<Character, TrieNode> child = currentTrieNode.getChildren();
            char ch = word.charAt(level);
            if (child.containsKey(ch)) {
                sb.append(ch);
                currentTrieNode = child.get(ch);
            } else {
                break;
            }
        }
        return sb.toString();
    }



}
