package org.example;

public class Queijo extends IngredienteDecorator {
    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public float getPrecoAdicional() {
        return 1.0f;
    }

    public String getNome() {
        return "Queijo";
    }
}
