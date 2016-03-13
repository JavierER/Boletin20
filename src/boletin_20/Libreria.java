package boletin_20;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Libreria {
    private final ArrayList<Libro> Libreria = new ArrayList<>();

    public void añade() {
        Libro x = new Libro();
        Libreria.add(x);
    }

    public void vender() {
        String ti = JOptionPane.showInputDialog("Titulo:");
        int num = Integer.parseInt(JOptionPane.showInputDialog("Vendidos?:"));
        for (int i = 0; i < Libreria.size(); i++) {

            if (ti.equalsIgnoreCase(Libreria.get(i).getTitulo())) {
                num = Libreria.get(i).getUnidades() - num;
                Libreria.get(i).setUnidades(num);
                JOptionPane.showMessageDialog(null, "Quedan " + Libreria.get(i).getUnidades() + " unidades.");
            }
        }
    }

    public void titulos() {
        Collections.sort(Libreria, null);
        String texto = "";
        for (int i = 0; i < Libreria.size(); i++) {
            
            texto += Libreria.get(i).getTitulo() + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public void bajaCero() {
         
        for (int i = 0; i < Libreria.size(); i++) {

            if (Libreria.get(i).getUnidades() <1) {
                JOptionPane.showMessageDialog(null, "Se ha dado de baja:\n" + Libreria.get(i).getTitulo());
                Libreria.remove(i);
            }
            else {
                JOptionPane.showMessageDialog(null,"Hay unidades de todos los libros.");
            }
        }
    }

    public void consultar() {
        String ti = JOptionPane.showInputDialog("Titulo del libro que quieres consultar:");
        for (int i = 0; i < Libreria.size(); i++) {
            if (ti.equalsIgnoreCase(Libreria.get(i).getTitulo())) {
                JOptionPane.showMessageDialog(null, Libreria.get(i).toString());
            }
        }
    }

}
