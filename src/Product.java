import java.util.ArrayList;
import java.util.Objects;

public class Product {

    private final String name;
    private final double price;
    private int quantity;
    private boolean checked;

    public Product(String name, double price, int quantity) {
        if (name == null || price < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        if (quantity <= 0) {
            this.quantity = 1;
        } else {
            this.quantity = quantity;
        }
        this.name = name;
        this.price = price;
        this.checked = false;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked() {
        this.checked = true;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        String checkedString = this.isChecked() ? "Yes" : "No";
        return String.format("%s, Цена: %s, Количество: %s, Куплен: %s", this.name, this.price,
                this.quantity, checkedString+".  ");
    }
}
