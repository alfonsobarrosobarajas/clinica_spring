package com.clinica.models;


import javax.persistence.*;

@Entity
@Table(name="medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id")
    private int id;
    @Column(name="codigo", columnDefinition = "char(10)", unique = true)
    private String codigo;
    @Column(name="nombre", columnDefinition = "varchar(20)", nullable = false)
    private String nombre;
    @Column(name="a_paterno", columnDefinition = "varchar(20)")
    private String aPaterno;
    @Column(name="a_materno", columnDefinition = "varchar(20)")
    private String aMaterno;

    public Medico() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }
}
