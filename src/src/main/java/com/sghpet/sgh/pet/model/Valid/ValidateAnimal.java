package com.sghpet.sgh.pet.model.Valid;

import com.sghpet.sgh.pet.model.Animal;
import com.sghpet.sgh.pet.model.Customer;

public class ValidateAnimal {

    public Animal validateAnimal(String name, Customer owner, String type, String postage, boolean hasMedicalCondition) {
        String expression = "[A-Za-z éãí]+";
        if (name.length() == 0) {
            throw new RuntimeException("Erro: Nome do animal não pode ser vazio");
        }
        if (!name.matches(expression)) {
            throw new RuntimeException("Erro: Nome do animal contém caracteres inválidos");
        }

        if (type.length() == 0) {
            throw new RuntimeException("Erro: Tipo não pode ser vazio");
        }
        if (!type.matches(expression)) {
            throw new RuntimeException("Erro: Tipo contém caracteres inválidos");
        }

        if (postage.length() == 0) {
            throw new RuntimeException("Erro: Porte não pode ser vazio");
        }
        if (!postage.matches(expression)) {
            throw new RuntimeException("Erro: Porte contém caracteres inválidos");
        }

        return new Animal(name, owner, type, postage, hasMedicalCondition);
    }
}
