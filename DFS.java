package priya;

import java.util.*;

public class DFS {
    private Map<String, List<String>> graph = new HashMap<>();

    // Add connection (undirected)
    public void addConnection(String a, String b) {
        graph.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
        graph.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
    }

    // Recursive DFS
    public List<String> findSocialCircle(String person) {
        Set<String> visited = new HashSet<>();
        List<String> result = new ArrayList<>();
        dfs(person, visited, result);
        return result;
    }

    private void dfs(String person, Set<String> visited, List<String> result) {
        if (!graph.containsKey(person) || visited.contains(person)) return;
        visited.add(person);
        result.add(person);
        for (String neighbor : graph.get(person)) {
            dfs(neighbor, visited, result);
        }
    }

    // Iterative DFS
    public List<String> findSocialCircleIterative(String person) {
        if (!graph.containsKey(person)) return Collections.emptyList();
        Set<String> visited = new HashSet<>();
        List<String> result = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push(person);

        while (!stack.isEmpty()) {
            String current = stack.pop();
            if (visited.contains(current)) continue;
            visited.add(current);
            result.add(current);
            for (String neighbor : graph.get(current)) {
                if (!visited.contains(neighbor)) stack.push(neighbor);
            }
        }
        return result;
    }
}
