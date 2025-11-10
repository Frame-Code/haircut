package designPatterns.patronDecorator.decorador2.decoradores;

import designPatterns.patronDecorator.decorador2.IConfigurable;

public class ConLecheDecorador extends CafeDecorador{

    public ConLecheDecorador(IConfigurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase()+ 2f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes()+", con leche";
    }
}
