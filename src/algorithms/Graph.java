package algorithms;

import java.util.ArrayList;

public class Graph {
	int v;
	ArrayList<Integer> adj[];
	Graph(int v){
		this.v=v;
		adj=new ArrayList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new ArrayList();
		}
	}
	public void addEdge(int u,int w) {
		adj[u].add(w);
	}
	public void printGraph() {
		for(int i=0;i<v;i++) {
			System.out.println("list of vertex " + i);
			for(int j=0;j<adj[i].size();j++) {
				System.out.print("->"+ adj[i].get(j));
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Graph g=new Graph(5);
		g.addEdge(0,1);
		g.addEdge(0,4);
		g.addEdge(1,2);
		g.addEdge(1,3);
		g.addEdge(1,4);
		g.addEdge(2,3);
		g.addEdge(3,4);
		g.printGraph();

	}

}
