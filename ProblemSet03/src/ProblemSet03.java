public class ProblemSet03 
{
	
    public static Node getMin(Node head)
    {
    	int min = Integer.MAX_VALUE;
    	LinkedList list = new LinkedList();
    	list.setHead(head);
    	for(int i = 0; i< list.size(); i++)
    	{
    		Node currentNode = list.getNode(i);
    		if(list.getData(currentNode) < min)
    		{
    			min = list.get(i);
    		}
    	}
    	int index = list.indexOf(min);
        return list.getNode(index);
    }

    public static Node mergeTwoLists(Node head1, Node head2)
    {
    	LinkedList listHead1 = new LinkedList(head1.data);
    	LinkedList listHead2 = new LinkedList(head2.data);
    	LinkedList mergedList = new LinkedList();
    	LinkedList sortedMergedList = new LinkedList();
    	for(int i = 0; i< listHead1.size(); i++)
    	{
    		Node currentNode = listHead1.getNode(i);
    		mergedList.add(listHead1.getData(currentNode));
    		currentNode = listHead1.getNext(currentNode);
    	}
    	for(int i = 0; i< listHead2.size(); i++)
    	{
    		Node currentNode = listHead2.getNode(i);
    		mergedList.add(listHead2.getData(currentNode));
    		currentNode = listHead2.getNext(currentNode);
    	}
    	for(int i = 0; i< mergedList.size(); i++)
    	{
    		Node minNode = getMin(mergedList.getNode(i));
    		sortedMergedList.add(mergedList.getData(minNode));
    		mergedList.remove(mergedList.indexOf(mergedList.getData(minNode)));
    	}
    	return sortedMergedList.getHead();
    	
    }

    public static Node reverseList(Node head)
    {
    	LinkedList reverseList = new LinkedList();
    	LinkedList originalList = new LinkedList(head.data);
    	for(int i = 0; i< originalList.size(); i++)
    	{
    		Node currentNode = originalList.getNode(i);
    		reverseList.add(0,originalList.getData(currentNode));
    	}
    	
        return reverseList.getHead();
    }

    public static boolean isPalindrome(Node head)
    {
    	LinkedList list = new LinkedList(head.data);
    	if(list.size()%2 == 0)
    	{
    		int half = (list.size()+1)/2;
    		for(int i = 0; i<=half; i++)
    		{
    			Node currentNode1 = list.getNode(i);
    			Node currentNode2 = list.getNode(list.size()-1-i);
    			if(list.getData(currentNode1) != list.getData(currentNode2))
    			{
    				return false;
    			}
    		}
    	}
    	else
    	{
    		int size = list.size();
    		int half = size/2;
    		for(int i = 0; i< half; i++)
    		{
    			Node currentNode1 = list.getNode(i);
    			Node currentNode2 = list.getNode(list.size()-1-i);
    			if(list.getData(currentNode1) != list.getData(currentNode2))
    			{
    				return false;
    			}
    		}
    	}
        return true;
    }
}
/*
This class is used commonly by ProblemSet03 and ProblemSet03Test.
 */
class Node
{
    public int data;
    public Node next;

    public Node()
	{
		data = 0;
		next = null;
	}
	public Node(int n)
	{
		data = n;
		next = null;
	}
	public Node(int n, Node nextNode)
	{
		data = n;
		next = nextNode;
	}
}
