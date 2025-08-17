package OOPS.linkedlist;

public class DL {

    Node head;

    private class Node{ 
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }

    public void insertFirst(int val){
        Node node =new Node(val);
        node.next=head;
        node.prev=null;
        if(head !=null){
            head.prev=node;
        }
        head=node;
    }
    public void insetLast(int val){
        Node node=new Node(val);
        Node last=head;
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node node =head;
        Node last=null;
        while(node!=null){
            last=node;
            System.out.println(node.val);
            node=node.next;
        }
        while(last!=null){
            System.out.println(last.val);
            last=last.prev;
        }
    }


}
