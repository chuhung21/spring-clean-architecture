package edu.thanglong.presentation;

import edu.thanglong.domain.model.XeMay;
import edu.thanglong.usecase.XeMayService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/xemay")
public class XeMayController {

    private final XeMayService xeMayService;

    public XeMayController(XeMayService xeMayService) {
        this.xeMayService = xeMayService;
    }

    @GetMapping
    public List<XeMay> getAllXeMay() {
        return xeMayService.getAllXeMay();
    }

    @GetMapping("/{bks}")
    public ResponseEntity<XeMay> getXeMayById(@PathVariable String bks) {
        return xeMayService.getXeMayById(bks)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public XeMay createXeMay(@RequestBody XeMay xeMay) {
        return xeMayService.createXeMay(xeMay);
    }

    @PutMapping("/{bks}")
    public XeMay updateXeMay(@PathVariable String bks, @RequestBody XeMay xeMay) {
        return xeMayService.updateXeMay(bks, xeMay);
    }

    @DeleteMapping("/{bks}")
    public ResponseEntity<Void> deleteXeMay(@PathVariable String bks) {
        xeMayService.deleteXeMay(bks);
        return ResponseEntity.noContent().build();
    }
}
