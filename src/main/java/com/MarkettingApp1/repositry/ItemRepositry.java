package com.MarkettingApp1.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MarkettingApp1.entities.Item;

public interface ItemRepositry extends JpaRepository<Item, Long> {

}
