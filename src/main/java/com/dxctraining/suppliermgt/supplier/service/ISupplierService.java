package com.dxctraining.suppliermgt.supplier.service;

import java.util.List;

import com.dxctraining.suppliermgt.supplier.entities.Supplier;

public interface ISupplierService {

	void validate(Object obj);

	Supplier save(Supplier supplier);

	Supplier findSupplierById(int id);

	  void removeSupplier(int id);
	  
	  List<Supplier> supplierList();

	


}
