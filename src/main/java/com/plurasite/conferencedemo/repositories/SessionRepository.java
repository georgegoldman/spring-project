package com.plurasite.conferencedemo.repositories;

import com.plurasite.conferencedemo.models.Session;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
    
}
