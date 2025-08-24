package trilhhaN2.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import trilhhaN2.project.domain.SeatDTO;
import trilhhaN2.project.model.Seat;
import trilhhaN2.project.repository.SeatRepository;
import trilhhaN2.project.service.SeatService;

import java.util.List;

@RestController
@RequestMapping("/seat")
public class SeatController {

    @Autowired
    SeatRepository seatRepository;

    @Autowired
    SeatService seatService;

    @PostMapping("/cadastra")
    @Transactional
    public ResponseEntity cadastraSeat(@RequestBody SeatDTO seatDTO) {
        return ResponseEntity.ok(seatService.cadastroSeat(seatDTO));

    }

    @GetMapping("/consultaSeat/{seat}")
    public ResponseEntity consultaConta(@PathVariable String seat) {
        return ResponseEntity.ok(seatService.consultaSeatList(seat));
    }


    @GetMapping("/all")
    public ResponseEntity<List<Seat>>consultaAll(){
        return ResponseEntity.ok(seatService.consultaAll()); //200
    }

    @PutMapping
    @Transactional
    public ResponseEntity atualizaSeat(@RequestBody SeatDTO seatDTO){
        return  ResponseEntity.ok(seatService.atualizaSeat(seatDTO));
    }



    @DeleteMapping("/{lugar}")
    @Transactional
    public ResponseEntity excluiSeat(@PathVariable String lugar){
        Seat seat = seatService.consultaSeat(lugar);
        if (seat == null) {
            return ResponseEntity.notFound().build();
        }
        seatService.excluiSeat(seat);
        return ResponseEntity.noContent().build(); // 204 No Content
    }
}
