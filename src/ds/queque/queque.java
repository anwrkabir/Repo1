package ds.queque;

public class queque {
    private int maxSize;  // initialize set number of slots
    private  int front;// index position ofr element in the front
    private  int back; // index position for element in the back
    private  long[] queArray; // slots to maintain number of items in que
    private  int nItems; // counter to maintain number of items in queue.


    public  queque( int size){
        this.maxSize = size;
        this.queArray = new long [ size];
        front = 0;
        back =-1;
        nItems =0;

    }

    public  void insert(long j){

        if(back== maxSize-1){
            back = -1;
        }

        back ++;
        queArray[back] = j;
        nItems ++;
    }

    public  void view(){
        System.out.print("[");
        for( int i=0;i< queArray.length; i++) {

            System.out.print(queArray[i] + " ");
         }
        System.out.print("]");
        }

        public long remove(){
        long temp = queArray[front];
        front++;
        if(temp == maxSize){
            front = 0;
        }
        nItems --;
        return  temp;
        }
    }

