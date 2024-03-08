import models.facade.RestaurantFacade;

public class App {
    public static void main(String[] args) {

        //Facade
        RestaurantFacade restaurantFacade = new RestaurantFacade();
        restaurantFacade.placeOrder("Pasta", "Credit", 50);
        restaurantFacade.placeOrder("Pizza", "Cash", 30);
    }
}
