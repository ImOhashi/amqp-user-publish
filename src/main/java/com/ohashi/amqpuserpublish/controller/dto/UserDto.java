package com.ohashi.amqpuserpublish.controller.dto;

import com.ohashi.amqpuserpublish.controller.form.UserForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private String name;
    private String surname;

    public UserDto(UserForm userForm) {
        this.name = userForm.getName();
        this.surname = userForm.getSurname();
    }
}
