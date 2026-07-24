package Stack;

public class MyStack {
    private int[] data;
    private int top;

    public MyStack(int capacity) {
        data = new int[capacity];
        top = 0;
    }


    public void push (int value){
        data[top] = value;
        top = top + 1;
    }
    public int pop(){
        top = top -1;
        int value = data[top];
        return value;
    }

    public static void main(String[] args) {
        int value = 5;

    }


}

