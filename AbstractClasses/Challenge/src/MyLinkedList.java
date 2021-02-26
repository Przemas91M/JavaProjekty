public class MyLinkedList implements  NodeList{
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            this.root = newItem;
            return true;
        }
        //Poprzedni <-> Nowy <-> Obecny <-> Następny - taka mamy sytuacje, wciskamy nowy pomiędzy poprzedni i obecny
        //jezeli mamy juz jakiś element to tworzymy polaczenia z poprzednim elementem i nastepnym
        //wstawiamy wszystko w kolejnosci alfabetycznej
        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0){
                //newItem jest wiekszy
                if (currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    //koniec listy - nowy item jest next, a obecny ustawiany jest za nim, jako poprzedni
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if(comparison > 0) {
                //newItem jest mniejszy
                //mamy jeszcze item przed
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous()); //ustawiamy nowy item jako następny dla poprzedniego, a dla nowego poprzednim jest poprzedni elemenet obecnego elementu.
                    newItem.setNext(currentItem).setPrevious(newItem); //dla nowego następnym elementem jest obecny, dla obecnego nowy jest poprzednim elementem
                } else { //nie mamy juz nic przed - ustawiamy go jako root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                System.out.println(newItem.getValue() + " is already present!");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if(comparison == 0) {
                if(currentItem == this.root){
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else { //comparison > 0
                return false; //nie ma tego na liscie
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null) {
            System.out.println("List is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}
