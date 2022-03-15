// Saar Amsalem 315473066
// Noa Ben Sahel 208933440
package algo1;
import java.util.*;


public class Graph {

    private int numOfNodes;
    private boolean directed;
    private boolean weighted;
    private double[][] matrix;
    private double[] edges;
    private double[] parents;
    private boolean[] includedInMST;
    public Graph MST;
    public LinkedList<Integer> adjforDFS[];
    private boolean[][] isSetMatrix;

    public Graph(int numOfNodes, boolean directed, boolean weighted) {
            this.directed = directed;
            this.weighted = weighted;
            this.numOfNodes = numOfNodes;
            this.adjforDFS = new LinkedList[numOfNodes];
            for (int i = 0; i < numOfNodes; i++){
            adjforDFS[i] = new LinkedList<>();
    }
        
            // Simply initializes our adjacency matrix to the appropriate size
            matrix = new double[numOfNodes][numOfNodes];
            isSetMatrix = new boolean[numOfNodes][numOfNodes];
            
            edges = new double[numOfNodes];
            parents = new double[numOfNodes];
            includedInMST = new boolean[numOfNodes];
        
            for(int i = 0; i < numOfNodes; i++){
                edges[i] = Double.POSITIVE_INFINITY;
                parents[i] = -1;
                includedInMST[i] = false;
            }
    }
    

    public int getNumOfNodes() {
        return numOfNodes;
    }
    
    public double getEdges(int i) {
        return edges[i];
    }
    
    public void setEdges(double edge, int node) {
        this.edges[node] = edge;
    }
    
    public boolean getIncludedInMST(int i) {
        return includedInMST[i];
    }
    
    public void setIncludedInMST(int node) {
        this.includedInMST[node] = true;
    }
    
    public double[][] getMatrix() {
        return matrix;
    }
    
    public void setParents(double parent, int node) {
        this.parents[node] = parent;
    }
    
    public double getParents(int i) { 
       return parents[i]; 
    }

    public void addEdge(int source, int destination, int weight) {

        int valueToAdd = weight;
    
        if (!weighted) {
            valueToAdd = 1;
        }
    
        matrix[source][destination] = valueToAdd;
        isSetMatrix[source][destination] = true;
    
        if (!directed) {
            matrix[destination][source] = valueToAdd;
            isSetMatrix[destination][source] = true;
        }
        this.setParents(destination, source);
        adjforDFS[source].addFirst(destination);
        adjforDFS[destination].addFirst(source);
    }
    public static int minEdgeNotIncluded(Graph graph){
        double min = Double.POSITIVE_INFINITY;
        int minIndex = -1;
        int numOfNodes = graph.getNumOfNodes();
    
        for(int i = 0; i < numOfNodes; i++){
            if(!graph.getIncludedInMST(i) && graph.getEdges(i) < min){
                minIndex = i;
                min = graph.getEdges(i);
            }
        }
        return minIndex;
    }
   public void PrintGraph(Graph graph)
   {
    System.out.println("MST consists of the following edges:");
    for(int i = 0; i < graph.getNumOfNodes(); i++){
      for (int j=0;j<graph.getNumOfNodes();j++)
      {
          if (graph.matrix[i][j]!=0)
          {
          System.out.println("From Vertex " + i +" to Vertex " +j +" with Weight of : " + graph.getMatrix()[i][j]);
          }
      }
    }
   }

   public void RemoveEdge(int source,int destination)
   {
    if (this.isSetMatrix[source][destination]==true)
    {
    this.isSetMatrix[source][destination] = false;
    this.isSetMatrix[destination][source] = false;
    }
    if (matrix[source][destination]!=0)
    {
        this.matrix[source][destination] = 0;
        this.matrix[destination][source] = 0;
    }
    this.edges[destination] = 0;
    this.parents[destination] = -1;
   }

   public void NewMST(Graph g,int source,int destination,int weight)
   {
      g.addEdge(source, destination, weight);
      g.addEdge(destination, source, weight);
      g.findcircle(g, source);
   }
    

   public void Primexe(Graph graph) 
   {       
   
    int startNode = 0;
    // Distance from the start node to itself is 0
    graph.setEdges(0, startNode); 

    for(int i = 0; i < graph.getNumOfNodes()-1; i++){
        int node = minEdgeNotIncluded(graph);

        graph.setIncludedInMST(node);

        double[][] matrix = graph.getMatrix();
        for(int v = 0; v < graph.getNumOfNodes(); v++){
            if(matrix[node][v] != 0 && 
               !graph.getIncludedInMST(v) && 
               matrix[node][v] < graph.getEdges(v)){
                graph.setEdges(matrix[node][v], v);
                graph.setParents(node, v);
            }
        }
    }

    
    this.MST = new Graph(20,false,true);
    for(int i = 1; i < graph.getNumOfNodes(); i++){
    this.MST.addEdge((int)graph.getParents(i),i,(int)graph.getEdges(i));
    }
    }

public void findcircle(Graph G,int v)
{Stack<Integer> stack= new Stack<>();
    int neighbor,index =0;
    boolean[] visited = new boolean[G.numOfNodes];
    int[] parent = new int[G.numOfNodes];
    int[] color = new int[G.numOfNodes];
    stack.push(v);
    visited[v] = true;
    color[v]=1;
    while (!stack.isEmpty()) {
        // do for every edge (v, u)
        neighbor=G.adjforDFS[v].get(index);
        if(!visited[neighbor] && G.adjforDFS[neighbor].size() > 1 && color[neighbor]!=2){
            parent[neighbor]=v;
            visited[neighbor]=true;
            color[neighbor]=1;
            v=neighbor;
            stack.push(v);
            index=0;
            continue;
        }
        else if(visited[neighbor] && neighbor!=parent[v]&& color[neighbor]!=2){
            this.circlemaxweight(this,stack,neighbor);
            return;
        }
        else if(index != G.adjforDFS[v].size()-1){
            index++;
            continue;
        }
        else {
            color[v]=2;
            stack.pop();
            if(stack.isEmpty())
                return;
            index=0;
            v=stack.peek();
        }

    }




}

public void circlemaxweight(Graph graph, Stack<Integer> stack,int neighbor){
    int a,b,c=0,weight,max,vertex1,vertex2;
    Stack<Integer> finalStack = new Stack<>();
    while (stack.peek()!=neighbor)
        finalStack.push(stack.pop());
    finalStack.push(stack.pop());
    a=finalStack.pop();
    b=finalStack.pop();
    vertex1=a;
    vertex2=b;
    weight=(int)graph.matrix[a][b];
    max=weight;
    for(int i =0;i<finalStack.size();i++){
        c=finalStack.pop();
        if((int)graph.matrix[b][c]>max) {
            max = (int)graph.matrix[b][c];
            vertex1=b;
            vertex2=c;
        }
        b=c;
    }
    if((int)graph.matrix[a][c]>max){
        vertex1=a;
        vertex2=c;
        max = (int)graph.matrix[a][c];
    }
graph.RemoveEdge(vertex1,vertex2);
this.PrintGraph(graph);

}


}




