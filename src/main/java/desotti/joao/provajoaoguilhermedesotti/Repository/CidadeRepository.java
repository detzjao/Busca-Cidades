package desotti.joao.provajoaoguilhermedesotti.Repository;

import desotti.joao.provajoaoguilhermedesotti.Model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    List<Cidade> findByEstadoUf(String uf);

}
