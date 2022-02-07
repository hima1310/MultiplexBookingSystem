package com.mbs.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mbs.Model.SeatType1;

public interface SeatTypeDao extends JpaRepository<SeatType1,Integer> {
	

}