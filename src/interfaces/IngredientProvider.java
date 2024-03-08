package interfaces;

import java.util.List;

// Inversión de Control (Inversion of Control)
public interface IngredientProvider {
    List<String> getIngredients();
}