package designPatterns.patronDecorator.decorador2;

import designPatterns.patronDecorator.decorador2.decoradores.ConChocolateDecorador;
import designPatterns.patronDecorator.decorador2.decoradores.ConCremaDecorador;
import designPatterns.patronDecorator.decorador2.decoradores.ConLecheDecorador;


public class Ejemplo {
    public static void main(String[] args) {

        IConfigurable cafe = new Cafe(7, "Cafe moca");
        ConCremaDecorador concrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(concrema);
        ConChocolateDecorador conChoco = new ConChocolateDecorador(conLeche);

        System.out.println("El precio del cafe moca es: " + conChoco.getPrecioBase());
        System.out.println("Los ingredientes: " + conChoco.getIngredientes());

        IConfigurable capuchino = new Cafe(4, "Cafe capuchino");
        concrema = new ConCremaDecorador(capuchino);
        conLeche = new ConLecheDecorador(concrema);

        System.out.println("El precio del capuchino es: " + conLeche.getPrecioBase());
        System.out.println("Los ingredientes " + conLeche.getIngredientes());

        IConfigurable esspreso = new Cafe(1.50f, "Cafe Espresso 5 oz");
        System.out.println("El precio del cafe Espresso es: " + esspreso.getPrecioBase());
        System.out.println("Los ingredientes: " + esspreso.getIngredientes());
    }
}
