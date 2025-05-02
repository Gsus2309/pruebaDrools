package com.ejemplo;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Venta implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private java.lang.Integer id;
    private java.util.Date periodo;
    private java.lang.Integer linea;
    private java.lang.Boolean isportacion;
    private java.lang.Boolean isportacionefectiva;
    private java.lang.String nombrealiado;
    private java.lang.String nombreplan;
    private java.util.Date fechaventa;
    private java.util.Date fechalegalizacion;
    private java.lang.Integer cedulaasesor;
    private java.lang.Integer codpos;
    private java.lang.Integer codsubpos;
    private java.lang.String regional;
    private java.lang.Integer mesliquidacion;
    private java.lang.Double pagom0;
    private java.lang.Double pagom1;
    private java.lang.Double pagom2;
    private java.lang.Double pagom3;
    private java.lang.Double pagom4;
    private java.lang.String tipolinea;
    private java.lang.Boolean estadolinea;
    private java.util.Date fechafacturacion;
    private java.lang.String estadosuspension;

    public Venta() {
    }

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.util.Date getPeriodo() {
        return this.periodo;
    }

    public void setPeriodo(java.util.Date periodo) {
        this.periodo = periodo;
    }

    public java.lang.Integer getLinea() {
        return this.linea;
    }

    public void setLinea(java.lang.Integer linea) {
        this.linea = linea;
    }

    public java.lang.Boolean getIsportacion() {
        return this.isportacion;
    }

    public void setIsportacion(java.lang.Boolean isportacion) {
        this.isportacion = isportacion;
    }

    public java.lang.Boolean getIsportacionefectiva() {
        return this.isportacionefectiva;
    }

    public void setIsportacionefectiva(java.lang.Boolean isportacionefectiva) {
        this.isportacionefectiva = isportacionefectiva;
    }

    public java.lang.String getNombrealiado() {
        return this.nombrealiado;
    }

    public void setNombrealiado(java.lang.String nombrealiado) {
        this.nombrealiado = nombrealiado;
    }

    public java.lang.String getNombreplan() {
        return this.nombreplan;
    }

    public void setNombreplan(java.lang.String nombreplan) {
        this.nombreplan = nombreplan;
    }

    public java.util.Date getFechaventa() {
        return this.fechaventa;
    }

    public void setFechaventa(java.util.Date fechaventa) {
        this.fechaventa = fechaventa;
    }

    public java.util.Date getFechalegalizacion() {
        return this.fechalegalizacion;
    }

    public void setFechalegalizacion(java.util.Date fechalegalizacion) {
        this.fechalegalizacion = fechalegalizacion;
    }

    public java.lang.Integer getCedulaasesor() {
        return this.cedulaasesor;
    }

    public void setCedulaasesor(java.lang.Integer cedulaasesor) {
        this.cedulaasesor = cedulaasesor;
    }

    public java.lang.Integer getCodpos() {
        return this.codpos;
    }

    public void setCodpos(java.lang.Integer codpos) {
        this.codpos = codpos;
    }

    public java.lang.Integer getCodsubpos() {
        return this.codsubpos;
    }

    public void setCodsubpos(java.lang.Integer codsubpos) {
        this.codsubpos = codsubpos;
    }

    public java.lang.String getRegional() {
        return this.regional;
    }

    public void setRegional(java.lang.String regional) {
        this.regional = regional;
    }

    public java.lang.Integer getMesliquidacion() {
        return this.mesliquidacion;
    }

    public void setMesliquidacion(java.lang.Integer mesliquidacion) {
        this.mesliquidacion = mesliquidacion;
    }

    public java.lang.Double getPagom0() {
        return this.pagom0;
    }

    public void setPagom0(java.lang.Double pagom0) {
        this.pagom0 = pagom0;
    }

    public java.lang.Double getPagom1() {
        return this.pagom1;
    }

    public void setPagom1(java.lang.Double pagom1) {
        this.pagom1 = pagom1;
    }

    public java.lang.Double getPagom2() {
        return this.pagom2;
    }

    public void setPagom2(java.lang.Double pagom2) {
        this.pagom2 = pagom2;
    }

    public java.lang.Double getPagom3() {
        return this.pagom3;
    }

    public void setPagom3(java.lang.Double pagom3) {
        this.pagom3 = pagom3;
    }

    public java.lang.Double getPagom4() {
        return this.pagom4;
    }

    public void setPagom4(java.lang.Double pagom4) {
        this.pagom4 = pagom4;
    }

    public java.lang.String getTipolinea() {
        return this.tipolinea;
    }

    public void setTipolinea(java.lang.String tipolinea) {
        this.tipolinea = tipolinea;
    }

    public java.lang.Boolean getEstadolinea() {
        return this.estadolinea;
    }

    public void setEstadolinea(java.lang.Boolean estadolinea) {
        this.estadolinea = estadolinea;
    }

    public java.util.Date getFechafacturacion() {
        return this.fechafacturacion;
    }

    public void setFechafacturacion(java.util.Date fechafacturacion) {
        this.fechafacturacion = fechafacturacion;
    }

    public java.lang.String getEstadosuspension() {
        return this.estadosuspension;
    }

    public void setEstadosuspension(java.lang.String estadosuspension) {
        this.estadosuspension = estadosuspension;
    }

    public Venta(java.lang.Integer id, java.util.Date periodo,
                  java.lang.Integer linea, java.lang.Boolean isportacion,
                  java.lang.Boolean isportacionefectiva,
                  java.lang.String nombrealiado, java.lang.String nombreplan,
                  java.util.Date fechaventa, java.util.Date fechalegalizacion,
                  java.lang.Integer cedulaasesor, java.lang.Integer codpos,
                  java.lang.Integer codsubpos, java.lang.String regional,
                  java.lang.Integer mesliquidacion, java.lang.Double pagom0,
                  java.lang.Double pagom1, java.lang.Double pagom2,
                  java.lang.Double pagom3, java.lang.Double pagom4,
                  java.lang.String tipolinea, java.lang.Boolean estadolinea,
                  java.util.Date fechafacturacion, java.lang.String estadosuspension) {
        this.id = id;
        this.periodo = periodo;
        this.linea = linea;
        this.isportacion = isportacion;
        this.isportacionefectiva = isportacionefectiva;
        this.nombrealiado = nombrealiado;
        this.nombreplan = nombreplan;
        this.fechaventa = fechaventa;
        this.fechalegalizacion = fechalegalizacion;
        this.cedulaasesor = cedulaasesor;
        this.codpos = codpos;
        this.codsubpos = codsubpos;
        this.regional = regional;
        this.mesliquidacion = mesliquidacion;
        this.pagom0 = pagom0;
        this.pagom1 = pagom1;
        this.pagom2 = pagom2;
        this.pagom3 = pagom3;
        this.pagom4 = pagom4;
        this.tipolinea = tipolinea;
        this.estadolinea = estadolinea;
        this.fechafacturacion = fechafacturacion;
        this.estadosuspension = estadosuspension;
    }

}
}
