package org.example;

public class Palmito extends IngredienteDecorator {
    public Palmito(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public float getPrecoAdicional() {
        return 1.0f;
    }

    public String getNome() {
        return "Palmito";
    }
}
