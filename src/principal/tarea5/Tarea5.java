package principal.tarea5;

import javabasico.tarea5.Construccion;

public class Tarea5 {


    public static void main(String[] args) {

        Construccion c1 = new Construccion();

        c1.setNombre("Edificio Bill Clinton");
        c1.setAltura(300.5);
        c1.setPrecio(1000000);
        c1.setPatente(false);
        c1.setCantidadVentanas(7000);

        System.out.println("Nombre de la estructura: " + c1.getNombre());
        System.out.println("Altura en metros: " + c1.getAltura());
        System.out.println("Patente de construcciom al día: " + c1.getPatente());
        System.out.println("Valor en dolares: " + c1.getPrecio());
        System.out.println("Cantidad de ventanas: " + c1.getCantidadVentanas());


    }

}
