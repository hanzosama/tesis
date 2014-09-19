/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siscacao.dao;

import com.siscacao.model.TblDiagnostico;
import com.siscacao.model.TblDiagnosticoCaracteristica;
import com.siscacao.model.TblDiagnosticoImagen;

/**
 *
 * @author Hanzo
 */
public interface DiagnosticoDao {
  
    public boolean createDiagnosticoImagen(TblDiagnosticoImagen diagnosticoImagen);
    public boolean updateDiagnosticoImage(TblDiagnosticoImagen diagnosticoImagen);
    
    public TblDiagnosticoImagen getTblDiagnosticoImagenByGeneralDiagnotico(TblDiagnostico diagnostico);
    
    public TblDiagnosticoCaracteristica getTblDiagnosticoCaracteristicaByGeneralDiagnotico(TblDiagnostico diagnostico);
    
    public TblDiagnostico getTblDiagnosticoById(Long id);
    
    public boolean createDiagnosticoSintoma(TblDiagnosticoCaracteristica diagnosticoCaracteristica);
    public boolean updateDiagnosticoImage(TblDiagnosticoCaracteristica caracteristica);
    public boolean createDiagnosticoGeneral(TblDiagnostico diagnostico);
}
