package BurgerProgram;

public class Node {
    Object data;
    Node next;

    public Node (Object a){
        data = a;
        next = null;
    }
    public String toString(){
        return data.toString();
    }

}
