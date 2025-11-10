package designPatterns.patronDecorator.decorador2.decoradores;

import designPatterns.patronDecorator.decorador2.IConfigurable;

abstract public class CafeDecorador implements IConfigurable {
    protected IConfigurable cafe;

    public CafeDecorador(IConfigurable cafe) {
        this.cafe = cafe;
    }


}
