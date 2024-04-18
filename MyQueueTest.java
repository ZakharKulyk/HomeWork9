package ua.goit.polymorpism.Module9.HomeWork9;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer>myQueue = new MyQueue<>();
        myQueue.add(5);
        Integer poll = myQueue.poll();
        System.out.println(myQueue);
        System.out.println(poll);


    }
}
