import java.util.*;
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
	
	public Trie() {
		root = new TrieNode('\0');
	}

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
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
	
	public TrieNode search(TrieNode root,String word)
    {
        if(word.length()==0)
            return root;
        int index=word.charAt(0)-'a';
        TrieNode child=root.children[index];
        if(child==null)
            return null;
        return search(child,word.substring(1));
    }
	public void autoComplete(ArrayList<String> input, String word) {
		// Complete this function
		// Print the output as specified in question
        for(int i=0;i<input.size();i++)
            add(input.get(i));
		TrieNode node =search(root,word);
        if(node==null||node.childCount==0)
            return;
        path(node,"",word);
	}
    public void path(TrieNode node,String output,String word) {
        if(node.childCount==0){
            if(output.length()>0){
                System.out.println(word+output);
            }
            return;
        }
        if(node.isTerminating){
            System.out.println(word+output);
        }
        for(int i=0;i<node.children.length;i++){
            if(node.children[i]!=null){
                String ans=output+node.children[i].data;
                path(node.children[i],ans,word);
            }
        }
    }
}