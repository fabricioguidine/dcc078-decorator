package org.example;

public class Calabresa extends IngredienteDecorator {
    public Calabresa(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public float getPrecoAdicional() {
        return 1.0f;
    }

    public String getNome() {
        return "Calabresa";
    }
}
