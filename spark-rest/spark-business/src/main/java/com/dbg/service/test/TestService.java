package com.dbg.service.test;

import com.dbg.dao.test.TestDao;
import com.dbg.model.test.Test;
import com.dbg.service.CrudService;

public class TestService implements CrudService<Test, Integer> {

	private TestDao testDao;

	public TestService() {
		testDao = new TestDao();
	}

	@Override
	public Test create(Test t) {
		return testDao.create(t);
	}

	@Override
	public Test update(Test t) {
		return testDao.update(t);
	}

	@Override
	public Test findById(Integer id) {
		return testDao.findById(id);
	}

	@Override
	public void delete(Test t) {
		testDao.delete(t);
	}

}
