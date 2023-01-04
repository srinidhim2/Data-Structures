import java.util.LinkedList;

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
    public static void main(String[] args) {
        graph_linkedlist_rep g = new graph_linkedlist_rep(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        for(int i=0;i<4;i++){
            System.out.print("["+i+"]=>");
            for(int w: adj[i]){
                System.out.print(w+"->");
            }
            System.out.println();
        }
    }
}
