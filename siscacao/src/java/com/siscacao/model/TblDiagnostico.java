package com.siscacao.model;
// Generated 20/10/2013 04:28:11 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * TblDiagnostico generated by hbm2java
 */
public class TblDiagnostico  implements java.io.Serializable {


     private int idDiagnostico;
     private String nombreDiagnostico;
     private String descripcionDiagnostico;
     private Set tblRespuestaSolicituds = new HashSet(0);
     private Set tblDiagnosticoCaracteristicasForIdDiagnostico = new HashSet(0);
     private Set tblDiagnosticoCaracteristicasForIdDiagnosticoRelacionado = new HashSet(0);
     private Set tblDiagnosticoImagensForIdDiagnosticoRelacionado = new HashSet(0);
     private Set tblDiagnosticoImagensForIdDiagnostico = new HashSet(0);

    public TblDiagnostico() {
    }

	
    public TblDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }
    public TblDiagnostico(int idDiagnostico, String nombreDiagnostico, String descripcionDiagnostico, Set tblRespuestaSolicituds, Set tblDiagnosticoCaracteristicasForIdDiagnostico, Set tblDiagnosticoCaracteristicasForIdDiagnosticoRelacionado, Set tblDiagnosticoImagensForIdDiagnosticoRelacionado, Set tblDiagnosticoImagensForIdDiagnostico) {
       this.idDiagnostico = idDiagnostico;
       this.nombreDiagnostico = nombreDiagnostico;
       this.descripcionDiagnostico = descripcionDiagnostico;
       this.tblRespuestaSolicituds = tblRespuestaSolicituds;
       this.tblDiagnosticoCaracteristicasForIdDiagnostico = tblDiagnosticoCaracteristicasForIdDiagnostico;
       this.tblDiagnosticoCaracteristicasForIdDiagnosticoRelacionado = tblDiagnosticoCaracteristicasForIdDiagnosticoRelacionado;
       this.tblDiagnosticoImagensForIdDiagnosticoRelacionado = tblDiagnosticoImagensForIdDiagnosticoRelacionado;
       this.tblDiagnosticoImagensForIdDiagnostico = tblDiagnosticoImagensForIdDiagnostico;
    }
   
    public int getIdDiagnostico() {
        return this.idDiagnostico;
    }
    
    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }
    public String getNombreDiagnostico() {
        return this.nombreDiagnostico;
    }
    
    public void setNombreDiagnostico(String nombreDiagnostico) {
        this.nombreDiagnostico = nombreDiagnostico;
    }
    public String getDescripcionDiagnostico() {
        return this.descripcionDiagnostico;
    }
    
    public void setDescripcionDiagnostico(String descripcionDiagnostico) {
        this.descripcionDiagnostico = descripcionDiagnostico;
    }
    public Set getTblRespuestaSolicituds() {
        return this.tblRespuestaSolicituds;
    }
    
    public void setTblRespuestaSolicituds(Set tblRespuestaSolicituds) {
        this.tblRespuestaSolicituds = tblRespuestaSolicituds;
    }
    public Set getTblDiagnosticoCaracteristicasForIdDiagnostico() {
        return this.tblDiagnosticoCaracteristicasForIdDiagnostico;
    }
    
    public void setTblDiagnosticoCaracteristicasForIdDiagnostico(Set tblDiagnosticoCaracteristicasForIdDiagnostico) {
        this.tblDiagnosticoCaracteristicasForIdDiagnostico = tblDiagnosticoCaracteristicasForIdDiagnostico;
    }
    public Set getTblDiagnosticoCaracteristicasForIdDiagnosticoRelacionado() {
        return this.tblDiagnosticoCaracteristicasForIdDiagnosticoRelacionado;
    }
    
    public void setTblDiagnosticoCaracteristicasForIdDiagnosticoRelacionado(Set tblDiagnosticoCaracteristicasForIdDiagnosticoRelacionado) {
        this.tblDiagnosticoCaracteristicasForIdDiagnosticoRelacionado = tblDiagnosticoCaracteristicasForIdDiagnosticoRelacionado;
    }
    public Set getTblDiagnosticoImagensForIdDiagnosticoRelacionado() {
        return this.tblDiagnosticoImagensForIdDiagnosticoRelacionado;
    }
    
    public void setTblDiagnosticoImagensForIdDiagnosticoRelacionado(Set tblDiagnosticoImagensForIdDiagnosticoRelacionado) {
        this.tblDiagnosticoImagensForIdDiagnosticoRelacionado = tblDiagnosticoImagensForIdDiagnosticoRelacionado;
    }
    public Set getTblDiagnosticoImagensForIdDiagnostico() {
        return this.tblDiagnosticoImagensForIdDiagnostico;
    }
    
    public void setTblDiagnosticoImagensForIdDiagnostico(Set tblDiagnosticoImagensForIdDiagnostico) {
        this.tblDiagnosticoImagensForIdDiagnostico = tblDiagnosticoImagensForIdDiagnostico;
    }




}


