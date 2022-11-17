import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapList2 {

    private Integer amountRecipe;
    private static int count;


    private final Map<Recipe, Integer> mapList2 = new HashMap();


    public  void addRecipe(Recipe recipe, Integer amountRecipe) {
        if (amountRecipe <= 0) {
            amountRecipe = 1;
        } else {
            this.amountRecipe = ++count;
            this.mapList2.put(recipe, amountRecipe);
        }
    }

    public Integer getAmountRecipe() {
        return amountRecipe;
    }

    public Map<Recipe, Integer> getMapList2() {
        return mapList2;
    }

    @Override
    public String toString() {
        return "MapList2{" +
                "amountRecipe=" +"Количество рецептов : "+ amountRecipe +
                ", mapList2=" + mapList2 +
                '}';
    }
}
