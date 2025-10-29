package edu.thanglong.domain.repository;

import edu.thanglong.domain.model.XeMay;
import java.util.List;
import java.util.Optional;

public interface XeMayRepository {
    List<XeMay> findAll();
    Optional<XeMay> findById(String bks);
    XeMay save(XeMay xeMay);
    void deleteById(String bks);
}
