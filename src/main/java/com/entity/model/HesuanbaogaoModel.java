package com.entity.model;

import com.entity.HesuanbaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 核酸报告
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
public class HesuanbaogaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 检测地点
	 */
	
	private String jiancedidian;
		
	/**
	 * 检测时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jianceshijian;
		
	/**
	 * 检测报告
	 */
	
	private String jiancebaogao;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：检测地点
	 */
	 
	public void setJiancedidian(String jiancedidian) {
		this.jiancedidian = jiancedidian;
	}
	
	/**
	 * 获取：检测地点
	 */
	public String getJiancedidian() {
		return jiancedidian;
	}
				
	
	/**
	 * 设置：检测时间
	 */
	 
	public void setJianceshijian(Date jianceshijian) {
		this.jianceshijian = jianceshijian;
	}
	
	/**
	 * 获取：检测时间
	 */
	public Date getJianceshijian() {
		return jianceshijian;
	}
				
	
	/**
	 * 设置：检测报告
	 */
	 
	public void setJiancebaogao(String jiancebaogao) {
		this.jiancebaogao = jiancebaogao;
	}
	
	/**
	 * 获取：检测报告
	 */
	public String getJiancebaogao() {
		return jiancebaogao;
	}
			
}
