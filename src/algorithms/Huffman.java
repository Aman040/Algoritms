package algorithms;
import java.util.*;
class Node
{
	int data;
	char c;
	Node left;
	Node right;
}

class MyComparator implements Comparator<Node>
{
	public int compare(Node x,Node y) {
		return x.data-y.data;
	}
}
public class Huffman {
	
public static void printCode(Node root,String s) {
	if(root.left==null && root.right==null && Character.isLetter(root.c)) {
		System.out.println(root.c + ": "+ s);
		return;
	}
	printCode(root.left,s+"0");
	printCode(root.right,s+"1");
}


	public static void main(String[] args) {
		
		int n=2;
		char ch[]= { 'a', 'b' };
		int freq[]= { 5, 9};
		PriorityQueue<Node> q=new PriorityQueue<>(n,new MyComparator());
		for(int i=0;i<n;i++) {
			Node huff=new Node();
			huff.c=ch[i];
			huff.data=freq[i];
			huff.left=null;
			huff.right=null;
			q.add(huff);
		}
		Node root=null;
		while(q.size()>1) {
			Node x=q.peek();
			q.poll();
			Node y=q.peek();
			q.poll();
			Node f=new Node();
			f.data=x.data+y.data;
			f.c='-';
			f.left=x;
			f.right=y;
			root=f;
			q.add(f);
		}
		printCode(root, "");
	}
}


