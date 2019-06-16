package com.epam.reflection.entity;

import com.epam.reflection.annotations.Secured;

public class Entity {
    @Secured(firstValue = 1)
    private void firstMethod() {

    }

    @Secured(firstValue = 2, secondValue = "val")
    public void secondMethod() {

    }

    public void thirdMethod() {

    }
}
