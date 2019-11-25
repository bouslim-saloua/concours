/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.concours.service;

import com.fstg.concours.bean.Candidat;
import com.fstg.concours.bean.NotePreinscription;
import com.fstg.concours.bean.Seuil;
import com.fstg.concours.bean.Preinscription;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Smart Safi
 */
public interface PreinscriptionService {
    public void save(Preinscription preinscription);
    public List<Preinscription> findAll();
    public Preinscription findByCode(String code);
    public BigDecimal score(Candidat candidat, List<NotePreinscription> notes);
    public List<Preinscription> valider(List<Preinscription> preinscriptions, Seuil seuil);
   
}
