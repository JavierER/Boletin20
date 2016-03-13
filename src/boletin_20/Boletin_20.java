package boletin_20;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Boletin_20 {

    
    public static void main(String[] args) {
        Libreria li = new Libreria();
        int res;
        do {
            res = Integer.parseInt(JOptionPane.showInputDialog("Opción: "
                    + "\n1.Añadir libro.\n2.Vender libro.\n3.Libros."
                    + "\n4.Consultar\n5.Dar de baja libros sin unidades.\nPulsa cualquier otra tecla para salir."));
            switch (res) {
                case 1:
                    li.añade();
                    break;
                case 2:
                    li.vender();
                    break;
                case 3:
                    li.titulos();
                    break;
                case 4:
                    li.consultar();
                    break;
                case 5:
                    li.bajaCero();
                    break;
                default:
                    System.exit(res);
                    break;
            }
        } while (res < 6 & res > 0);
    }
    }
