package medvoll.apiestudo.medico;

import medvoll.apiestudo.endereco.DadosEndereco;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public record DadosCadastroMedico(
        @NotBlank //nem nulo, nem vazio
        String nome,
        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}") //limitar a quantidade de numero
        String crm,
        @NotNull //somente para campos strings
        Especialidades especialidade,
        @NotNull
        @Valid //validar tbm esse objeto como um dos meus atributos
        DadosEndereco endereco) {
}
