package class_practice.myList;

public class Main {
    public static void main(String[] args) {
        MyList myNodeList = new NodeList();
        myNodeList.add('5');
        System.out.println(myNodeList.size());
        myNodeList.add("G");
        System.out.println(myNodeList.size());
        myNodeList.add(12);
        System.out.println(myNodeList.size());
        System.out.println(myNodeList);
        System.out.println(myNodeList.size());
        System.out.println(myNodeList.get(2));

    }
}
