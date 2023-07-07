import java.util.*;
public class kLargestElement {
    public static void main(String[] args) {
        int k=3;
        int ranks[]={10,8,1,9,2,3,17,1,18};
        PriorityQueue<Integer> pq=new PriorityQueue();
        for(int i=0;i<ranks.length;i++){
            if(i<k){
                pq.add(ranks[i]);
            }else{
                if(ranks[i]>pq.peek()){
                    pq.remove();
                    pq.add(ranks[i]);
                }
            }
        }
        while(pq.size()>0){
            System.out.println(pq.remove());
        }
    }
}
