package designPatterns.patronDecorator.decorador2.decoradores;

import designPatterns.patronDecorator.decorador2.IConfigurable;

public class ConChocolateDecorador extends CafeDecorador {


    public ConChocolateDecorador(IConfigurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() +5f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() +", chocolate";
    }
}
