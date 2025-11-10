package designPatterns.patronDecorator.decorador2;

public class Cafe implements IConfigurable {
    private float precio;
    private String name;

    public Cafe(float precio, String name) {
        this.precio = precio;
        this.name = name;
    }

    @Override
    public float getPrecioBase() {
        return this.precio;
    }

    @Override
    public String getIngredientes() {
        return this.name;
    }
}
