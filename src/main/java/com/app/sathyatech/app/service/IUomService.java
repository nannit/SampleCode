package com.app.sathyatech.app.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sathyatech.app.model.Uom;

public interface IUomService {
public Long save(Uom uom);
public void update(Uom uom);
public void delete(Long uomId);
public Uom getOne(Long uomId);
public boolean isExist(Long uomID);
public List<Uom> getAll();
public Page<Uom> findAll(Pageable pageable);
}
