package heiio;

import java.util.*;

public class GraphStructure {
    public static void main(String[] args) {
        Map<String, List<String>> zooGraph = new HashMap<>();

        zooGraph.put("entrance", Arrays.asList("reptile house", "bird sanctuary", "mammal zone"));
        zooGraph.put("reptile house", Arrays.asList("snake pit"));
        zooGraph.put("bird sanctuary", Arrays.asList("parrot pavilion"));
        zooGraph.put("mammal zone", Arrays.asList("lion den", "elephant enclosure"));
        zooGraph.put("snake pit", Collections.emptyList());
        zooGraph.put("parrot pavilion", Collections.emptyList());
        zooGraph.put("lion den", Collections.emptyList());
        zooGraph.put("elephant enclosure", Collections.emptyList());
        for (String zone : zooGraph.keySet()) {
            System.out.println(zone + " connects to: " + zooGraph.get(zone));
        }
    }
}

