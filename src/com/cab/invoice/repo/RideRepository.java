package com.cab.invoice.repo;

import java.util.ArrayList;
import java.util.List;

import com.cab.invoice.model.RideModel;

public class RideRepository {

	List<RideModel> rideDetails;

	public RideRepository() {
		rideDetails = new ArrayList<>();
	}

	public void addRideDetail(double distance, double time, double fare) {
		RideModel model = new RideModel();
		model.setDistance(distance);
		model.setTime(time);
		model.setFare(fare);
		rideDetails.add(model);
	}

	public int getTotalRidesCnt() {
		return rideDetails.size();
	}

	public double getTotalFare() {
		return rideDetails.stream().map((rideDetail) -> rideDetail.getFare())
				.reduce((fare1, fare2) -> fare1 + fare2).get();
	}

	public double getAvgFare() {
		return getTotalFare() / getTotalRidesCnt();
	}
}