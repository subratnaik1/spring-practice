package com.subrat.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.subrat.sbeans.Bank;
import com.subrat.sbeans.HDFC;
import com.subrat.sbeans.SBI;
@Component
public class ConcreteBankFactory implements BankFactory {
	@Autowired
	private SBI sbi;
	@Autowired
	private HDFC hdfc;

	@Override
	public Bank createBank(String bankType) {
		return switch (bankType) {
		case "sbi" -> new SBI();
		case "hdfc" -> new HDFC();
		default -> null;
		};

	}

}
