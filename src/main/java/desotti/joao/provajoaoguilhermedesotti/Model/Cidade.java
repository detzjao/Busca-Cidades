package desotti.joao.provajoaoguilhermedesotti.Model;

import jakarta.persistence.*;


@Entity
@Table(name = "cidade")
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "ibge")
    private Integer ibge;

    @Column(name = "lat_lon")
    private String latLon;

    @Column(name = "cod_tom")
    private Integer codTom;

    @ManyToOne
    @JoinColumn(name = "uf", referencedColumnName = "id")
    private Estado estado;

    public Cidade() {}

    public Cidade(Long id, String nome, Integer ibge, String latLon, Integer codTom, Estado estado) {
        this.id = id;
        this.nome = nome;
        this.ibge = ibge;
        this.latLon = latLon;
        this.codTom = codTom;
        this.estado = estado;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIbge() {
        return ibge;
    }

    public void setIbge(Integer ibge) {
        this.ibge = ibge;
    }

    public String getLatLon() {
        return latLon;
    }

    public void setLatLon(String latLon) {
        this.latLon = latLon;
    }

    public Integer getCodTom() {
        return codTom;
    }

    public void setCodTom(Integer codTom) {
        this.codTom = codTom;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
