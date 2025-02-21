package br.com.fiap.api_rest.dto;

import br.com.fiap.api_rest.enums.Categoria;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

@Data
@AllArgsConstructor
public class ClienteRequest {
    @NotBlank(
            message= "O nome não pode ser em branco!"
    )
    @Size(  min = 3,
            max = 150,
            message = "O nome deve ter entre 3 e 150 caracteres"
    )
    private String nome;
    //////////////////////////////////////////////////
    @Min(
            value=18,
            message = ("O cliente deve ter no mínimo 18 anos")
    )
    private int idade;
    //////////////////////////////////////////////////
    @Email(
            message = "Email fora do formato correto"
    )
    private String email;
    //////////////////////////////////////////////////
    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[@!,#])(?=.*\\d)[A-Za-z\\d\\W].{8,}$",
            message = "A senha deve ter pelo menos 8 caracteres, incluindo uma letra maiúscula, uma minúscula e um caractere especial."
    )

    private String senha;
    /////////////////////////////////////////////////
    @CPF(
            message = "Cpf Inválido"
    )
    private String cpf;
    ////////////////////////////////////////////////////
    @NotNull(
            message = "A categoria é obrigatória!"
    )
    private Categoria categoria;
    //////////////////////////////////////////////////

}
