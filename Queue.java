package BurgerProgram;

public class Queue {
    Node front;
    Node back;
     int size = 0;

    public void enqueue(Object a){
        Node n = new Node(a);
        size ++;
        if (back == null){
            front = n;
            back = n;
        }
        else{
            back.next = n;
            back = n;
        }
    }
    public Object dequeue(){
        Node temp = front;
        if(front==null){
            return null;
        }
        else if (front.next == null){
            back =null;
            front = null;
        }
        else {
            front = front.next;
        }
        size--;
        return temp.data;
    }
}
