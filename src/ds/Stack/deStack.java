package ds.Stack;

public class deStack {
    private int top;
    private  long stackArray[];
    private int maxSize;

    public  deStack(int j){
        this.maxSize = j;
        this.stackArray= new long[maxSize];
        this.top= -1;

    }

    public void push( long j){
        top ++;
        stackArray[top]= j;
    }

    public  long pop(){
        int old_top = top;
        top--;
        return stackArray[old_top];
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean isFull(){
        return (maxSize -1 == top);
    }

}

