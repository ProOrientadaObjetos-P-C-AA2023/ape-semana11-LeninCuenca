package B2_Semana3.TrabajoIndividual2_B2;


abstract class Personaje {
    public double vida;
    public double nivelExperiencia;
    public String nombre;

    public Personaje(double vida, double nivelExperiencia, String nombre) {
        this.vida = vida;
        this.nivelExperiencia = nivelExperiencia;
        this.nombre = nombre;
    }

    public abstract void atacar();

    public abstract void defender();
}

class Guerreros extends Personaje {
    public double fuerza;
    public String habilidadesCuerpo[];

    public Guerreros(double vida, double nivelExperiencia, String nombre, double fuerza, String[] habilidadesCuerpo) {
        super(vida, nivelExperiencia, nombre);
        this.fuerza = fuerza;
        this.habilidadesCuerpo = habilidadesCuerpo;
    }

    public void atacar() {
        System.out.println("El guerrero " + nombre + " ataca con fuerza " + fuerza);
    }

    public void defender() {
        System.out.println("El guerrero " + nombre + " se defiende con sus habilidades de cuerpo a cuerpo");
    }
}

class Magos extends Personaje {
    public double hechizos;
    public String poderesMagicos[];

    public Magos(double vida, double nivelExperiencia, String nombre, double hechizos, String[] poderesMagicos) {
        super(vida, nivelExperiencia, nombre);
        this.hechizos = hechizos;
        this.poderesMagicos = poderesMagicos;
    }

    public void atacar() {
        System.out.println("El mago " + nombre + " lanza hechizos con poder " + hechizos);
    }

    public void defender() {
        System.out.println("El mago " + nombre + " se defiende con sus poderes mágicos");
    }
}

class Arqueros extends Personaje {
    public double precision;
    public String habilidadesDistancia[];

    public Arqueros(double vida, double nivelExperiencia, String nombre, double precision, String[] habilidadesDistancia) {
        super(vida, nivelExperiencia, nombre);
        this.precision = precision;
        this.habilidadesDistancia = habilidadesDistancia;
    }

    public void atacar() {
        System.out.println("El arquero " + nombre + " ataca con precisión " + precision);
    }

    public void defender() {
        System.out.println("El arquero " + nombre + " se defiende con sus habilidades a distancia");
    }
}

public class Ejercicio1{
    public static void main(String[] args) {
        String Guerrero1[]={"Golpe fuerte", "Empujón"};
        String Mago1[]={"Bola de fuego", "Escudo mágico"};
        String Arquero1[]={"Disparo preciso", "Trampa"};

        Guerreros guerrero = new Guerreros(100, 5, "Guerrero", 20, Guerrero1);
        Magos mago = new Magos(80, 3, "Mago", 15, Mago1);
        Arqueros arquero = new Arqueros(90, 4, "Arquero", 10, Arquero1);
        System.out.println("PELEAS MULTIPLES");
        guerrero.atacar();
        mago.defender();
        arquero.atacar();
        guerrero.defender();
        mago.atacar();
        arquero.defender();
        System.out.println("----------------------------------");
        System.out.println(" ");
        System.out.println("COMIENZA LA BATALLA 1 a 1");
        System.out.println("Guerrero contra Mago");
        guerrero.atacar();
        mago.defender();
        if (guerrero.fuerza > mago.hechizos) {
            System.out.println("El guerrero " + guerrero.nombre + " ha ganado la batalla");
        } else {
            System.out.println("El mago " + mago.nombre + " ha ganado la batalla");
        }

        System.out.println(" ");
        System.out.println("Arquero contra Mago");
        arquero.atacar();
        mago.defender();

        if (arquero.precision > mago.hechizos) {
            System.out.println("El arquero " + arquero.nombre + " ha ganado la batalla");
        } else {
            System.out.println("El mago " + mago.nombre + " ha ganado la batalla");
        }

    }
}

