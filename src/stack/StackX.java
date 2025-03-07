package stack;

// Regular stack
public class StackX {
    private int top;
    private int maxSize;
    private char[] stackArr;

    public StackX(int s){
        maxSize = s;
        stackArr = new char[maxSize];
        top = -1;
    }

    //    push()
    public void push(char el) throws StackOverflowException {
        if(top == maxSize-1) {
            throw new StackOverflowException("Stack is full!");
        }else {
            stackArr[++top] = el;
        }
    }

    //    pop()
    public char pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return '\0';
        } else{
            return stackArr[top--];
        }
    }

    //    peek()
    public char peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return '\0';
        } else{
            return stackArr[top];
        }
    }

    //    isEmpty()
    public boolean isEmpty(){
        return top==-1;
    }

    //    isFull()
    public boolean isFull(){
        return top==(maxSize-1);
    }

}
