package br.com.evoadeveloper.conection;

import java.sql.Date;
import java.util.List;

public interface IConnection {

	public void add(Object pObject) throws Exception;

	public void update(Object pObject) throws Exception;

	public void delete(Object pObject) throws Exception;

	public Object find(Object pObject, String pParametro) throws Exception;

	public List<Object> list(Object pObject) throws Exception;

	public List<Object> listAllValidPromotions(Date pDate) throws Exception;
}
