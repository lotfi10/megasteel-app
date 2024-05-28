package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.OrderState;

public interface OrderStateRepository extends JpaRepository<OrderState, Long> {

	Optional<OrderState> findById(int id);

}
