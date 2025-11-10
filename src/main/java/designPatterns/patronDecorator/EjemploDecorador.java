package designPatterns.patronDecorator;

import designPatterns.patronDecorator.decoradores.MayusculaDecorador;
import designPatterns.patronDecorator.decoradores.ReversaDecorador;
import designPatterns.patronDecorator.decoradores.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto= new Texto("Hola que tal bebe");
        MayusculaDecorador may= new MayusculaDecorador(texto);
        ReversaDecorador rev= new ReversaDecorador(may);
        SubrayadoDecorador sub= new SubrayadoDecorador(rev);

        System.out.println(sub.darFormato());

    }
}
