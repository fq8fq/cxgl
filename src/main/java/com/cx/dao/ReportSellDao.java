package com.cx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cx.entity.ReportSell;
import com.cx.mapper.ReportSellMapper;

@Repository
public class ReportSellDao {
    
    @Autowired
    private ReportSellMapper reportSellMapper;
    
    public List<ReportSell> reportSell( ) {
		return reportSellMapper.findReportSell1( );
	}
    
}