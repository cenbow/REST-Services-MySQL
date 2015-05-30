package com.dbg.dao.test;

import com.dbg.dao.HibernateAbstractDao;
import com.dbg.model.test.Test;

public class TestDao extends HibernateAbstractDao<Test, Integer> {

	@Override
	public Class<?> getClazz() {
		return Test.class;
	}

}
