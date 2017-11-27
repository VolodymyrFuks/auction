package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "AUCTION")
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TIMEOFSTART")
    private Date timeOfStart;
    @Column(name = "TIMEOFEND")
    private Date timeOfEnd;
    @Column(name = "STATE")
    private String state; //?

    //One To Many



    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "auction")
/*    @JoinTable(
            name = "LISTOFLOTS",
            joinColumns = @JoinColumn(name = "AUCTION_ID"),
            inverseJoinColumns = @JoinColumn(name = "LOT_ID")
    )*/
    private Set<Lot> lots = new HashSet<Lot>();
    public Auction() {

    }

    public Set<Lot> getLots() {
        return this.lots;
    }

    public void setLots(Set<Lot> lots) {
        this.lots = lots;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTimeOfStart() {
        return timeOfStart;
    }

    public void setTimeOfStart(Date timeOfStart) {
        this.timeOfStart = timeOfStart;
    }

    public Date getTimeOfEnd() {
        return timeOfEnd;
    }

    public void setTimeOfEnd(Date timeOfEnd) {
        this.timeOfEnd = timeOfEnd;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Set<Lot> getListOfLots() {
        return lots;
    }

    public void setListOfLots(Set<Lot> lots) {
        this.lots = lots;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Auction auction = (Auction) o;

        if (id != null ? !id.equals(auction.id) : auction.id != null) return false;
        if (timeOfStart != null ? !timeOfStart.equals(auction.timeOfStart) : auction.timeOfStart != null) return false;
        if (timeOfEnd != null ? !timeOfEnd.equals(auction.timeOfEnd) : auction.timeOfEnd != null) return false;
        if (state != null ? !state.equals(auction.state) : auction.state != null) return false;
        return lots != null ? lots.equals(auction.lots) : auction.lots == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (timeOfStart != null ? timeOfStart.hashCode() : 0);
        result = 31 * result + (timeOfEnd != null ? timeOfEnd.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (lots != null ? lots.hashCode() : 0);
        return result;
    }
}
