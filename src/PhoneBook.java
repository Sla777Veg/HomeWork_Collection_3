import java.util.HashMap;

public class PhoneBook {

    private final String name;
    private final String surname;
    private final int telephoneNumber;

    //   HashMap<String, String> map = new HashMap<>();

    public PhoneBook(String name, String surname, int telephoneNumber) {
        this.name = name;
        this.surname = surname;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    //public HashMap<String, String> getMap() {return map;}
}
