


    public class Main {

        public static void main(String[] args) {
            suma(20, 40, 70);

        Coche miCoche = new Coche();

        miCoche.sumarPuertas();
        miCoche.sumarPuertas();
        System.out.println("El numero de puertas es: " + miCoche.numeroDePuertas);

    }

    public static void suma(int numero1, int numero2, int numero3){
        int resultado;
        resultado = numero1 + b + numero3;
        System.out.println(resultado);
    }
}

class Coche {
    public int numeroDePuertas = 4;

    public void sumarPuertas(){

        this.numeroDePuertas++;
    }
}

