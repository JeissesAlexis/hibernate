/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import modelo_persistencia.Marca;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class marca {
    public void InsertsarMarca (Marca inser){
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.save(inser);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog(null,"Marca Insertado Correctamenete");
    
    }    

   
    public Marca buscarMarca(String marca){
  Marca busca;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    busca=(Marca)session.get(Marca.class,marca);
    tx.commit();
    session.close();
    
    return busca;
    }
     public void BorrarMarca (Marca marca){
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.delete(marca);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog(null,"Marca Eliminado Correctamenete");
    
    }    

}
