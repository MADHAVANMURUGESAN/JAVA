public class GenericsInterface {
    public static void main(String[] args) {
        DoIt doIt = new DoIt();
        doIt.setItem("madhavan");
        System.out.println(doIt.getItem());
    }
}

class DoIt implements Robot<String> {
    public String item;

    @Override
    public String getItem() {
        return item;
    }

    @Override
    public void setItem(String item) {
        this.item = item;
    }
}

interface Robot<T> {
    T getItem();

    void setItem(T item);
}
