import java.util.*;

public class Assignment {
    public static void main(String[] args) {
        int a[]={5,3,6,2,4};
        int sum=0,i;
        for(i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("Sum of all elememts in an array:" +sum);
        LinkedList<Integer> linkedList=new LinkedList<Integer>();
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(6);
        linkedList.add(2);
        linkedList.add(4);
        System.out.println("Linked List : " + linkedList);
        Stack<Integer> stack=new Stack<>();
        for(i=4;i>=0;i--)

        {
    
            stack.push(linkedList.get(i));
    
        }
    
           System.out.println("Reverse order:"+ stack);

       Queue<Integer> queue = new LinkedList<>();

        for (i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                queue.add(a[i]);
            }
        }

        System.out.println("Even-indexed elements in the Queue: " + queue);
    
    Map<Integer, Integer> map = new HashMap<>();
    for(i=0;i<linkedList.size();i++){
        if(i%2!=0){
    
            map.put(i,linkedList.get(i));
        
    }
}
    System.out.println("Odd indexed elements in the map: " + map);
    
    
    System.out.println("Linked List : " + linkedList);

    System.out.println("Stack : " + stack);

    System.out.println("Queue : " + queue);

}
}








    