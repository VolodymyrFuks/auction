package dao;

import entities.Lot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LotDao  extends JpaRepository<Lot, Long> {
//    //create
//    void add(Lot lot);
//
//    //read
//    List<Lot> getAll(Lot lot);
//    Lot getById(Long id);
//
//    //update
//    void update(Lot lot);
//
//    //delete
//    void remove(Lot lot);
}
