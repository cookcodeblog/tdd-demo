package book;

public class USD {
    private int amount;

    public USD(int amount) {
        this.amount = amount;
    }

    public int times(int number) {
        return amount * number;
    }
}
