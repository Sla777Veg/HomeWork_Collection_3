import java.util.HashMap;

public class MapList {
    private Integer amount;
    private HashMap<Product, Integer> mapList = new HashMap();


    public void addProduct(Product product, Integer amount) {
        if (amount <= 0) {
            amount = 1;
        } else {
            this.amount = product.getQuantity();
            this.mapList.put(product, amount);
        }
    }

    public Integer getAmount() {
        return amount;
    }

    public HashMap<Product, Integer> getMapList() {
        return mapList;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "MapList{" +
                "amount=" +"Количество продуктов : "+ amount +
                ", mapList=" + mapList +
                '}';
    }
}
