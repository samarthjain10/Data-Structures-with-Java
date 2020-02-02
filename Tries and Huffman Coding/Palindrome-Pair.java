import java.util.ArrayList;

class TrieNode{

    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

    public TrieNode(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}

public class Trie {

    private TrieNode root;
    public int count;
    public Trie() {
        root = new TrieNode('\0');
    }

    private void add(TrieNode root, String word){
        if(word.length() == 0){
            if (!root.isTerminating) {
                root.isTerminating = true;
                return;
            }else{ 
                return;
            }
            
            
        }		
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        add(child, word.substring(1));

    }

    public void add(String word){
        add(root, word);
    }



    public boolean search(TrieNode root,String word)
    {
        if(word.length()==0)
            return root.isTerminating;
        int index=word.charAt(0)-'a';
        TrieNode child=root.children[index];
        if(child==null)
            return false;
        return search(child,word.substring(1));
    }
    public String reverse(String a)
    {
        String b="";
        for(int i=a.length()-1;i>=0;i--)
        {
            b+=a.charAt(i);
        }
        return b;
    }
    public boolean findPalindromePair(ArrayList<String> vect) {
        // Complete this function
        // Return the output as specified in question
        for(int i=0;i<vect.size();i++)
        {
            add(vect.get(i));
        }
        for(int i=0;i<vect.size();i++)
        {
            String a=vect.get(i),b=reverse(vect.get(i));
            if(search(root,b))
                return true;
            else if(search(root,reverse(a.substring(0,a.length()-1))))
                return true;
            
        }
        return false;
    }
}