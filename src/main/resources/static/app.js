document.getElementById("buscar").addEventListener("click", function () {
    const uf = document.getElementById("uf").value.toUpperCase().trim(); // Converte o UF para maiúsculas e remove espaços

    if (uf === "") {
        alert("Por favor, digite o UF do estado.");
        return;
    }

    fetch(`http://localhost:8080/api/cidades/${uf}`)
        .then(response => {
            if (!response.ok) {
                throw new Error("Erro ao buscar dados. Verifique o backend.");
            }
            return response.json();
        })
        .then(data => {
            const resultado = document.getElementById("resultado");
            resultado.innerHTML = "";

            if (data.length > 0) {
                data.forEach(cidade => {
                    const li = document.createElement("li");
                    li.innerHTML = `<strong>${cidade.nome}</strong> - IBGE: ${cidade.ibge} - Localização: ${cidade.latLon}`;
                    resultado.appendChild(li);
                });
            } else {
                resultado.innerHTML = "<li>Nenhuma cidade encontrada para este estado.</li>";
            }
        })
        .catch(error => {
            console.error("Erro ao buscar cidades:", error);
            alert("Erro ao buscar dados. Consulte o console para mais detalhes.");
        });
});