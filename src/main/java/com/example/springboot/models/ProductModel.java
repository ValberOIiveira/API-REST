package com.example.springboot.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Sempre que criarmos uma entidade precisamos desses @
@Entity
// Aqui criamos o nome da tabela que o hibernate vai criar depois
@Table(name = "TB_PRODUCTS")

// Serializable is a quick way to show something
public class ProductModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    // É o AUTO_INCREMENT do postgresql
    @GeneratedValue(strategy = GenerationType.AUTO)
    // Muito usado em arquitetura de microsservicos
    private UUID idProduct;
    private String name;
    private BigDecimal value;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public UUID getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(UUID idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

}
