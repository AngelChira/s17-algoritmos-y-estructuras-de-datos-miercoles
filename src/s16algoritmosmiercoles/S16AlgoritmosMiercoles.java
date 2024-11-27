package s16algoritmosmiercoles;

public class S16AlgoritmosMiercoles {

    public static void main(String[] args) {
        Nodo root = null;
        root = ArbolBusqueda.insertar(root, 50, "A");
        ArbolBusqueda.insertar(root, 20, "B");
        ArbolBusqueda.insertar(root, 60, "C");
        ArbolBusqueda.insertar(root, 10, "D");
        ArbolBusqueda.insertar(root, 25, "E");
        ArbolBusqueda.insertar(root, 55, "F");
        
        ArbolBusqueda.inOrderKey(root);
        System.out.println("");
        ArbolBusqueda.preOrderKey(root);
        System.out.println("");
        ArbolBusqueda.postOrderKey(root);
        System.out.println("");
        Nodo respuesta = ArbolBusqueda.buscar(root, 100);
        if ( respuesta == null) { 
            System.out.println("No se encuentra");
        } else {
            System.out.printf("El valor de la clave es %s \n",respuesta.getValue());
        }
        
        ArbolBusqueda.eliminar(root, 20);
        System.out.println("");
        ArbolBusqueda.inOrderKey(root);
        System.out.println("");
        
    }
    
}

   