import java.util.ArrayList;
public class wrapperEx {
    public static void main(String[] args){

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Burger");
        food.add("Fries");

        food.set(2, "Sushi");
        food.remove(2);
        food.clear();

        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }

        // 2D ArrayList
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        
        System.out.println(groceryList);    // list of lists
        System.out.println(groceryList.get(0)); // first list
        System.out.println(groceryList.get(0).get(0));  // first value of first list
    }
}
 