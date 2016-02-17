/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.EegSignalsDAO;
import Entidad.EegSignals;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class EegControl {

    public void Registrar(ArrayList<EegSignals> listaEeg) {
        for(int i =0;i<listaEeg.size();i++){
            EegSignalsDAO.saveOrUpdate(listaEeg.get(i));
        }
    }
    
}
