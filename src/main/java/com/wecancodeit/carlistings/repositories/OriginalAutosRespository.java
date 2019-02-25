package com.wecancodeit.carlistings.repositories;

import java.util.List;

import com.wecancodeit.carlistings.models.Auto;

public class OriginalAutosRespository {

	
	private List<Auto> autos;
	
	public OriginalAutosRespository(List<Auto> autos) {
		this.autos = autos;
	}
	
	public List<Auto> getAutos() {
		return autos;
	}
	
	public void addAuto(Auto auto) {
		autos.add(auto);
	}
	
	@Override
	public String toString() {
		return "AutosRepository [autos=" + autos + "]";
	}
	
	public Auto findAuto(String vin) {
		Auto foundAuto = null;
		for (Auto auto : autos) {
			if (auto.getVin().equals(vin)) {
				foundAuto = auto;
			}
		}
		return foundAuto;
	}
}
