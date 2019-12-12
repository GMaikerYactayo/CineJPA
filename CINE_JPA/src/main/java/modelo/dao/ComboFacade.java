/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.entidad.Combo;

/**
 *
 * @author PC14
 */
@Stateless
public class ComboFacade extends AbstractFacade<Combo> {

    @PersistenceContext(unitName = "BD_CINE")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ComboFacade() {
        super(Combo.class);
    }
    
}
