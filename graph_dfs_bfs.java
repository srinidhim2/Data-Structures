import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//using Linked List representation

public class graph_linkedlist_rep {
    static LinkedList<Integer>[] adj;
    public graph_linkedlist_rep(int nodes){
            this.adj=new LinkedList[nodes];
            for(int i=0;i<nodes;i++){
                this.adj[i]=new LinkedList<>();
            }
    }
    public void addEdge(int u,int v){
        this.adj[u].add(v);
        this.adj[v].add(u);
    }
    public void bfs(int s,int vertices){
        boolean[] visited = new boolean[vertices];
        Queue<Integer> q = new LinkedList<>();
        visited[s]=true;
        q.offer(s);
        while(!q.isEmpty()){
            int u=q.poll();
            System.out.print(u+" ");
            for(int v:adj[u]){
                if(!visited[v]){
                    visited[v]=true;
                    q.offer(v);
                }
            }
        }
    }
    public void dfs(int s,int vertices){
        boolean[] visited = new boolean[vertices];
        Stack<Integer> st= new Stack<>();
        st.push(s);
        while(!st.isEmpty()){
            int u=st.pop();
            if(!visited[u]){
                visited[u]=true;
                System.out.print(u+" ");
                for(int v: adj[u]){
                    if(!visited[v])
                        st.push(v);
                }

            }
        }
    }
    public static void main(String[] args) {
        int vertices=5;
        graph_linkedlist_rep g = new graph_linkedlist_rep(vertices);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.addEdge(2, 4);
        for(int i=0;i<vertices;i++){
            System.out.print("["+i+"]=>");
            for(int w: adj[i]){
                System.out.print(w+"->");
            }
            System.out.println();
        }
        g.bfs(0,vertices);
        System.out.println();
        g.dfs(0,vertices);
    }
}
