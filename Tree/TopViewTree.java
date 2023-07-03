package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

// import Node;

public class TopViewTree {
	
	static Scanner sc = null;
    // static int counter = 0;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		// TopTree();
	}
	
	static ArrayList<Integer> TopTree(Node root) {
		
		Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();
		
        q.add(new Pair(0, root));

        while (!q.isEmpty()){
            Pair cur = q.poll();

            if (!map.containsKey(cur.head)){
                map.put(cur.head, cur.node.data);
            }

            if (cur.node.left != null){
                q.add(new Pair(cur.head -1, root.left));
            }
            if (cur.node.left != null){
                q.add(new Pair(cur.head +1, root.right));
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
		return ans;
	}

    static class Pair {
        int head;
        Node node;
        
        public Pair(int head,Node node) {
            this.head = head;
            this.node = node;
        }
    }
}

class Node {
	Node left, right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
}

