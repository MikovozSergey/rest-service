package com.sergei.rest.repositories;

import com.sergei.rest.entities.Consumers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumersRepository extends JpaRepository<Consumers, Long> {
}
