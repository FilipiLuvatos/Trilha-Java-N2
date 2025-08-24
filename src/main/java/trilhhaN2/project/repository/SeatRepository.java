package trilhhaN2.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import trilhhaN2.project.model.Seat;

import java.util.List;

public interface SeatRepository extends JpaRepository<Seat, Long> {

    @Query(value = """
        select * from seat s
        where s.lugar = :seat;
        """, nativeQuery = true)
    Seat getConsultaSeat(String seat);


    @Query(value = """
        select * from seat s
        where s.lugar = :seat;
        """, nativeQuery = true)
    List<Seat> getConsultaSeatList(String seat);
}
