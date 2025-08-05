package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        //FIFO
        Queue<String> que = new LinkedList<>();//insertion order
        que.offer("elma");
        que.offer("muz");
        que.offer("armut");
        que.offer("portakal");
        que.add("portakal");

        System.out.println(que);

        //remove  --kuyruk boşsa exception fırlatır
        //que.remove();
        //que.remove();
        System.out.println("que = " + que);

        //poll -- ilk eleman çıkar. kuyruk boşsa null döner
        que.poll();
        System.out.println(que);

        //element -- ilk eleman getirir.kuyruk boşsa exception fırlatır
        System.out.println("que.element() = " + que.element());

        //peek()--ilk eleman getirir.kuyruk boşsa null döner
        System.out.println("que.peek() = " + que.peek());

        Queue<String> que2 = new LinkedList<>();
        System.out.println(que2.peek());
        //System.out.println(que2.element());

        //alfabetik sıralar
        Queue<String> que3 = new PriorityQueue<>();
        que3.offer("elma");
        que3.offer("muz");
        que3.offer("armut");
        que3.offer("portakal");
        que3.add("portakal");

        System.out.println(que3);
        while (!que3.isEmpty()){
            System.out.println(que3.poll());
        }


       /* System.out.println(que3.poll());
        System.out.println(que3);*/


    }
}
