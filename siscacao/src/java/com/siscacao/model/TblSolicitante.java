package com.siscacao.model;
// Generated 20/10/2013 04:28:11 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * TblSolicitante generated by hbm2java
 */
public class TblSolicitante  implements java.io.Serializable {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Basic(optional = false)
     @Column(name = "id_solicitante")   
     private Long idSolicitante;
     private TblTipoDocumento tblTipoDocumento;
     private String nombreSolicitante;
     private Long idDepartamento;
     private String numeroDocumento;
     private Set tblSolicituds = new HashSet(0);
     private Set tblContactos = new HashSet(0);

    public TblSolicitante() {
    }

	
    public TblSolicitante(Long idSolicitante) {
        this.idSolicitante = idSolicitante;
    }
    public TblSolicitante(Long idSolicitante, TblTipoDocumento tblTipoDocumento, String nombreSolicitante, Long idDepartamento, String numeroDocumento, Set tblSolicituds, Set tblContactos) {
       this.idSolicitante = idSolicitante;
       this.tblTipoDocumento = tblTipoDocumento;
       this.nombreSolicitante = nombreSolicitante;
       this.idDepartamento = idDepartamento;
       this.numeroDocumento = numeroDocumento;
       this.tblSolicituds = tblSolicituds;
       this.tblContactos = tblContactos;
    }
   
    public Long getIdSolicitante() {
        return this.idSolicitante;
    }
    
    public void setIdSolicitante(Long idSolicitante) {
        this.idSolicitante = idSolicitante;
    }
    public TblTipoDocumento getTblTipoDocumento() {
        return this.tblTipoDocumento;
    }
    
    public void setTblTipoDocumento(TblTipoDocumento tblTipoDocumento) {
        this.tblTipoDocumento = tblTipoDocumento;
    }
    public String getNombreSolicitante() {
        return this.nombreSolicitante;
    }
    
    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }
    public Long getIdDepartamento() {
        return this.idDepartamento;
    }
    
    public void setIdDepartamento(Long idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
    public String getNumeroDocumento() {
        return this.numeroDocumento;
    }
    
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Set getTblSolicituds() {
        return this.tblSolicituds;
    }
    
    public void setTblSolicituds(Set tblSolicituds) {
        this.tblSolicituds = tblSolicituds;
    }
    public Set getTblContactos() {
        return this.tblContactos;
    }
    
    public void setTblContactos(Set tblContactos) {
        this.tblContactos = tblContactos;
    }




}


