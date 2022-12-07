package medvoll.apiestudo.medico;

import medvoll.apiestudo.endereco.DadosEndereco;

import javax.validation.constraints.NotNull;

public record DadosAtualizaMedico(

        @NotNull
        Long id,
        String telefone,
        String nome,
        DadosEndereco endereco) {
}
