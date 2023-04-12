public class Principal {
    public static void main(String[] args) {
        EjerciciosPilas ejerciciosPilas= new EjerciciosPilas();

        //ejercicio 1
        Pila pila1 = new Pila();
        int num= 3;
        pila1.apilar(3);
        pila1.apilar(2);
        pila1.apilar(1);
        ejerciciosPilas.repetir(pila1,num);
        pila1.mostrar();

        //ejercicio 2
        Pila pila2 =new Pila();
        pila2.apilar(5);
        pila2.apilar(3);
        pila2.apilar(8);
        pila2.apilar(4);
        ejerciciosPilas.pilaReorganizable(pila2,3);
        pila2.mostrar();



        //ejercicio 3
        Pila pila3 =new Pila();
        System.out.println("pila vacia: ");
        System.out.println(ejerciciosPilas.comparacion(pila3));
        pila3.apilar(3);
        pila3.apilar(1);
        pila3.apilar(1);
        pila3.apilar(1);
        System.out.println("fondo pila menor(-1): ");
        System.out.println(ejerciciosPilas.comparacion(pila3));
        pila3.desapilar();
        System.out.println("fondo pila igual(0): ");
        System.out.println(ejerciciosPilas.comparacion(pila3));
        pila3.desapilar();
        System.out.println("fondo pila mayor(1): ");
        System.out.println(ejerciciosPilas.comparacion(pila3));

        //ejercicio 4
        Pila pila4 = new Pila();
        pila4.apilar(3);
        pila4.apilar(2);
        pila4.apilar(3);
        pila4.apilar(4);
        pila4.apilar(5);
        pila4.apilar(2);
        ejerciciosPilas.eliminarPosicionUltimo(pila4);
        pila4.mostrar();

        //ejercicio 5



    }
}
