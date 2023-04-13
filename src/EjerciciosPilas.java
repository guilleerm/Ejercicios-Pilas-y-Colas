public class EjerciciosPilas {

    public boolean estaContenido (Pila pila, int dato) {
        boolean resultado = false;
        if (!pila.vacia()) {
            int actual = pila.desapilar();
            if (actual == dato)
                resultado = true;
            else resultado = estaContenido(pila,dato);
            pila.apilar(actual);
        }
        return resultado;
    }
    public Pila copiarPila (Pila pilaOrigen) {
        Pila pilaCopia;
        if (!pilaOrigen.vacia()) {
            int elemento = pilaOrigen.desapilar();
            pilaCopia = copiarPila(pilaOrigen);
            pilaOrigen.apilar(elemento);
            pilaCopia.apilar(elemento);
        }
        else pilaCopia  = new Pila();
        return pilaCopia;
    }
    void escribirPila (Pila pila, int posicion) {
        if (!pila.vacia()) {
            int elemento = pila.desapilar ();
            System.out.println ("Elemento " + posicion + ": " + elemento);
            escribirPila (pila, posicion+1);
            pila.apilar (elemento);
        } else System.out.println ("FIN");
    }

    //ejercicio 1
    public Pila repetir(Pila pila,int n){
        if(!pila.vacia()){
            int elemento=pila.desapilar();
            repetir(pila,n);
            while(n>0){
                pila.apilar(elemento);
                n--;
            }
        }
        return pila;
    }

    //ejercicio2
    public void pilaReorganizable(Pila pila, int dato){
        eliminar(pila,dato);
        pila.apilar(dato);

    }
    private void eliminar(Pila pila, int dato){
        if(!pila.vacia()) {
            int elemento = pila.desapilar();
            eliminar(pila, dato);
            pila.apilar(elemento);
            if (elemento == dato)
                pila.desapilar();
        }

    }

    //ejercicio3
    public int comparacion(Pila pila) {
        int contador = 0;
        if (pila.vacia()) {
            return 0;
        }
        Pila aux = new Pila();
        while (!pila.vacia()) {
            aux.apilar(pila.desapilar());
            contador++;
        }
        int fondo = aux.desapilar();
        pila.apilar(fondo);
        while (!aux.vacia()) {
            pila.apilar(aux.desapilar());
        }
        if (fondo < contador) {
            return -1;
        } else if (fondo == contador) {
            return 0;
        } else {
            return 1;
        }
    }

    //ejercicio4
    public void eliminarPosicionUltimo(Pila pila) {

        if (!pila.vacia()) {
            Pila aux = new Pila();
            while (!pila.vacia()) {
                aux.apilar(pila.desapilar());

            }
            int fondo = aux.desapilar();
            aux.apilar(fondo);
            int contador = 0;
            while (!aux.vacia()) {
                if (contador == fondo) {
                    aux.desapilar();
                } else {
                    pila.apilar(aux.desapilar());
                }
                contador++;
            }
        }
    }

    //ejercicio5

    public void moverElementoFondo (Pila p){
        int fondo = 0;
        if(!p.vacia()){
            Pila aux = new Pila();
            while(!p.vacia()){
                aux.apilar(p.desapilar());
            }
            fondo= aux.desapilar();
            while(!aux.vacia())
                p.apilar(aux.desapilar());
            p.apilar(fondo);
        }else System.out.println("\n ta vacia\n");
    }

    //ejercicio6
    /*public void hacerPilaCapicua (Pila pila){
        if(!pila.vacia()){
            int elemento=pila.desapilar();
            pila.apilar(elemento);
            hacerPilaCapicua(pila);

        }
    }*/

    public void hacerPilaCapicua(Pila pila){
        if(!pila.vacia()){
        }else{
            int elemento = pila.desapilar();
            hacerPilaCapicua(pila); // La Pila queda como 32 --> 3223
            ponerFondo(pila, elemento);
            pila.apilar(elemento);
        }
    }

    private void ponerFondo(Pila pila, int dato){
        if(pila.vacia()){
            pila.apilar(dato);
        }else{
            int elemento = pila.desapilar();
            ponerFondo(pila,dato);
            pila.apilar(elemento);
        }
    }

    //ejercicio7

    int eliminarDato (Pila pila, int dato){
        int resultado=0;
        if(!pila.vacia()){
            int cima= pila.desapilar();
            resultado=this.eliminarDato(pila, dato);
            if(cima==dato)
                resultado++;
            else pila.apilar(cima);
            return resultado;
        }
        else resultado=0;
        return resultado;
    }

    //ejercicio8

    public int mayorElemento (Pila pila){
        int resultado=-1;       // Se inicializa "resultado" con el valor -1
        if(!pila.vacia()){     // Se verifica si la pila no está vacía
            int cima =pila.desapilar();   // Se retira el elemento superior de la pila y se almacena en "cima"
            resultado=mayorElemento(pila);   // Se realiza una llamada recursiva para buscar el mayor elemento en el resto de la pila
            if(cima > resultado){   // Se compara "cima" con el resultado obtenido en la llamada recursiva
                resultado=cima;     // Si "cima" es mayor, se actualiza el valor de "resultado" con el valor de "cima"
            }
            pila.apilar(cima);   // Se vuelve a colocar el elemento superior de la pila en su lugar original
        }
        return resultado;   // Se devuelve el valor de "resultado"
    }

    //ejercicio9

    public Pila quitarPosicionesPares(Pila pila){
        return this.quitarPosicionesPares(pila,0);
    }

    private Pila quitarPosicionesPares(Pila pila, int contador) {
        if(pila.vacia()){
            return new Pila();
        }else {
            int cima = pila.desapilar();
            contador++;
            Pila aux = this.quitarPosicionesPares(pila, contador);
            if (contador % 2 == 0)
                aux.apilar(cima);
            else pila.apilar(cima);
            return aux;
        }
    }

    //ejercicio10

    public void ponerFondoDiferenciaMaximoMinimo (Pila pila){

    }

}