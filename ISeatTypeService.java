package com.mbs.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mbs.Model.SeatType1;
import com.mbs.Service.ISeatTypeService;

@RestController
public class SeatTypeController {
	@Autowired
	ISeatTypeService service;
	@PostMapping("/seattype1")
	public ResponseEntity<SeatType1> createBookSeat(@Validated @RequestBody SeatType1 seattype1){
	System.out.println("seattype1");
	SeatType1 b=service.addSeatType(seattype1);
	System.out.println(b);
	return new ResponseEntity<SeatType1>(b,HttpStatus.OK);
	}

}
