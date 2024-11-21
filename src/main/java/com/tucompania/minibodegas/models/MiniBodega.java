package main.java.com.tucompania.minibodegas.models;

import jakarta.persistence.*;

@Entity
public class MiniBodega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroSerie;
    private String tamano;
    private String ubicacion;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    // Getters y Setters
}
