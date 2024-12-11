package desotti.joao.provajoaoguilhermedesotti.Services;

import desotti.joao.provajoaoguilhermedesotti.Model.Cidade;
import desotti.joao.provajoaoguilhermedesotti.Repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CidadeService {
    private final CidadeRepository cidadeRepository;

    public CidadeService(CidadeRepository cidadeRepository) {
        this.cidadeRepository = cidadeRepository;
    }

    public List<Cidade> buscarCidadesPorEstado(String uf) {
        return cidadeRepository.findByEstadoUf(uf);
    }
}

