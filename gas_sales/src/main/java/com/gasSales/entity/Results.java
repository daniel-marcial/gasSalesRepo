package com.gasSales.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="gasstationdesc")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Results {
	
	
	@Column(name="id")
	private int id;
	
	@Id
	@Column(name="_id")
	private String _id;
	
	@Column(name="calle")
	private String calle;
	
	@Column(name="rfc")
	private String rfc;
	
	@Column(name="date_insert")
	private String date_insert;
	
	@Column(name="regular")
	private String regular;
	
	@Column(name="colonia")
	private String colonia;
	
	@Column(name="numeropermiso")
	private String numeropermiso;
	
	@Column(name="fechaaplicacion")
	private String fechaaplicacion;
	
	@Column(name="longitude")
	private String longitude;
	
	@Column(name="latitude")
	private String latitude;
	
	@Column(name="premium")
	private String premium;
	
	@Column(name="razonsocial")
	private String razonsocial;
	
	@Column(name="codigopostal")
	private String codigopostal;
	
	@Column(name="dieasel")
	private String dieasel;

	public int getId() {
		return id;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getDate_insert() {
		return date_insert;
	}
	public void setDate_insert(String date_insert) {
		this.date_insert = date_insert;
	}
	public String getRegular() {
		return regular;
	}
	public void setRegular(String regular) {
		this.regular = regular;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getNumeropermiso() {
		return numeropermiso;
	}
	public void setNumeropermiso(String numeropermiso) {
		this.numeropermiso = numeropermiso;
	}
	public String getFechaaplicacion() {
		return fechaaplicacion;
	}
	public void setFechaaplicacion(String fechaaplicacion) {
		this.fechaaplicacion = fechaaplicacion;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	public String getRazonsocial() {
		return razonsocial;
	}
	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}
	public String getCodigopostal() {
		return codigopostal;
	}
	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
	}
	public String getDieasel() {
		return dieasel;
	}
	public void setDieasel(String dieasel) {
		this.dieasel = dieasel;
	}
	
	@Override
	public String toString() {
		return "GasData [id=" + id + ", _id=" + _id + ", calle=" + calle + ", rfc=" + rfc + ", date_insert=" + date_insert + ", regular="
				+ regular + ", colonia=" + colonia + ", numeropermiso=" + numeropermiso + ", fechaaplicacion="
				+ fechaaplicacion + ", longitude=" + longitude + ", latitude=" + latitude
				+ ", premium=" + premium + ", razonsocial=" + razonsocial + ", codigopostal=" + codigopostal
				+ ", dieasel=" + dieasel + "]";
	}
	
	
}
