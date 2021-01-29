package chapter09graphs;

import java.util.Arrays;
import java.util.LinkedList;

public class GraphAlgo {

  public static void main(String[] args) {
    Graph g =  new Graph(3);
    g.add(1,2);
    g.add(2,3);
    DFS dfs = new DFS();
    dfs.findRoute(g,1,3);
  }

  static class Graph{
    int v;
    LinkedList<Integer> adjList[];
    public Graph(int v){
      this.v = v+1;
      adjList = new LinkedList[v];
      for(int i=0;i<v;i++){
        adjList[i] = new LinkedList();
      }
    }

    public void add(int v1, int v2){
      adjList[v1].add(v2);
    }
  }

  static class DFS{
    public void findRoute(Graph g, int a, int b){
      boolean visited[] = new boolean[g.v];
      Arrays.fill(visited, false);


      System.out.println(dfsUtil(g,visited, a,b));
    }

    private int dfsUtil(Graph g, boolean[] visited, int a, int b) {
      if(visited[a])
        return 0;
      visited[a] = true;
      for (Integer i : g.adjList[a]) {
        if (i.intValue() == b)
          return 1;
        return dfsUtil(g,visited,i,b);
      }
      return 0;
    }
  }
}
