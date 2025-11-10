package designPatterns.patronDecorator.decoradores;

import designPatterns.patronDecorator.Formateable;
import designPatterns.patronDecorator.TextoDecorador;

public class RemplazarEspacioDecorador extends TextoDecorador {

    public RemplazarEspacioDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace("","-");
    }
}
