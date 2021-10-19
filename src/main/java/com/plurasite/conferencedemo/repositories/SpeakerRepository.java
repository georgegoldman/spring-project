package com.plurasite.conferencedemo.repositories;

import com.plurasite.conferencedemo.models.Speaker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
    
}
