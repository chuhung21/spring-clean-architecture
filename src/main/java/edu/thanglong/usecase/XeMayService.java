package edu.thanglong.usecase;

import edu.thanglong.domain.model.XeMay;
import edu.thanglong.domain.repository.XeMayRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class XeMayService {

    private final XeMayRepository xeMayRepository;

    public XeMayService(XeMayRepository xeMayRepository) {
        this.xeMayRepository = xeMayRepository;
    }

    public List<XeMay> getAllXeMay() {
        return xeMayRepository.findAll();
    }

    public Optional<XeMay> getXeMayById(String bks) {
        return xeMayRepository.findById(bks);
    }

    public XeMay createXeMay(XeMay xeMay) {
        return xeMayRepository.save(xeMay);
    }

    public XeMay updateXeMay(String bks, XeMay xeMayDetails) {
        return xeMayRepository.findById(bks)
                .map(xeMay -> {
                    xeMay.setMauXe(xeMayDetails.getMauXe());
                    xeMay.setChuPhuongTien(xeMayDetails.getChuPhuongTien());
                    return xeMayRepository.save(xeMay);
                })
                .orElseThrow(() -> new RuntimeException("Không tìm thấy xe máy với BKS: " + bks));
    }

    public void deleteXeMay(String bks) {
        xeMayRepository.deleteById(bks);
    }
}
