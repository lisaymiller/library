package library;

public class OverdueList<E> {
    private E title;
    private Type type;

    public E getTitle() {
        return title;
    }

    public void setTitle(E title) {
        this.title = title;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

}