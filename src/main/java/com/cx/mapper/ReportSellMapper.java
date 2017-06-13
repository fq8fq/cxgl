package com.cx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.cx.entity.ReportSell;


public interface ReportSellMapper {

   public List<ReportSell> findReportSell1( );
}
