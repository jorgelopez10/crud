/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crud;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dt3mfa
 */
@Stateless
public class AlumnosFacade extends AbstractFacade<Alumnos> {
    @PersistenceContext(unitName = "crudPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AlumnosFacade() {
        super(Alumnos.class);
    }
    
}
