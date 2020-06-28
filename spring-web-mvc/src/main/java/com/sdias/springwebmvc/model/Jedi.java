package com.sdias.springwebmvc.model;

import javax.validation.constraints.NotBlank;

public class Jedi {
    @NotBlank(message = "Nome exigido!")
    private String name;

    @NotBlank(message = "Sobrenome exigido!")
    private String lastName;

    public Jedi(){}

    public Jedi(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
