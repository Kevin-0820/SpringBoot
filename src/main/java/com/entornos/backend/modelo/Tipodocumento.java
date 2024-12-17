package com.entornos.backend.modelo;


import jakarta.persistence.*;

@Entity
@Table(name=Tipodocumento.TABLE_NAME)
public class Tipodocumento {

    public static final String TABLE_NAME = "tipodocumento";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idTipoDocumento;

    @Column(name = "tipo")
    private String tipo;

    // Constructor

    public Tipodocumento() {
    }

    public Tipodocumento(String tipo) {
        this.tipo = tipo;
    }



    public Long idTipoDocumento() {
        return idTipoDocumento;
    }

    public void setId_tipodocumento(Long idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}
