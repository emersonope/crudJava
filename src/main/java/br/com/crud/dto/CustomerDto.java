package br.com.crud.dto;

import br.com.crud.model.CustomerModel;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class CustomerDto {

    @CPF
    @NotBlank
    private String cpf;

    @NotNull
    @NotBlank
    private String nome;

    @NotNull
    private String telefone;

    public CustomerDto(CustomerModel customerModel) {
        this.cpf = customerModel.getCpf();
        this.nome = customerModel.getNome();
        this.telefone = customerModel.getTelefone();
    }
}
