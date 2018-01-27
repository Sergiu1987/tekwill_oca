package class_practice.myList;

public class NodeList implements MyList {
    private Node root;

    @Override
    public Object get(int i) {
        Node temp = root;
        int index = 0;
        while (temp != null){
            if (index == i){
                return temp.getValue();
            }
            temp = temp.getNext();
            index++;
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    @Override
    public Object add(Object ob) {
        if (root == null) {
            root = createNod(ob);
            return root;
        } else {
            Node temp = root;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
           // Node lastValue = new Node();
            //lastValue.setNext(null);
            //lastValue.setValue(ob);
            Node lastValue = createNod(ob);
            temp.setNext(lastValue);
            return lastValue;

        }
        // return root ;
    }

    @Override
    public int size() {
        int size = 0;
        if (root == null){
            return size;
        } else  {

            Node temp = root;
            while (temp != null){
                temp = temp.getNext();
                size++;
            }

        }
        return size;
    }

    private Node createNod(Object ob){
        Node newCreateNode = new Node();
        newCreateNode.setNext(null);
        newCreateNode.setValue(ob);

        return newCreateNode;


    }

}
