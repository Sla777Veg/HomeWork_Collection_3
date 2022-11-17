import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Задание 1-1
        System.out.println("Заданиe 1-1");
        book();

        // Данные из прошлого урока для задания 1-2

        Product ba = new Product("banana", 70, 2);
        Product ba1 = new Product("banana", 60, 3);
        Product or = new Product("orange", 170, 3);
        Product ap = new Product("apple", 50, 1);
        Product ch = new Product("cherry", 240, 4);

        ProductList productList = new ProductList();
        productList.addProduct(ba);
        //  productList.addProduct(ba1);
        //   productList.addProduct(or);
        productList.addProduct(ap);
        //  productList.addProduct(ch);
        System.out.println(productList);

        ProductList productList2 = new ProductList();
        productList2.addProduct(ch);
        productList2.addProduct(or);
        System.out.println(productList2);

        Recipe re1 = new Recipe("Рецепт-1 (Рецепт смузи) ", productList.getProducts());
        Recipe re2 = new Recipe("Рецепт-2 (Рецепт сока) ", productList2.getProducts());

        RecipeList recipeList = new RecipeList();
        recipeList.addRecipe(re1);
        recipeList.addRecipe(re2);
        System.out.println(recipeList);
        //Задание 1-2
        System.out.println("Заданиe 1-2");
        //Поскольку что именно требуется дорабатывать из условия мне не ясно,
        //то я создал отдельные классы для реализации HashMap,
        // MapList для продуктов и MapList2 для рецептов
        System.out.println("Реализация HashMap");
        // Реализация HashMap для списка продуктов
        MapList prList = new MapList();
        prList.addProduct(ba, ba.getQuantity());
        prList.addProduct(ap, ap.getQuantity());
        System.out.println(prList);
        System.out.println("Реализация HashMap2");
        // Реализация HashMap для списка рецептов
        MapList2 reList = new MapList2();
        reList.addRecipe(re1, 1);
        reList.addRecipe(re2, 1);
        System.out.println(reList);

        //Заданиe 1-3
        System.out.println("Заданиe 1-3");
        ValueRandom valueRandom = new ValueRandom();
        valueRandom.addValue("Вячеслав", 1);
        valueRandom.addValue("Иван", 2);
        valueRandom.addValue("Василий", 3);
        //valueRandom.addValue("Василий", 3);
        // valueRandom.addValue("Василий", 4);
        System.out.println(valueRandom);

        //Заданиe 2-1
        System.out.println("Заданиe 2-1");
        HashMap<String, List<Integer>> col = new HashMap<>();
        col.put("String1", valueGet());
        col.put("String2",  valueGet());
        col.put("String3", valueGet());
        col.put("String4", valueGet());
        col.put("String5", valueGet());
        System.out.println(col);
        System.out.println(col.values());
        System.out.println(col.keySet());
        //Не получилось получить сумму элементов значения через цикл, т.к компилятор находит несоответствие типов
        //Просьба показать другой метод
        ArrayList<List<Integer>> val = new ArrayList<List<Integer>>(col.values());
        System.out.println(val);
        int sum = 0;
        for (int i = 0; i< val.size(); i++) {
            //  sum = val.get(i);
            System.out.println(val.get(i));
        }

/*
        HashMap<String, List<Integer>> col2 = new HashMap<>(col);
        System.out.println(col2);
*/
        //Заданиe 2-2
        System.out.println("Заданиe 2-2");
        HashMap<Integer, String> dictionary = new HashMap<>();
        dictionary.put(1, "1");
        dictionary.put(2, "2");
        dictionary.put(3, "3");
        dictionary.put(4, "4");
        dictionary.put(5, "5");
        dictionary.put(6, "6");
        dictionary.put(7, "7");
        dictionary.put(8, "8");
        dictionary.put(9, "9");
        dictionary.put(10, "10");
        System.out.println(dictionary);
        for (Map.Entry<Integer, String> contact: dictionary.entrySet()) {
            System.out.println("Контакт " + contact.getKey() + ": " + contact.getValue());
        }


    }

    public static void book() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов1 Иван1", "8900000001");
        map.put("Иванов2 Иван2", "8900000002");
        map.put("Иванов3 Иван3", "8900000003");
        map.put("Иванов4 Иван4", "8900000004");
        map.put("Иванов5 Иван5", "8900000005");
        map.put("Иванов6 Иван6", "8900000006");
        map.put("Иванов7 Иван7", "8900000007");
        map.put("Иванов8 Иван8", "8900000008");
        map.put("Иванов9 Иван9", "8900000009");
        map.put("Иванов10 Иван10", "8900000010");
        map.put("Иванов11 Иван11", "8900000011");
        map.put("Иванов12 Иван12", "8900000012");
        map.put("Иванов13 Иван13", "8900000013");
        map.put("Иванов14 Иван14", "8900000014");
        map.put("Иванов15 Иван15", "8900000015");
        map.put("Иванов16 Иван16", "8900000016");
        map.put("Иванов17 Иван17", "8900000017");
        map.put("Иванов18 Иван18", "8900000018");
        map.put("Иванов19 Иван19", "8900000019");
        map.put("Иванов20 Иван20", "8900000020");
        System.out.println(map);
    }

    public static List<Integer> valueGet() {
        int a = (int) ( Math.random() * 1000 );
        int b = (int) ( Math.random() * 1000 );
        int c = (int) ( Math.random() * 1000 );
        List<Integer> colValue = new ArrayList<>(List.of(a, b, c));
        return Collections.unmodifiableList(colValue);
    }

}