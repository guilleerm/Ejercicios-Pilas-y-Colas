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

    public void pilaReorganizable(Pila pila, int dato){
        if(!pila.vacia()){
            int elemento=pila.desapilar();
            pilaReorganizable(pila,dato);
            pila.apilar(elemento);
            if(elemento==dato)
                pila.desapilar();
        }else
            pila.apilar(dato);
    }

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

    public void moverElementoFondo (Pila p){
        Pila aux = new Pila();
    }
}