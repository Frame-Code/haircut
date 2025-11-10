package designPatterns.patronDecorator.decoradores;

import designPatterns.patronDecorator.Formateable;
import designPatterns.patronDecorator.TextoDecorador;

public class MayusculaDecorador extends TextoDecorador {

    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
