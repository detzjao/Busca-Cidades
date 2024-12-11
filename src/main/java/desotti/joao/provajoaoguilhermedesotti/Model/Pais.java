package desotti.joao.provajoaoguilhermedesotti.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "pais")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "nome_pt")
    private String nomePt;

    @Column(name = "sigla")
    private String sigla;

    @Column(name = "bacen")
    private Integer bacen;

    @Column(name = "ddi")
    private Integer ddi;

    public Pais() {}

    public Pais(Long id, String nome, String nomePt, String sigla, Integer bacen, Integer ddi) {
        this.id = id;
        this.nome = nome;
        this.nomePt = nomePt;
        this.sigla = sigla;
        this.bacen = bacen;
        this.ddi = ddi;
    }

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

    public String getNomePt() {
        return nomePt;
    }

    public void setNomePt(String nomePt) {
        this.nomePt = nomePt;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Integer getBacen() {
        return bacen;
    }

    public void setBacen(Integer bacen) {
        this.bacen = bacen;
    }

    public Integer getDdi() {
        return ddi;
    }

    public void setDdi(Integer ddi) {
        this.ddi = ddi;
    }
}
