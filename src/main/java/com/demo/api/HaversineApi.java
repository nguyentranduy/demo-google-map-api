package com.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.util.Haversine;
import com.demo.util.MathUtil;

@RestController
@RequestMapping("/api/haversine")
public class HaversineApi {

	@GetMapping()
	public ResponseEntity<Double> doGetDistance(
			@RequestParam("startLat") Double startLat,
			@RequestParam("startLong") Double startLong,
			@RequestParam("endLat") Double endLat,
			@RequestParam("endLong") Double endLong) {
		
		Double result = Haversine.distance(startLat, startLong, endLat, endLong);
		
		return ResponseEntity.ok(MathUtil.rounded3(result));
	}
}
