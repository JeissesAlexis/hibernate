/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Iterator;
import javax.swing.JOptionPane;
import modelo_persistencia.Proveedor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class proveedor {
     public void InsertaProveedor(Proveedor pro){
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.save(pro);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog(null,"Proveedor Insertado Correctamenete");
    
    }      
    
      public Proveedor buscarProveedor(String proveedor){
  Proveedor pro;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    pro=(Proveedor)session.get(Proveedor.class,proveedor);
    tx.commit();
    session.close();
    
    return pro;
    }
        public void BorrarProveedor(Proveedor pro){
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.delete(pro);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog(null,"Proveedor Eliminado Correctamenete");
    
    }  
}
