/*to jest pojedynczy element z linked listy.
w nim ustawiamy polaczenia pomiedzy poprzednimi i nastepnymi elementami w liscie
Chcąc utworzyć nowe połączenie (wcisnąć element pomiędzy istniejące) to trzeba zerwać linki i utworzyć 4 nowe*/
public class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLing;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLing = item;
        return this.leftLing;
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null){
            return((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
