public class Node {

    private int data;
    private Node next;

    public Node(){

        next = null;
        data = 0;
    }

    public Node(int data, Node next){

        data = data;
        next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
