package ${package}.web.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import ${package}.web.AbstractTest;
import ${package}.dao.entity.${className};
import ${package}.web.service.${className}Service;

public class ${className}ServiceTest extends AbstractTest{
	@Autowired
	private ${className}Service ${classname}Service;
	
	@Test
	public void testSave(){
		${className} entity = new ${className}();
		${classname}Service.save(entity);
	}
	
	@Test
	public void testGetById(){
		${classname}Service.getById(1L);
	}
	
	@Test
	public void testGetByIds(){
		List<Long> ids = new ArrayList<>();
		ids.add(1L);
		ids.add(2L);
		${classname}Service.getByIds(ids);
	}
	
	@Test
	public void testGet(){
		${className} entity = new ${className}();
		${classname}Service.get(entity);
	}
	
	@Test
	public void testFindList(){
		${className} entity = new ${className}();
		${classname}Service.findList(entity);
	}
	
	@Test
	public void testFindAll(){
		${classname}Service.findAll();
	}
	
	@Test
	public void testGetCount(){
		${className} entity = new ${className}();
		${classname}Service.getCount(entity);
	}
	
	@Test
	public void testUpdateById(){
		${className} entity = new ${className}();
		${classname}Service.updateById(entity);
	}
	
	@Test
	public void testUpdateByIds(){
		${className} entity = new ${className}();
		${classname}Service.updateByIds(entity,new Long[]{2L,3L});
	}
	
	@Test
	public void testDeleteById(){
		${classname}Service.deleteById(4L);
	}
	
	@Test
	public void testDeleteByIds(){
		${classname}Service.deleteByIds(Arrays.asList(2L,3L));
	}
	
	@Test
	public void testDelete(){
		${className} entity = new ${className}();
		${classname}Service.delete(entity);
	}
}
