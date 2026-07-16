class TrieNode {
    TrieNode[] links;
    boolean isEnd;

    public TrieNode(){
        links = new TrieNode[26];
        isEnd = false;
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
        isEnd = true;
    }

    public boolean isEnd(){
        return isEnd;
    }
}
class WordDictionary {
    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr = root;

        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(!curr.containsKey(ch)) curr.put(ch, new TrieNode());
            curr = curr.get(ch);
        }
        curr.setEnd();
    }

    public boolean search(String word) {
        return backtrack(word, 0, root);
    }

    public boolean backtrack(String word, int ind, TrieNode node){
        if(ind == word.length()) return node.isEnd();

        char ch = word.charAt(ind);

        if(ch == '.'){

            for(int i = 0; i < 26; i++){
                if(node.links[i] != null && backtrack(word, ind + 1, node.links[i])){
                    return true;
                }
            }
            return false;
        }else{
            if(!node.containsKey(ch)) return false;
            return backtrack(word, ind + 1, node.get(ch));
        }
    }
}
