package com.workintech.s18d1.controller;

import com.workintech.s18d1.dao.BurgerDao;
import com.workintech.s18d1.entity.BreadType;
import com.workintech.s18d1.entity.Burger;
import com.workintech.s18d1.util.BurgerValidation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/burger")

public class BurgerController {

    private final BurgerDao burgerDao;


    @Autowired
    public BurgerController(BurgerDao burgerDao) {
        this.burgerDao = burgerDao;

    }

    @GetMapping
    public List<Burger> findAll(){
        return burgerDao.findAll();
    }

    @GetMapping("/{id}")
    public Burger fingById(@PathVariable long id){
        return burgerDao.findById(id);
    }

    @PostMapping
    public Burger saveBurger(@RequestBody Burger burger){
        BurgerValidation.checkname(burger.getName());
        return burgerDao.save(burger);
    }

    @PutMapping
    public Burger updateBurger(@RequestBody Burger burger){
        BurgerValidation.checkname(burger.getName());
        return burgerDao.update(burger);
    }

    @DeleteMapping("/{id}")
    public Burger deleteBurger(@PathVariable long id){
        return burgerDao.remove(id);
    }

    @GetMapping("/price/{price}")
    public List<Burger> findbyPrice(@PathVariable("price") Integer price){
        return burgerDao.findByPrice(price);
    }

    @GetMapping("/breadType/{breadType}")
    public List<Burger> findByBreadType(@PathVariable("breadType") String breadType){
        BreadType btEnum = BreadType.valueOf(breadType);
        return burgerDao.findByBreadType(btEnum);
    }

    @GetMapping("/content/{content}")
    public List<Burger> findByContent(@PathVariable("content") String content){

        return burgerDao.findByContent(content);
    }


}
