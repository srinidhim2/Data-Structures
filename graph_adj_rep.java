class graph_adj_rep{
    static int adjMat[][];
    public graph_adj_rep(int nodes) {
        adjMat=new int[nodes][nodes];
    }
    public void addEdge(int u,int v){
            adjMat[u][v]=1;
            adjMat[v][u]=1;
    }
    public static void main(String[] args) {
        graph_adj_rep g = new graph_adj_rep(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++){
                System.out.print(adjMat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
