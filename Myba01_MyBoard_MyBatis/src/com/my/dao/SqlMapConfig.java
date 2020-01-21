package com.my.dao;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlMapConfig {

	private SqlSessionFactory sqlSessionFactory;

	public SqlSessionFactory getSqlSessionFactory() {

		// Config.xml ���ϰ� ����
		String resource = "com/my/db/Config.xml";

		try {
			// config.xml������ ������ �о�´�.
			Reader reader = Resources.getResourceAsReader(resource);

			// �о�� ������ ������ SqlSessionFactory ��ü ����
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return sqlSessionFactory;
	}

}
