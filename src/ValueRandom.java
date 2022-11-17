import java.util.HashMap;
import java.util.Objects;

public class ValueRandom {

    private Integer value;
    private String key;

    HashMap<String, Integer> values = new HashMap();


    public void addValue(String key, Integer value) {
        if (values.containsKey(key) && values.containsValue(value)) {
            throw new IllegalArgumentException("Такой уже есть");
            //  System.out.println("Такой уже есть");
        } else if (values.containsKey(key) && !values.containsValue(value)) {
            // System.out.println(values.get(key));
            values.put(key, value);
        } else {
            values.put(key, value);
        }
    }



    public Integer getValue() {
        return value;
    }

    public String getKey() {
        return key;
    }

    public HashMap<String, Integer> getValues() {
        return values;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValues(HashMap<String, Integer> values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValueRandom that = (ValueRandom) o;
        return Objects.equals(value, that.value) && Objects.equals(key, that.key) && Objects.equals(values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, key, values);
    }

    @Override
    public String toString() {
        return "ValueRandom{"+ values +
                '}';
    }
}
