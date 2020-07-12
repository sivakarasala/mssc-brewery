package dev.shambho.msscbrewery.services;

import dev.shambho.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerID);
}
