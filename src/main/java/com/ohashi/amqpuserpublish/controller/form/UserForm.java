package com.ohashi.amqpuserpublish.controller.form;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UserForm {

    @NotNull
    @NotEmpty
    @Length(min = 5)
    private String name;

    @NotNull
    @NotEmpty
    @Length(min = 5)
    private String surname;

    @NotNull
    @NotEmpty
    @Length(min = 10)
    private String email;

    @NotNull
    @NotEmpty
    @Length(min = 11)
    private String cpf;
}
