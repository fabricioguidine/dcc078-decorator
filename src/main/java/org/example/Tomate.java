package org.example;

public class Tomate extends IngredienteDecorator {
    public Tomate(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public float getPrecoAdicional() {
        return 1.0f;
    }

    public String getNome() {
        return "Tomate";
    }
}
