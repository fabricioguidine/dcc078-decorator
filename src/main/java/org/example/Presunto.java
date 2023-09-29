package org.example;

public class Presunto extends IngredienteDecorator {
    public Presunto(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public float getPrecoAdicional() {
        return 1.0f;
    }

    public String getNome() {
        return "Presunto";
    }
}
