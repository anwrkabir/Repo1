package ds.Stack;

public class AppStack {

    public static void main(String[] args) {
 //       Stack myStack = new Stack(10);
/*        myStack.push(20);
        myStack.push(40);
        myStack.push(60);
        myStack.push(80);*/



       deStack stack = new deStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while (!stack.isEmpty()){
            long val = stack.pop();
            System.out.println(val);
        }

        System.out.println( reverseString("You are a dumb ass"));
    }

  public static  String reverseString(String str){
        int stackSize= str.length();// get the max stack size
        Stack theStack = new Stack(stackSize); // we make the stack
        for( int i=0; i<str.length(); i++){
            char ch = str.charAt(i);// getting a char from the input string
            theStack.push(ch);
        }

        String result = "";
        while (!theStack.isEmpty()){
            char ch = theStack.pop();
            result = result+ ch;
        }

        return  result; 
    }


}
