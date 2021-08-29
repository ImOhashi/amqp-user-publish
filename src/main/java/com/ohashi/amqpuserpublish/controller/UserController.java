package com.ohashi.amqpuserpublish.controller;

import com.ohashi.amqpuserpublish.controller.dto.UserDto;
import com.ohashi.amqpuserpublish.controller.form.UserForm;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @PostMapping
    public ResponseEntity<UserDto> register(@RequestBody @Valid UserForm userForm, UriComponentsBuilder uriComponentsBuilder) {
        URI uri = uriComponentsBuilder.path("/user/{id}").buildAndExpand()
    }

}
