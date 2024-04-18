package ua.goit.polymorpism.Module9.HomeWork9;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> stack  = new MyStack<>();
     for(int i =0; i<20; i++){
         stack.push(i);
     }

        for(int i =0; i<10; i++){
            stack.pop();
        }
        System.out.println(stack.size());

    }
}
