package com.mbs.Service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.mbs.Model.SeatType1;
import com.mbs.Repository.SeatTypeDao;

@Service
public class SeatTypeService implements ISeatTypeService {
	@Autowired
	SeatTypeDao dao;
	public SeatType1 addSeatType(SeatType1 seattype1) {
		SeatType1  b=dao.save(seattype1);
	return b;
	}
	
	
}
