package com.cx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cx.dao.ReportSellDao;
import com.cx.entity.ReportSell;

@Service

public class ReportSellService {

	@Autowired
    private ReportSellDao reportSellDao;
    
    public List<ReportSell> reportSell( ) {
		return reportSellDao.reportSell( );
    }
}
