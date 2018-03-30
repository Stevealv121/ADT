public class LinkedList {

    private Node head;
    private Node last;
    public  int size;

    public LinkedList() {
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty(){

        if(head == null){
            return true;
        }else{
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    public void insertAtStart(int val){

        Node current = new Node(val, null);
        size++;
        if(head == null){
            head = current;
            last = head;
        }else{
            current.setData(val);
            current.setNext(head);
            head = current;
        }
    }

    public void insertAtEnd(int val){

        Node current = new Node(val, null);
        size++;
        if(head==null){
            head = current;
            last = head;
        }else{
            last.setNext(current);
            last = current;
        }
    }

    public void insertAtPos(int val, int pos){

        Node current = new Node(val, null);
        Node reference = head;
        pos = pos-1;
        for (int i=0; i < size-1; i++){
            if (i == pos){

                Node temp = reference.getNext();
                reference.setNext(current);
                current.setNext(temp);
            }
            reference = reference.getNext();
        }
        size++;
    }

    public void deleteAtPos(int pos){
        Node reference = head;
        pos = pos-1;
        if (pos == 0)
        {
            head = head.getNext();
            size--;
            return ;
        }
        if (pos == size)
        {
            Node start = head;
            Node temp = head;
            while (start != last)
            {
                temp = start;
                start = start.getNext();
            }
            last = temp;
            last.setNext(null);
            size --;
        }
        for (int i=0; i< size-1; i++){
            if(i == pos){
                Node temp = reference.getNext();
                temp = temp.getNext();
                reference.setNext(temp);
            }
            reference.getNext();
        }
        size--;
    }

    public void printList(){

        Node current = head;
        for (int i=0; i<size; i++){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}
