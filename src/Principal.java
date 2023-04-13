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

        Pila pila5 = new Pila();

        ejerciciosPilas.moverElementoFondo(pila5);
        pila5.apilar(6);
        pila5.apilar(7);
        pila5.apilar(7);
        pila5.apilar(7);
        pila5.apilar(7);
        ejerciciosPilas.moverElementoFondo(pila5);
        pila5.mostrar();

        //ejercicio6
        Pila pila6 = new Pila();
        pila6.apilar(2);
        pila6.apilar(3);
        pila6.apilar(1);
        ejerciciosPilas.hacerPilaCapicua(pila6);
        pila6.mostrar();

        //ejercicio7
        Pila pila7 = new Pila();
        pila7.apilar(7);
        pila7.apilar(3);
        pila7.apilar(74);
        pila7.apilar(3);

        System.out.println("Se han eliminado "+ ejerciciosPilas.eliminarDato(pila7,3)+ " elementos");
        pila7.mostrar();

        //ejercicio 8

        Pila pila8 = new Pila();
        pila8.apilar(8);
        pila8.apilar(2);
        pila8.apilar(6);
        pila8.apilar(7);
        pila8.apilar(6);
        System.out.println(ejerciciosPilas.mayorElemento(pila8));

        //ejercicio9

        Pila pila9 = new Pila();
        pila9.apilar(7);
        pila9.apilar(8);
        pila9.apilar(7);
        pila9.apilar(8);
        pila9.apilar(7);
        ejerciciosPilas.quitarPosicionesPares(pila9).mostrar();
        pila9.mostrar();




    }
}
