import java.util.*;
public class BFS 
{
    private Queue<Node> myQueue;
    public BFS()
    {
        this.myQueue=new LinkedList<>();
    }
    public void bfs(Graph g)
    {
        List<Node> nodelist=g.getAllNodes();        
        for(Node n:nodelist)
        {
            if(n.isVisited()==false)
            {
                n.setVisited(true);
                bsfInQueue(n);
            }
        }
    }    
    private void bsfInQueue(Node root)
    {
        this.myQueue.add(root);
        root.setVisited(true);        
        while(this.myQueue.isEmpty()==false)
        {
            Node currentNode=this.myQueue.remove();
            
            System.out.println("Current Node "+currentNode.getElement().toString()); 
            
            for(Node n :currentNode.getNeighbours())
            {
                if(n.isVisited()==false)
                {
                    n.setVisited(true);
                    this.myQueue.add(n);      
                    System.out.println("NeighBour Node :: "+n.getElement().toString());
                }
                //System.out.println("NeighBour Node "+String.valueOf(n.getElement()));
            }
        }
    }
}
