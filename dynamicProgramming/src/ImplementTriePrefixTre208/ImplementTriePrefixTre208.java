package ImplementTriePrefixTre208;

public class ImplementTriePrefixTre208 {
    public static void main(String[] args) {
        Trie test = new Trie();
        String result = "123";
        System.out.println(result.startsWith("1111"));
    }
}


class Trie {
    private String data;

    /** Initialize your data structure here. */
    public Trie() {
        data = null;

    }
    public Trie(String data){
        this.data = data;
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        this.data = word;

    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(this.data == null) return  false;
        return word.equals(this.data);

    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if(this.data == null) return  false;
        return  this.data.startsWith(prefix);

    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */