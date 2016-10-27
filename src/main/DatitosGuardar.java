package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class DatitosGuardar implements Serializable {

    ArrayList<Datitos> Lista = new ArrayList<Datitos>();

    public ArrayList<Datitos> leer() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Empleado.dat"));
            Lista = (ArrayList<Datitos>) in.readObject();
            in.close();
        } catch (Exception e) {
            Datitos admin= new Datitos();
            admin.setContraseña("123");
            admin.setUsuario("admin");
            Lista.add(admin);
            
        }
        return Lista;
    }

    void Serializarvv(ArrayList<Datitos> ListaSarializar) {
        try {
            FileOutputStream out = new FileOutputStream("Empleado.dat");
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(Lista);
            objOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
