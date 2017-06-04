package problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by priyankalakhe on 6/3/17.
 */
public class TestTrieOperations {

    TrieOperations trie;

    @Before
    public void setUp() throws Exception {
        trie = new TrieOperations();
    }

    @Test
    public void shouldInsertAndFindInsertedTrieNode(){
        trie.insert("the");
        trie.insert("a");
        trie.insert("there");
        trie.insert("any");
        trie.insert("answer");
        trie.insert("their");

        assertTrue(trie.contains("the"));
        assertTrue(trie.contains("any"));
        assertFalse(trie.contains("abs"));
        assertFalse(trie.contains("then"));

        assertEquals("there", trie.findLongestPrefix("thereby"));
        assertEquals("the", trie.findLongestPrefix("then"));
        assertEquals("answer", trie.findLongestPrefix("answered"));
    }

    @Test
    public void shouldFindLongestPrefix(){
        trie.insert("the");
        trie.insert("a");
        trie.insert("there");
        trie.insert("any");
        trie.insert("answer");
        trie.insert("their");

        assertEquals("there", trie.findLongestPrefix("thereby"));
        assertEquals("the", trie.findLongestPrefix("then"));
        assertEquals("answer", trie.findLongestPrefix("answered"));
    }


}