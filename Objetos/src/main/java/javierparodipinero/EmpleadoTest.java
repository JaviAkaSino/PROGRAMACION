package javierparodipinero;

public class EmpleadoTest {

    public static void main(String[] args) {

        Empleado em1 = new Empleado();

        em1.setNombre("Javier");
        em1.setAppellidos("Parodi");
        em1.setCasado(true);
        em1.setHijos(2);
        em1.setNif("09079384L");
        em1.setSueldoBase(1800);
        em1.setIrpf(12);
        em1.setPrecioHE(18.2);
        em1.setNumHE(20);

        Empleado em2 = new Empleado("Edgarcito", "Allende", "05654987J", 10, 5, 15, 1500, 0, false);

        System.out.println(em2.getNif());

        em2.setHijos(3);

//        System.out.println(em2.toString());
//        System.out.println(em1.toString());
//        System.out.println(em2.toString());
        em1.escribirAllInfo();

    }

}
