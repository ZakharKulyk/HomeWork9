package ua.goit.polymorpism.Module9.HomeWork9;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer>myQueue = new MyQueue<>();
        myQueue.add(5);
        myQueue.add(6);
        System.out.println(myQueue);
        myQueue.clear();
        System.out.println(myQueue);

    }
}
