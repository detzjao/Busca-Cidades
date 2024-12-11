package desotti.joao.provajoaoguilhermedesotti.Model;
import desotti.joao.provajoaoguilhermedesotti.Model.Pais;
import jakarta.persistence.*;

@Entity
@Table(name = "estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "uf")
    private String uf;

    @Column(name = "ibge")
    private Integer ibge;

    @ManyToOne
    @JoinColumn(name = "pais", referencedColumnName = "id")
    private Pais pais;

    public Estado() {}

    public Estado(Long id, String nome, String uf, Integer ibge, Pais pais) {
        this.id = id;
        this.nome = nome;
        this.uf = uf;
        this.ibge = ibge;
        this.pais = pais;
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    public void setIbge(Integer ibge) {
        this.ibge = ibge;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
