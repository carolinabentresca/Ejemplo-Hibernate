package Modelo;

import Dao.Producto1;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ProductosList {

    //Método Listar Producto
    public void listarProducto() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        ss.beginTransaction();
        Query q = ss.createQuery("from Producto1");
        List lista = q.list();
        for (Object obj : lista) {
            Producto1 producto = (Producto1) obj;
            System.out.println("*****************************");
            System.out.println("ID: " + producto.getId());
            System.out.println("MARCA: " + producto.getMarca());
            System.out.println("MODELO: " + producto.getModelo());
            System.out.println("COLOR: " + producto.getColor());
            System.out.println("PRECIO: " + producto.getPrecio());
            System.out.println("CUOTA: " + producto.getCuota());
        }
        ss.getTransaction().commit();
        ss.close();
    }
}
