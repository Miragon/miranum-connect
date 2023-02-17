package io.miragon.miranum.examples.pizzaorder.waiter.adapter.in.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PlaceOrderRequestDto {

    private String email;
    private List<String> food;
    private List<String> drinks;
}