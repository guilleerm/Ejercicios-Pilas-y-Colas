public class Principal {
    public static void main(String[] args) {
        //ejercicio 3
        Pila pila =new Pila();
        EjerciciosPilas ejerciciosPilas= new EjerciciosPilas();
        System.out.println("pila vacia: ");
        System.out.println(ejerciciosPilas.comparacion(pila));
        pila.apilar(3);
        pila.apilar(1);
        pila.apilar(1);
        pila.apilar(1);
        System.out.println("fondo pila menor(-1): ");
        System.out.println(ejerciciosPilas.comparacion(pila));
        pila.desapilar();
        System.out.println("fondo pila igual(0): ");
        System.out.println(ejerciciosPilas.comparacion(pila));
        pila.desapilar();
        System.out.println("fondo pila mayor(1): ");
        System.out.println(ejerciciosPilas.comparacion(pila));

        //ejercicio 4
        Pila pila2 = new Pila();
        pila2.apilar(3);
        pila2.apilar(2);
        pila2.apilar(3);
        pila2.apilar(4);
        pila2.apilar(5);
        pila2.apilar(2);
        ejerciciosPilas.eliminarPosicionUltimo(pila2);
        pila2.mostrar();


    }
}
