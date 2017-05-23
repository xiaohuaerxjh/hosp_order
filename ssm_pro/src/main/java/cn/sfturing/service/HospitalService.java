package cn.sfturing.service;

import java.util.List;

import cn.sfturing.entity.Hospital;
/**
 * 
 * @author sfturing
 *
 * @date 2017年5月22日
 */
public interface HospitalService {
	//查询推荐医院
	public List<Hospital> findHosByRe();
	
	//通过医院id查找医院
	public Hospital findHosById(int id);
	

}
