package BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalOrderTraversal {
    static ArrayList <Integer> verticalOrder(Node root)
    {
        ArrayList<Integer>list=new ArrayList<>();
        if(root==null)
            return list;
        TreeMap<Integer,List<Integer>> map=new TreeMap<>();
        Queue<Node>q=new LinkedList<>();
        Queue<Integer>d=new LinkedList<>();
        q.add(root);
        d.add(0);
        while(!q.isEmpty()){
            Node curr=q.poll();
            int dis=d.poll();
            map.putIfAbsent(dis,new ArrayList<>());
            map.get(dis).add(curr.data);
            if(curr.left!=null){
                q.add(curr.left);
                d.add(dis-1);
            }
            if(curr.right!=null){
                q.add(curr.right);
                d.add(dis+1);
            }
        }
        for(List<Integer>l:map.values()){
            list.addAll(l);
        }
        return list;
    }
}
