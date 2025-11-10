package designPatterns.patronDecorator.decorador2.decoradores;

import designPatterns.patronDecorator.decorador2.IConfigurable;

public class ConCremaDecorador extends CafeDecorador{

    public ConCremaDecorador(IConfigurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 2.5f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes()+", con crema";
    }
}
