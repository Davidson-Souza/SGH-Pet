package com.sghpet.sgh.pet.model.Valid;

import com.sghpet.sgh.pet.model.Customer;

public class ValidateCustomer {

    public Customer validateCustomer(String name, String cpf, String address, String phone) {
        String expression = "[A-Za-z éãí]+";
        if (name.length() == 0) {
            throw new RuntimeException("Nome não pode ser vazio");
        }
        if (!name.matches(expression)) {
            throw new RuntimeException("Nome contém caracteres inválidos");
        }

        ValidatePessoaFisica validateCpf = new ValidatePessoaFisica();
        if (!validateCpf.validaCPF(cpf)) {
            throw new RuntimeException("CPF inválido");
        }
        if (address.length() == 0) {
            throw new RuntimeException("Endereço não pode ser vazio");
        }
        if (!address.matches(expression)) {
            throw new RuntimeException("Endereço contém caracteres inválidos");
        }
        return new Customer(cpf, name, address, phone);
    }
}
