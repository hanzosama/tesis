package com.siscacao.model;
// Generated 20/10/2013 04:28:11 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TblSolicitud generated by hbm2java
 */
public class TblSolicitud  implements java.io.Serializable {


     private int idSolicitud;
     private TblEtapa tblEtapa;
     private TblTipoSolicitud tblTipoSolicitud;
     private TblCultivo tblCultivo;
     private TblSolicitante tblSolicitante;
     private TblPatologia tblPatologia;
     private TblEstado tblEstado;
     private TblVereda tblVereda;
     private TblFase tblFase;
     private Date fechaSolicitud;
     private Set tblImagens = new HashSet(0);
     private Set tblRespuestaSolicituds = new HashSet(0);
     private Set tblAsignacionSolicituds = new HashSet(0);

    public TblSolicitud() {
    }

	
    public TblSolicitud(int idSolicitud, Date fechaSolicitud) {
        this.idSolicitud = idSolicitud;
        this.fechaSolicitud = fechaSolicitud;
    }
    public TblSolicitud(int idSolicitud, TblEtapa tblEtapa, TblTipoSolicitud tblTipoSolicitud, TblCultivo tblCultivo, TblSolicitante tblSolicitante, TblPatologia tblPatologia, TblEstado tblEstado, TblVereda tblVereda, TblFase tblFase, Date fechaSolicitud, Set tblImagens, Set tblRespuestaSolicituds, Set tblAsignacionSolicituds) {
       this.idSolicitud = idSolicitud;
       this.tblEtapa = tblEtapa;
       this.tblTipoSolicitud = tblTipoSolicitud;
       this.tblCultivo = tblCultivo;
       this.tblSolicitante = tblSolicitante;
       this.tblPatologia = tblPatologia;
       this.tblEstado = tblEstado;
       this.tblVereda = tblVereda;
       this.tblFase = tblFase;
       this.fechaSolicitud = fechaSolicitud;
       this.tblImagens = tblImagens;
       this.tblRespuestaSolicituds = tblRespuestaSolicituds;
       this.tblAsignacionSolicituds = tblAsignacionSolicituds;
    }
   
    public int getIdSolicitud() {
        return this.idSolicitud;
    }
    
    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }
    public TblEtapa getTblEtapa() {
        return this.tblEtapa;
    }
    
    public void setTblEtapa(TblEtapa tblEtapa) {
        this.tblEtapa = tblEtapa;
    }
    public TblTipoSolicitud getTblTipoSolicitud() {
        return this.tblTipoSolicitud;
    }
    
    public void setTblTipoSolicitud(TblTipoSolicitud tblTipoSolicitud) {
        this.tblTipoSolicitud = tblTipoSolicitud;
    }
    public TblCultivo getTblCultivo() {
        return this.tblCultivo;
    }
    
    public void setTblCultivo(TblCultivo tblCultivo) {
        this.tblCultivo = tblCultivo;
    }
    public TblSolicitante getTblSolicitante() {
        return this.tblSolicitante;
    }
    
    public void setTblSolicitante(TblSolicitante tblSolicitante) {
        this.tblSolicitante = tblSolicitante;
    }
    public TblPatologia getTblPatologia() {
        return this.tblPatologia;
    }
    
    public void setTblPatologia(TblPatologia tblPatologia) {
        this.tblPatologia = tblPatologia;
    }
    public TblEstado getTblEstado() {
        return this.tblEstado;
    }
    
    public void setTblEstado(TblEstado tblEstado) {
        this.tblEstado = tblEstado;
    }
    public TblVereda getTblVereda() {
        return this.tblVereda;
    }
    
    public void setTblVereda(TblVereda tblVereda) {
        this.tblVereda = tblVereda;
    }
    public TblFase getTblFase() {
        return this.tblFase;
    }
    
    public void setTblFase(TblFase tblFase) {
        this.tblFase = tblFase;
    }
    public Date getFechaSolicitud() {
        return this.fechaSolicitud;
    }
    
    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }
    public Set getTblImagens() {
        return this.tblImagens;
    }
    
    public void setTblImagens(Set tblImagens) {
        this.tblImagens = tblImagens;
    }
    public Set getTblRespuestaSolicituds() {
        return this.tblRespuestaSolicituds;
    }
    
    public void setTblRespuestaSolicituds(Set tblRespuestaSolicituds) {
        this.tblRespuestaSolicituds = tblRespuestaSolicituds;
    }
    public Set getTblAsignacionSolicituds() {
        return this.tblAsignacionSolicituds;
    }
    
    public void setTblAsignacionSolicituds(Set tblAsignacionSolicituds) {
        this.tblAsignacionSolicituds = tblAsignacionSolicituds;
    }




}


