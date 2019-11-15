package headfirst.designpatterns.factory.pizzafm;

public class PaisaStylePizza extends Pizza {
	public PaisaStylePizza() {
		name = "Pizza estilo paisa";
		dough = "Masa extra gruesa";
		sauce = "Salsa de tomate para pizza";
 
		toppings.add("tocineta picada");
		toppings.add("chorizo");
        toppings.add("maiz tierno");
        toppings.add("queso mozzarella rayado");
        toppings.add("salsa de tomate");
        toppings.add("pimenton");
        toppings.add("cebolla cortada en medias rodajas");
        toppings.add("ajo");

	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}