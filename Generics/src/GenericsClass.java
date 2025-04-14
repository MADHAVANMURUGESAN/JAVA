public class GeneralGenerics {
    public static void main(String[] args) {
        PayMent<Integer> payMent1 = new PayMent<>();
        payMent1.setItem(2);
        PayMent<String> payMent2 = new PayMent<>();
        payMent2.setItem("test items");
        System.out.println("payMent1.getItem(): " + payMent1.getItem());
        System.out.println("payMent2.getItem(): " + payMent2.getItem());
    }
}

class PayMent<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}