
package boletin_20;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private int prezo;
    private int unidades;

    public Libro() {
        this.titulo = JOptionPane.showInputDialog("Titulo:");
        this.autor = JOptionPane.showInputDialog("Autor:");
        this.ISBN = JOptionPane.showInputDialog("ISBN:");
        this.prezo = Integer.parseInt(JOptionPane.showInputDialog("Precio:"));
        this.unidades = Integer.parseInt(JOptionPane.showInputDialog("Numero de unidades:"));
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPrezo() {
        return prezo;
    }

    public void setPrezo(int prezo) {
        this.prezo = prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + "\nautor: " + autor + "\nISBN: " + ISBN + "\nprezo: " + prezo + "\nunidades. " + unidades;
    }

}
