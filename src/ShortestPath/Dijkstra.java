package ShortestPath;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * ClassName
 * Description TODO
 * Author zgy
 * Date 2020/6/13 12:50
 * Version 1.8
 **/

public class Dijkstra {
    List<Node> nodeList = new ArrayList<>();
    List<Edge> edgeList = new ArrayList<>();
    Graph graph;
    public Dijkstra(Graph graph){
        this.graph = graph;
    }

    public void solution(){

    }

    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        System.out.println(com.sun.jnlp.FileContentsImpl.class.getClassLoader().getClass().getName() );
        System.out.println(com.sun.crypto.provider.DESKeyFactory.class.getClassLoader().getClass().getName());
        System.out.println(Dijkstra.class.getClassLoader().getClass().getName());
    }

}



//图节点

class Edge {

    public int startid;
    public int endid;
    public int weight;

    public Edge(int startid, int endid, int weight) {
        this.startid = startid;
        this.endid = endid;
        this.weight = weight;
    }
}
class Node {
    int id;
    List<Edge> edgeList;

    public Node(int id, List<Edge> edgeList) {
        this.id = id;
        this.edgeList = edgeList;
    }
}


class Graph {

    List<Edge> edgeList = new ArrayList<>();
    List<Node> nodeList = new ArrayList<>();

    HashMap<Integer, Node> map = new HashMap<>();
    public void build(Edge edge){
        edgeList.add(edge);
        if(!map.containsKey(edge.startid)){
            map.put(edge.startid, new Node(edge.startid, new ArrayList<>()));
        }
        if(!map.containsKey(edge.endid)){
            map.put(edge.endid, new Node(edge.endid, new ArrayList<>()));
        }
        map.get(edge.startid).edgeList.add(edge);
        map.get(edge.endid).edgeList.add(edge);
    }
}
