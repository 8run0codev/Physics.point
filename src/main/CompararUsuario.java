package main;

import java.io.Serializable;
import java.util.ArrayList;

public class CompararUsuario implements Serializable {

    private String Usuario;
    private String Contraseña;
    private ArrayList<Datitos> listaDatitos;
    private DatitosGuardar archivo = new DatitosGuardar();

    void CompararUsuario() {
        listaDatitos = archivo.leer();
        Usuario = this.Usuario = "";
        Contraseña = this.Contraseña = "";
    }

    public void agregarUsuario(String User, String Password) {
        Datitos datitos = new Datitos();
        datitos.aceptarDatos(User, Password);
        getListaDatitos().add(datitos);
        grabar();
    }

    public boolean buscarUsuarioYContraseña(String User, String Password) {
        boolean iguales = false;

        for (int i = 0; i < getListaDatitos().size(); i++) {
            if (getListaDatitos().get(i).getUsuario().equals(User) && getListaDatitos().get(i).getContraseña().equals(Password)) {
                iguales = true;
            }
        }

        return iguales;
    }

    public void grabar() {
        archivo.Serializarvv(listaDatitos);
    }

    /**
     * @return the Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * @return the Contraseña
     */
    public String getContraseña() {
        return Contraseña;
    }

    /**
     * @param Contraseña the Contraseña to set
     */
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    /**
     * @return the listaDatitos
     */
    public ArrayList<Datitos> getListaDatitos() {
        return listaDatitos;
    }

    /**
     * @param listaDatitos the listaDatitos to set
     */
    public void setListaDatitos(ArrayList<Datitos> listaDatitos) {
        this.listaDatitos = listaDatitos;
    }

    /**
     * @return the archivo
     */
    public DatitosGuardar getArchivo() {
        return archivo;
    }

    /**
     * @param archivo the archivo to set
     */
    public void setArchivo(DatitosGuardar archivo) {
        this.archivo = archivo;
    }

}
