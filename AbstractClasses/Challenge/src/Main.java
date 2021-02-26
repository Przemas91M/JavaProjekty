public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());
        String data = "5 7 3 9 8 2 1 0 4 6";
        String[] dataArray = data.split(" ");
        for (String s: dataArray) {
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("5"));
        list.traverse(list.getRoot());

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());
        for(String s: dataArray) {
            tree.addItem(new Node(s));
        }
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());

    }
}
