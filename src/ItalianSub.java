public class ItalianSub extends Subway {

    String[] meatUsed = {"Salami", "Pepperoni", "Capicola", "Ham"};
    String[] cheeseUsed = {"Provolone"};
    String[] veggiesUsed = {"Lettuce", "Tomato", "Onion"};
    String[] condimentsUsed = {"Lettuce", "Tomato", "Onion"};

    void addMeat() {
        System.out.print("Adding the Meat: ");

        for (String meat : meatUsed) {
            System.out.println(meat + " ");
        }
    }
    void addCheese() {
        System.out.print("Adding the Cheese: ");

        for (String cheese : cheeseUsed) {
            System.out.println(cheese + " ");
        }
    }
    void addVeggies() {
        System.out.print("Adding the Veggies: ");

        for (String veggies : veggiesUsed) {
            System.out.println(veggies + " ");
        }
    }
    void addCondiments() {
        System.out.print("Adding the Condiments: ");

        for (String condiments : condimentsUsed) {
            System.out.println(condiments + " ");
        }
    }

}
