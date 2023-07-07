import java.util.*;
public class priortiyQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int ranks[]={23,1,8,3,69,45,0,2,3};
        for(int val:ranks){
            pq.add(val);
        }
        while(pq.size()>0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
