package com.lichcay.guice.learn.provider;

import com.google.inject.Provider;
import com.lichcay.guice.learn.log.DatabaseTransactionLog;
import com.lichcay.guice.learn.log.TransactionLog;

public class DatabaseLogProvider implements Provider<TransactionLog> {

	public TransactionLog get() {
		DatabaseTransactionLog log = new DatabaseTransactionLog();
		log.setDb("mongoDB");
		return log;
	}

}
