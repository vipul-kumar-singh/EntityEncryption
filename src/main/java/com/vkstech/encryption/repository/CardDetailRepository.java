package com.vkstech.encryption.repository;

import com.vkstech.encryption.entity.CardDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardDetailRepository extends JpaRepository<CardDetail, Integer> {
}
