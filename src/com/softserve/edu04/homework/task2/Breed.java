package com.softserve.edu04.homework.task2;

public enum Breed {
    AKITA ("Akita"),
    ALASKAN_MALAMUTE ("Alaskan Malamute"),
    GERMAN_SHEPHERD ("German Shepherd"),
    LABRADOR_RETRIEVER ("Labrador Retriever"),
    BELGIAN_MALINOIS ("Belgian Malinois"),
    CANE_CORSO ("Cane Corso"),
    SIBERIAN_HUSKY ("Siberian Husky"),
    POMERANIAN ("Pomeranian"),
    NEWFOUNDLAND ("Newfoundland"),
    YORKSHIRE_TERRIER ("Yorkshire Terrier"),
    TIBETAN_MASTIFF ("Tibetan Mastiff");

    private final String breed;

    Breed (final String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return breed;
    }
}

