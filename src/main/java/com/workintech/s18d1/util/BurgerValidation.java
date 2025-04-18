package com.workintech.s18d1.util;

import com.workintech.s18d1.entity.BreadType;
import com.workintech.s18d1.entity.Burger;
import com.workintech.s18d1.exceptions.BurgerException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class BurgerValidation {

    public static void checkname(String name) {
        if (name == null || name.isEmpty()) {
            throw new BurgerException("Name cannot be null", HttpStatus.BAD_REQUEST);
        }
    }
}



