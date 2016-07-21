/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

/**
 *
 * @author SERVIDOR-PC
 */
public class Categoria {
    
    private int idCategoria;
    private String categoria;
    private int categoriaPadre;

    public Categoria(int idCategoria, String categoria, int categoriaPadre) {
        this.idCategoria = idCategoria;
        this.categoria = categoria;
        this.categoriaPadre = categoriaPadre;
    }

    public Categoria() {
    }
    
    
    
    /**
     * @return the idCategoria
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the categoriaPadre
     */
    public int getCategoriaPadre() {
        return categoriaPadre;
    }

    /**
     * @param categoriaPadre the categoriaPadre to set
     */
    public void setCategoriaPadre(int categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
    }

    @Override
    public String toString() {
        
        return String.format( "[%d, %s, %d]", getIdCategoria(), getCategoria(), getCategoriaPadre());
    }
    
    
}
