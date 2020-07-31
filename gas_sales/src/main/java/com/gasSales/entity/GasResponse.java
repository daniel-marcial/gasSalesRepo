package com.gasSales.entity;

public class GasResponse {
	
	private Pagination pagination;
	private Results[] results;
	
	public Pagination getPagination() {
		return pagination;
	}
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
	public Results[] getResults() {
		return results;
	}
	public void setResults(Results[] results) {
		this.results = results;
	}

	
}
