package algorithms;
import java.util.*;
public class Bfs {
	int v;
	ArrayList<Integer> adj[];
	Bfs(int v){
		this.v=v;
		adj=new ArrayList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new ArrayList();
		}
	}
	void addEdge(int u,int w) {
		adj[u].add(w);
	}
	void breadthFirstSearch(int s) {
		boolean visited[]=new boolean[v];
		LinkedList<Integer> q=new LinkedList<Integer>();
		q.add(s);
		visited[s]=true;
		while(q.size() !=0) {
			s=q.poll();
			System.out.println(s+ " ");
			Iterator<Integer> itr =adj[s].iterator();
			while(itr.hasNext()) {
				int n=itr.next();
				if(!visited[n]) {
					visited[n]=true;
					q.add(n);
							
				}
				
			}
		}
		
	}

	public static void main(String[] args) {
		Bfs g=new Bfs(4);
		g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
        g.breadthFirstSearch(2);

	}

}
