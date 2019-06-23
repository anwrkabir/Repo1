package ds.queque;

public class AppQue {

    public static void main(String[] args) {
        queque myQue = new queque(5);
        myQue.insert(500);
        myQue.insert(10);
        myQue.insert(18);
        myQue.insert(100);
        myQue.insert(1000);
        myQue.insert(1001);
        myQue.insert(1002);
        myQue.view();
        System.out.println( myQue.remove());
    }

  }
