package ua.goit.polymorpism.Module9.HomeWork9;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> stack  = new MyStack<>();
        stack.push("Zakhar");
        stack.push("Roman");
        stack.push("julia");

       stack.pop();
       System.out.println(stack);
    }
}
