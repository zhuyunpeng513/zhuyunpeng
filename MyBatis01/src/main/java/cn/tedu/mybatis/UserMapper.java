package cn.tedu.mybatis;

import org.mybatis.spring.mapper.MapperScannerConfigurer;

public interface UserMapper {
	/**
	 * �÷�������insert�µ�����
	 * 
	 * @param user
	 * @return
	 */
	Integer addnew (User user);
	/**
	 * ���ڸ���idɾ������, ���ֽ���ȡ�йص�
	 */
	Integer deleteById(Integer id);
	/**
	 * �÷������ڸ������ݿ�����
	 */
	Integer updateData(String password);
	/**
	 * �÷������ڲ�ѯ
	 */
	User findById(Integer id);
}
