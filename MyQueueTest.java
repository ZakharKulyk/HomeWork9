package ua.goit.polymorpism.Module9.HomeWork9;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer>myQueue = new MyQueue<>();
        myQueue.add(5);
        myQueue.add(6);
        Integer peek = myQueue.peek();
        System.out.println(peek);
        System.out.println(myQueue);

    }
}
