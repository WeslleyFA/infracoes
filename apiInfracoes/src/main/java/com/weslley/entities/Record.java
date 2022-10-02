package com.weslley.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "records")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordID;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT")
    private Instant data;
    private String velocidade;
    private String placa;
    private String veiculo;

    public Long getRecordID() {
        return recordID;
    }

    public void setRecordID(Long recordID) {
        this.recordID = recordID;
    }

    public Instant getData() {
        return data;
    }

    public void setData(Instant data) {
        this.data = data;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
}
