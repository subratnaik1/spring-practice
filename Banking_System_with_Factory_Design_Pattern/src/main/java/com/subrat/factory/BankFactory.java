package com.subrat.factory;

import com.subrat.sbeans.Bank;

public interface BankFactory {
	Bank createBank(String bankType);
}
