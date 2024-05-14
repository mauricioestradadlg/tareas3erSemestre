public class List <AnyData> {

    private Node head;
    private int size = 0;

    public boolean isEmpty() {
        return this.head == null;
    }

    public AnyData findDataByPosition(int position) {
        Object result = new Object();
        return (AnyData) result;
    }

    void insert(AnyData i) {
        Node nodeToInsert = new Node(i);

        if (this.head == null)
            this.head = nodeToInsert;
        else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = nodeToInsert;

        }
        this.size++;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
    }


    public String toString() {
        String result = "[";
        Node temp = head;
        while (temp != null) {
            result += temp.data + "";
            temp = temp.next;
        }
        result += "]";
        return result;
    }

    public void insertToStart(AnyData i) {
        Node node = new Node(i);
        node.next = head;
        head = node;
        this.size++;
    }

    public void insertToEnd(AnyData i) {
        Node node = new Node(i);
        if (head == null){
            head = node;
        }
        else{
            Node pointer = head;
            while(pointer.next != null){
                pointer = pointer.next;
            }
            pointer.next= node;
            this.size++;
        }
    }

    public void insertByPosition(int n, AnyData i) {
        Node node = new Node(i);
        if (head == null) {
            head = node;
            this.size++;
        } else {
            Node pointer = head;
            int counter = 0;
            while (counter <= n && pointer.next != null) {
                pointer = pointer.next;
                counter++;
            }
            node.next = pointer.next;
            pointer.next = node;
            this.size++;

        }
    }

    public void removeFirstPosition() {
        if (head != null) {
            Node first = head;
            head = head.next;
            first.next = null;
            size--;

        }
    }

    public void removeLastPosition() {
        if (head != null) {
            if (head.next == null) {
                head = null;
                size--;
            } else {
                Node pointer = head;
                while (pointer.next.next != null) {
                    pointer = pointer.next;
                }
                pointer.next = null;
                size--;
            }

        }

    }

    public void removeByPosition(int n) {
        if (head != null) {
            if (n == 0) {
                Node first = head;
                head = head.next;
                first.next = null;
                size--;
            } else if (n < size){
                Node pointer = head;
                int counter = 0;
                while (counter < (n - 1)) {
                    pointer = pointer.next;
                    counter++;
                }
                Node temp = pointer.next;
                pointer.next = temp.next;
                temp.next = null;
                size--;

            }
        }
    }
    public void removeByData(AnyData i) {
        if (head == null) {
            return;
        }
            if (head.data.equals(i)){
            head = head.next;
            size--;
            return;
        }
        Node pointer = head;
            while(pointer.next != null && !pointer.next.data.equals(i)){
                pointer = pointer.next;
            }
            if(pointer.next == null){
                return;
            }
            pointer.next = pointer.next.next;
            size--;
    }
    public Object find(AnyData i) {
        if (head == null) {
            return null;
        } else {
            Node pointer = head;
            while (pointer != null) {
                if (pointer.data.equals(i) ) {
                    return pointer;
                }
                pointer = pointer.next;
            }
            return null;
        }
    }
    public Object findByPosition(int n) {
        if (head == null) {
            return null;
        } else {
            Node pointer = head;
            int counter = 0;
            while (pointer != null) {
                if (counter == n) {
                    return pointer;
                }
                counter++;
                pointer = pointer.next;
            }
            return null;
        }
    }
    public boolean isExist(AnyData i) {
        if( head == null){
            return false;
        }
        else {
            Node pointer = head;
            while (pointer != null) {
                if (pointer.data == i) {
                    return true;
                }
                pointer = pointer.next;
            }
            return false;
        }
    }


    public Object getDataByPosition(int n){
        if( head == null){
            return null;
        }
        else{
            Node pointer = head;
            int counter = 0;
            while ( counter < n && pointer.next != null){
                pointer = pointer.next;
                counter++;
            }
            if (counter != n){
                return null;
            }
            else{
                return pointer.data;
            }
        }
    }
    public Object getPositionByData(AnyData i) {
        if (head == null) {
            return null;
        } else {
            Node pointer = head;
            int counter = 0;
            while (pointer != null) {
                if (pointer.data == i) {
                    return counter;
                }
                pointer = pointer.next;
                counter++;
            }
            return -1;
        }
    }
}