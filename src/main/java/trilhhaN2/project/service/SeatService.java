package trilhhaN2.project.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilhhaN2.project.domain.SeatDTO;
import trilhhaN2.project.model.Seat;
import trilhhaN2.project.repository.SeatRepository;

import java.util.Collections;
import java.util.List;


@Service
public class SeatService {


    @Autowired
    SeatRepository seatRepository;

    public List<Seat> consultaAll(){
        return seatRepository.findAll();
    }

    public void excluiSeat (Seat seat){
        seatRepository.delete(seat);
    }

    public Seat consultaSeat(String seat){
        return seatRepository.getConsultaSeat(seat);
    }

    public List<Seat> consultaSeatList(String seat){
        return seatRepository.getConsultaSeatList(seat);
    }

    public SeatDTO atualizaSeat(SeatDTO seatDTO){
        var seat = seatRepository.getConsultaSeat(seatDTO.getLugar());
        seat.atualizaSeatStatus(seatDTO);
        return seatDTO;
    }

    public SeatDTO cadastroSeat(SeatDTO seatDTO) {
        Seat seat = new Seat(seatDTO);
        seat = seatRepository.save(seat);
        seatDTO.setId(seat.getId());
        return seatDTO;
    }
}
