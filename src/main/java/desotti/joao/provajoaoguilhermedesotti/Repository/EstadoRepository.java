package desotti.joao.provajoaoguilhermedesotti.Repository;

import desotti.joao.provajoaoguilhermedesotti.Model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

    Estado findByUf(String uf);

}
