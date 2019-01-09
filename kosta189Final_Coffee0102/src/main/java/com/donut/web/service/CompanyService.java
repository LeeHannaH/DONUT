package com.donut.web.service;

import java.util.List;

import com.donut.web.dto.CompanyDTO;
import com.donut.web.dto.MemberDTO;
import com.donut.web.dto.ProjectDTO;

public interface CompanyService {
	
	public int companyInsert(MemberDTO memberDTO) throws Exception;
	
	public List<MemberDTO> companySelectAll() throws Exception;
	
	//������Ʈ�� ���� �˻� - ���񽺿��� ����
	public MemberDTO companySelectByid(String id) throws Exception;
	
	public int companyUpdate(MemberDTO memberDTO) throws Exception;
	
	//��δ�ü ���������� ������Ʈ ��Ȳ
	public List<ProjectDTO> companyProjectSelectAll(String id) throws Exception;
	
	public CompanyDTO selectById(String id) throws Exception;
}