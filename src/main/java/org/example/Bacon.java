package org.example;

public class Bacon extends IngredienteDecorator {
    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public float getPrecoAdicional() {
        return 1.0f;
    }

    public String getNome() {
        return "Bacon";
    }
}