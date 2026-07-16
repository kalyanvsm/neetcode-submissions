class TrieNode {
    TrieNode[] links;
    boolean flag;

    public TrieNode(){
        links = new TrieNode[26];
        flag = false;
    }

    public boolean containsKey(char ch){
        return links[ch - 'a'] != null;
    }

    public void put(char ch, TrieNode node){
        links[ch - 'a'] = node;
    }

    public TrieNode get(char ch){
        return links[ch - 'a'];
    }

    public void setEnd(){
        flag = true;
    }

    public boolean isEnd(){
        return flag;
    }

}

class PrefixTree {
    public TrieNode root;

    public PrefixTree() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode curr = root;
        for(int i = 0; i < word.length(); i++){
            if(!curr.containsKey(word.charAt(i))){
                curr.put(word.charAt(i), new TrieNode());
            }

            curr = curr.get(word.charAt(i));
        }
        curr.setEnd();
    }

    public boolean search(String word) {
        TrieNode curr = root;
        for(int i = 0; i < word.length(); i++){
            if(!curr.containsKey(word.charAt(i))) return false;
            curr = curr.get(word.charAt(i));
        }
        return curr.isEnd();
    }

    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for(int i = 0; i < prefix.length(); i++){
            if(!curr.containsKey(prefix.charAt(i))) return false;
            curr = curr.get(prefix.charAt(i));
        }
        return true;
    }
}
