package dao;

import entities.Auction;
import entities.Lot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuctionDao extends JpaRepository<Auction, Long> {
//    void add(Auction auction);
//    //read
//
//    List<Auction> getAll(Auction auction);
//    Auction getById(Long id);
//
//    //update
//    void update(Auction auction);
//
//    //delete
//    void remove(Auction auction);
}
