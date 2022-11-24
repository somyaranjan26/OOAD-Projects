public class VeggieSub extends Subway {

    String[] cheeseUsed = {"Provolone"};
    String[] veggiesUsed = {"Lettuce", "Tomato", "Onion"};
    String[] condimentsUsed = {"Lettuce", "Tomato", "Onion"};

    boolean customerWantsMeat() { return false; }

    @Override
    void addMeat() {}

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
