import java.util.*;
public class Internet {
    private Map<String, Set<String>> myGraph;
    private Set<String> myVisited;

    public int articulationPoints(String[] routers) {
        setMyGraph(routers); // initialize myGraph
        myVisited = new TreeSet();
        ArrayList<Integer> list = new ArrayList();

        for(String r : myGraph.keySet()) {
            if (!myVisited.contains(r)) {
                Set<String> linked = dfs(r, "");
                myVisited.addAll(linked);
                list.add(linked.size());
            }
        }
        return list.size();
    }
    public boolean isAP(String router) {
        if (myGraph.get(router).size() < 2) return false;

        Queue<String> q = new LinkedList<>();
        Set<String> set = new HashSet<>();
        set.add(router);

        Set<String> temp = myGraph.get(router);
//        for (String r: temp) {
//        }

        return true;
    }

    private Set<String> dfs(String r, String avoid) {
        Set<String> visited = new TreeSet<>();
        Stack<String> s = new Stack<>();
        s.add(r);
        visited.add(r);
        while (s.size()>0) {
            r = s.pop();
            for (String adj : myGraph.get(r)) {
                if (!visited.contains(adj) && ! adj.equals(avoid)) {
                    s.push(adj);
                    visited.add(adj);

                }
            }
        }
        return visited;

    }

    private void setMyGraph(String[] routers) {
        myGraph = new TreeMap<>();
        for(int k=0; k < routers.length; k++) { // get router index (-> String) and adjacent routers
            String s = routers[k];
            String v = ""+k;
            String[] adj = s.split(" ");

            for(String a : adj) { // ensure each router is present in the TreeMap
                myGraph.putIfAbsent(v, new TreeSet<>());
                myGraph.putIfAbsent(a, new TreeSet<>());


                myGraph.get(v).add(a); // add adjacent routers to the vector router
                myGraph.get(a).add(v); // add the vector router to each adjacent router
            }
        }
    }
}