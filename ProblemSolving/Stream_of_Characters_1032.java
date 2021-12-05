
public class StreamChecker {
    class TrieNode {
    char data;
    boolean isTerminating;
    TrieNode[] children;
    
    TrieNode(char data) {
        this.data = data;
        this.isTerminating = false;
        children  = new TrieNode[26];
    }    
    }
class Trie {
        public TrieNode root;
        Trie(){
            root = new TrieNode('\0');
        }
        public void add(TrieNode root,String word){
            if(word.length()==0){
                root.isTerminating = true;
                return ;
            }
            int childIndex = word.charAt(0) - 'a';
            TrieNode child = root.children[childIndex];
            if(child == null){ 
                child = new TrieNode(word.charAt(0));
                root.children[childIndex] = child; 
            }
            add(child,word.substring(1));
        }
        public void add(String word){
            add(root,word);
        }
        
        public boolean search(Deque<Character> c){
		return search(root, c);
	}

	private boolean search(TrieNode root, Deque<Character> s) {
		for(char c: s){
                if(root.children[c-'a'] == null) return false;
                root = root.children[c-'a'];
                if(root.isTerminating) return true;
            }
            return false;
        }
    }
    public Trie trie = new Trie();
    public Deque<Character> stream = new LinkedList<>();
    
    public StreamChecker(String[] words) {
        for(String word : words){
            trie.add(new StringBuilder(word).reverse().toString());
        }
    }
    
    public boolean query(char letter) {        
        stream.addFirst(letter);
        return trie.search(stream);
    }
}
