package com.siscacao.model;
// Generated 20/10/2013 04:28:11 PM by Hibernate Tools 3.2.1.GA

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * TblDiagnosticoImagen generated by hbm2java
 */
public class TblDiagnosticoImagen implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_diagnostico_imagen")
    private Long idDiagnosticoImagen;
    private TblDiagnostico tblDiagnosticoByIdDiagnostico;
    private TblDiagnostico tblDiagnosticoByIdDiagnosticoRelacionado;
    private String mapPie;
    private Long idImagen;
    private Long idPatogologia;
    private Double maxValue;

    public TblDiagnosticoImagen() {
    }

    public TblDiagnosticoImagen(Long idDiagnosticoImagen) {
        this.idDiagnosticoImagen = idDiagnosticoImagen;
    }

    public TblDiagnosticoImagen(Long idDiagnosticoImagen, TblDiagnostico tblDiagnosticoByIdDiagnostico, TblDiagnostico tblDiagnosticoByIdDiagnosticoRelacionado) {
        this.idDiagnosticoImagen = idDiagnosticoImagen;
        this.tblDiagnosticoByIdDiagnostico = tblDiagnosticoByIdDiagnostico;
        this.tblDiagnosticoByIdDiagnosticoRelacionado = tblDiagnosticoByIdDiagnosticoRelacionado;
    }

    public Long getIdDiagnosticoImagen() {
        return this.idDiagnosticoImagen;
    }

    public void setIdDiagnosticoImagen(Long idDiagnosticoImagen) {
        this.idDiagnosticoImagen = idDiagnosticoImagen;
    }

    public TblDiagnostico getTblDiagnosticoByIdDiagnostico() {
        return this.tblDiagnosticoByIdDiagnostico;
    }

    public void setTblDiagnosticoByIdDiagnostico(TblDiagnostico tblDiagnosticoByIdDiagnostico) {
        this.tblDiagnosticoByIdDiagnostico = tblDiagnosticoByIdDiagnostico;
    }

    public TblDiagnostico getTblDiagnosticoByIdDiagnosticoRelacionado() {
        return this.tblDiagnosticoByIdDiagnosticoRelacionado;
    }

    public void setTblDiagnosticoByIdDiagnosticoRelacionado(TblDiagnostico tblDiagnosticoByIdDiagnosticoRelacionado) {
        this.tblDiagnosticoByIdDiagnosticoRelacionado = tblDiagnosticoByIdDiagnosticoRelacionado;
    }

    public String getMapPie() {
        return mapPie;
    }

    public void setMapPie(String mapPie) {
        this.mapPie = mapPie;
    }

    public Long getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(Long idImagen) {
        this.idImagen = idImagen;
    }

    public Long getIdPatogologia() {
        return idPatogologia;
    }

    public void setIdPatogologia(Long idPatogologia) {
        this.idPatogologia = idPatogologia;
    }

    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }
    
}
