package edu.thanglong.infrastructure.repository;

import edu.thanglong.domain.model.XeMay;
import edu.thanglong.domain.repository.XeMayRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XeMayRepositoryImpl extends JpaRepository<XeMay, String>, XeMayRepository {
}
