package com.MarkettingApp1.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MarkettingApp1.entities.Lead;

public interface LeadRepositry extends JpaRepository<Lead, Long> {

}
