package com.siscacao.model;
// Generated 20/10/2013 04:28:11 PM by Hibernate Tools 3.2.1.GA



/**
 * TblSintomaPatologia generated by hbm2java
 */
public class TblSintomaPatologia  implements java.io.Serializable {


     private int idSintomaPatologia;
     private TblSintoma tblSintoma;
     private TblPatologia tblPatologia;

    public TblSintomaPatologia() {
    }

	
    public TblSintomaPatologia(int idSintomaPatologia) {
        this.idSintomaPatologia = idSintomaPatologia;
    }
    public TblSintomaPatologia(int idSintomaPatologia, TblSintoma tblSintoma, TblPatologia tblPatologia) {
       this.idSintomaPatologia = idSintomaPatologia;
       this.tblSintoma = tblSintoma;
       this.tblPatologia = tblPatologia;
    }
   
    public int getIdSintomaPatologia() {
        return this.idSintomaPatologia;
    }
    
    public void setIdSintomaPatologia(int idSintomaPatologia) {
        this.idSintomaPatologia = idSintomaPatologia;
    }
    public TblSintoma getTblSintoma() {
        return this.tblSintoma;
    }
    
    public void setTblSintoma(TblSintoma tblSintoma) {
        this.tblSintoma = tblSintoma;
    }
    public TblPatologia getTblPatologia() {
        return this.tblPatologia;
    }
    
    public void setTblPatologia(TblPatologia tblPatologia) {
        this.tblPatologia = tblPatologia;
    }




}


