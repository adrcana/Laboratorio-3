package headfirst.designpatterns.factory.pizzafm;

public class ColombiaStylemixta extends Pizza {
	public ColombiaStylemixta() {
		name = "Colombian Style Mixta Pizza";
		dough = "Masa extra gruesa";
		sauce = "Salsa especial";
 
		toppings.add("Queso mozzarella rallado");
		toppings.add("carne de res");
        toppings.add("carne de pollo");
        toppings.add("champinones");
        toppings.add("tomates");
        toppings.add("pimenton");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}