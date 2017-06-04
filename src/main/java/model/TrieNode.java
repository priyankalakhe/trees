package model;

import java.util.HashMap;

/**
 * Created by priyankalakhe on 6/3/17.
 */
public class TrieNode {

    private char c;
    private boolean isEnd;
    private HashMap<Character, TrieNode> children;

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }

    public HashMap<Character, TrieNode> getChildren() {
        return children;
    }

    public void setChildren(HashMap<Character, TrieNode> children) {
        this.children = children;
    }

    public TrieNode(char c) {
        this.c = c;
        this.isEnd = false;
        this.children = new HashMap<>();
    }
}
