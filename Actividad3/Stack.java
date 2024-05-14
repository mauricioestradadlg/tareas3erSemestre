public class Stack <AnyData> {
    private List<AnyData> list;

    public Stack() {
        this.list = new List<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(AnyData data) {
        list.insertToStart(data);
    }

    public AnyData pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }
        Object data = list.getDataByPosition(0);
        list.removeFirstPosition();
        return (AnyData) data;
    }

    public AnyData peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot peek.");
        }
        return (AnyData) list.getDataByPosition(0);
    }

    public int size() {
        return list.getSize();
    }
}