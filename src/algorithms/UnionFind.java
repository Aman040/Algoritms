package algorithms;
import java.util.*;
public class UnionFind {
	int v;
	int e=0;
	ArrayList<Integer> adj[];
	UnionFind(int v){
		this.v=v;
		adj=new ArrayList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new ArrayList<Integer>();
		}
	}

	public void addEdge(int u,int w){
		adj[u].add(w);
		e++;
	}
	

	public static void main(String[] args) {
		UnionFind g=new UnionFind(3);
		g.addEdge(0,1);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		System.out.println(g.e);
	}

}
