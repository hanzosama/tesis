package com.siscacao.model;
// Generated 20/10/2013 04:28:11 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * TblRespuestaSolicitud generated by hbm2java
 */
public class TblRespuestaSolicitud  implements java.io.Serializable {


     private int idRespuestaSolicitud;
     private TblSolicitud tblSolicitud;
     private TblDiagnostico tblDiagnostico;
     private String descripcionRespuesta;
     private Date fechaRespuesta;
     private Date fechaSolicitud;

    public TblRespuestaSolicitud() {
    }

	
    public TblRespuestaSolicitud(int idRespuestaSolicitud) {
        this.idRespuestaSolicitud = idRespuestaSolicitud;
    }
    public TblRespuestaSolicitud(int idRespuestaSolicitud, TblSolicitud tblSolicitud, TblDiagnostico tblDiagnostico, String descripcionRespuesta, Date fechaRespuesta, Date fechaSolicitud) {
       this.idRespuestaSolicitud = idRespuestaSolicitud;
       this.tblSolicitud = tblSolicitud;
       this.tblDiagnostico = tblDiagnostico;
       this.descripcionRespuesta = descripcionRespuesta;
       this.fechaRespuesta = fechaRespuesta;
       this.fechaSolicitud = fechaSolicitud;
    }
   
    public int getIdRespuestaSolicitud() {
        return this.idRespuestaSolicitud;
    }
    
    public void setIdRespuestaSolicitud(int idRespuestaSolicitud) {
        this.idRespuestaSolicitud = idRespuestaSolicitud;
    }
    public TblSolicitud getTblSolicitud() {
        return this.tblSolicitud;
    }
    
    public void setTblSolicitud(TblSolicitud tblSolicitud) {
        this.tblSolicitud = tblSolicitud;
    }
    public TblDiagnostico getTblDiagnostico() {
        return this.tblDiagnostico;
    }
    
    public void setTblDiagnostico(TblDiagnostico tblDiagnostico) {
        this.tblDiagnostico = tblDiagnostico;
    }
    public String getDescripcionRespuesta() {
        return this.descripcionRespuesta;
    }
    
    public void setDescripcionRespuesta(String descripcionRespuesta) {
        this.descripcionRespuesta = descripcionRespuesta;
    }
    public Date getFechaRespuesta() {
        return this.fechaRespuesta;
    }
    
    public void setFechaRespuesta(Date fechaRespuesta) {
        this.fechaRespuesta = fechaRespuesta;
    }
    public Date getFechaSolicitud() {
        return this.fechaSolicitud;
    }
    
    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }




}


