package entities;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "LOT")
public class Lot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lot_id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRICE")
    private BigDecimal price;
    @ManyToOne(cascade = CascadeType.ALL)
    private Auction auction;

    public Lot(){
    }

    public Long getId() {
        return lot_id;
    }

    public void setId(Long id) {
        this.lot_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Auction getAuction() {
        return auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lot)) return false;

        Lot lot = (Lot) o;

        if (lot_id != null ? !lot_id.equals(lot.lot_id) : lot.lot_id != null) return false;
        if (name != null ? !name.equals(lot.name) : lot.name != null) return false;
        return price != null ? price.equals(lot.price) : lot.price == null;
    }

    @Override
    public int hashCode() {
        int result = lot_id != null ? lot_id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
