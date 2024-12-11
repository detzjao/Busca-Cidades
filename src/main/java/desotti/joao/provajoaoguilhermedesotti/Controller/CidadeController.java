package desotti.joao.provajoaoguilhermedesotti.Controller;


import desotti.joao.provajoaoguilhermedesotti.Model.Cidade;
import desotti.joao.provajoaoguilhermedesotti.Model.Estado;
import desotti.joao.provajoaoguilhermedesotti.Services.CidadeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cidades")
@CrossOrigin
public class CidadeController {
    private final CidadeService cidadeService;

    public CidadeController(CidadeService cidadeService) {
        this.cidadeService = cidadeService;
    }

    @GetMapping("/{uf}")
    public List<Cidade> buscarPorEstado(@PathVariable String uf) {
        return cidadeService.buscarCidadesPorEstado(uf);
    }
}


