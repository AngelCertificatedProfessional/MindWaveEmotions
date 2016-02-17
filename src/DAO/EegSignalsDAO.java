/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.EegSignals;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Fernando
 */
public class EegSignalsDAO {
    
    
    /**
     * Metodo para el guardado y actualizacion de una entidad
     * @param t Objeto a gurdar o actualizar
     */
    public static void saveOrUpdate(EegSignals egg) {
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            HibernateUtil.getSession().saveOrUpdate(egg);
            HibernateUtil.commitTransaction();
            System.out.println("Guardado exitoso");
        }catch(HibernateException e){
            e.printStackTrace();
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
    }
}
