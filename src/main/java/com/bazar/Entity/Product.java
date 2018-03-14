package com.bazar.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String name;

    public Product() {
    }

    public Product(@NotNull String name) {
        this.name = name;
    }
}
