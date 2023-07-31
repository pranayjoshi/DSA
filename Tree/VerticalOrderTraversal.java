package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

// import Tree.TopViewTree.Pair;

class Pair{
    Node node;
    int hd;
    Pair(Node n,int h){
        node=n;hd=h;
    }
}

public class VerticalOrderTraversal {
    static ArrayList <Integer> verticalOrder(Node root)
    {
        // add your code here
        Map<Integer,ArrayList<Integer>> m=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            Node curr=p.node;
            int hd=p.hd;
            if(m.containsKey(hd))
            {
                m.get(hd).add(curr.data);
            }
            else{
                ArrayList<Integer> al=new ArrayList<>();
                al.add(curr.data);
                m.put(hd,al);
            }
            if(curr.left!=null)q.add(new Pair(curr.left,hd-1));
            if(curr.right!=null)q.add(new Pair(curr.right,hd+1));
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,ArrayList<Integer>> p: m.entrySet())
        {
            ArrayList<Integer> al=p.getValue();
            for(int x: al)
            ans.add(x);
        }
        return ans;
    }
}