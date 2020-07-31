package com.gasSales.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gasSales.entity.Response;
import com.gasSales.entity.Sales;
import com.gasSales.exception.SalesBadDataException;
import com.gasSales.exception.SalesNotFoundException;
import com.gasSales.service.SalesService;

@RestController
@RequestMapping("/api")
public class SalesRestController {

	@Autowired
	private SalesService salesService;
	

	@GetMapping("/sales")
	public List<Sales> getSales() {

		salesService.requestGasId("587fbd68edfe99480a072f14");

		return salesService.getSales();
		
	}
	
	
	@GetMapping("/sales/{saleId}")
	public Sales getSale(@PathVariable int saleId) {
		
		Sales sale = salesService.getSale(saleId);
		
		if (sale == null) {
			throw new SalesNotFoundException("Sale id not found - " + saleId);
		}
		
		return sale;
	}
	
	@PostMapping("/sales")
	public Response addSale(@RequestBody Sales sale) {

		sale.setIdsales(0);
		String datosCorrectos = salesService.saveSale(sale);
		
		if (!datosCorrectos.equals("OK")) {
			throw new SalesBadDataException("DataError " + datosCorrectos);
		}
		
		return new Response(true, "null", "Informacion correcta");
	}
	
	@PutMapping("/sales")
	public Response updateSale(@RequestBody Sales sale) {
		
		String datosCorrectos = salesService.saveSale(sale);
		
		if (!datosCorrectos.equals("OK")) {
			throw new SalesBadDataException("DataError " + datosCorrectos);
		}
		
		return new Response(true,"null","Informacion correcta");
		
	}
	
	@DeleteMapping("/sales/{saleId}")
	public Response deleteSale(@PathVariable int saleId) {
		
		Sales tempSale = salesService.getSale(saleId);
		
		if (tempSale == null) {
			throw new SalesNotFoundException("Sale id not found - " + saleId);
		}
				
		salesService.deleteSale(saleId);
		
		return new Response(true,"null","ID " + saleId + " deleted succesfuly");
	}
	
}


















