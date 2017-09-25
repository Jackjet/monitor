/**
 * Copyright 2014-2017 com.lycheeframework.mapping
 * All rights reserved.
 * 
 * @project
 * @author niushuaike
 * @version 1.0
 * @date 2017-09-22
 */
package com.micropower.manager.model.po;


import com.lycheeframework.core.model.IPO;

/**
 * 
 * @author niushuaike
 *
 */
public class Alarmthreshold implements IPO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 *  主键 id
	 */
	private Long id;

	/**
	 * 机柜温度报警阈值最小值
	 */
	private String jgWdMin;

	/**
	 * 机柜温度报警阈值最大值
	 */
	private String jgWdMax;

	/**
	 * 机柜湿度报警阈值最小值
	 */
	private String jgSdMin;

	/**
	 * 机柜湿度报警阈值最大值
	 */
	private String jgSdMax;

	/**
	 * 压缩机1电流预警阈值最小值
	 */
	private String ysjOneYjMin;

	/**
	 * 压缩机1电流预警阈值最大值
	 */
	private String ysjOneYjMax;

	/**
	 * 压缩机2电流预警阈值最小值
	 */
	private String ysjTwoYjMin;

	/**
	 * 压缩机2电流预警阈值最大值
	 */
	private String ysjTwoYjMax;

	/**
	 * 离心风机1电流预警阈值最小值
	 */
	private String lxfjOneYjMin;

	/**
	 * 离心风机1电流预警阈值最大值
	 */
	private String lxfjOneYjMax;

	/**
	 * 离心风机2电流预警阈值最小值
	 */
	private String lxfjTwoYjMin;

	/**
	 * 离心风机2电流预警阈值最大值
	 */
	private String lxfjTwoYjMax;

	/**
	 * 散热风机电流预警阈值最小值
	 */
	private String srfjYjMin;

	/**
	 * 散热风机电流预警阈值最大值
	 */
	private String srfjYjMax;

	/**
	 * 循环风机电流预警阈值最小值
	 */
	private String xhfjYjMin;

	/**
	 * 循环风机电流预警阈值最大值
	 */
	private String xhfjYjMax;

	/**
	 * 环境控制温度预警阈值最小值
	 */
	private String hjkzYjMin;

	/**
	 * 环境控制温度预警阈值最大值
	 */
	private String hjkzYjMax;

	/**
	 * 压缩机1电流告警阈值最小值
	 */
	private String ysjOneGjMin;

	/**
	 * 压缩机1电流告警阈值最大值
	 */
	private String ysjOneGjMax;

	/**
	 * 压缩机2电流告警阈值最小值
	 */
	private String ysjTwoGjMin;

	/**
	 * 压缩机2电流告警阈值最大值
	 */
	private String ysjTwoGjMax;

	/**
	 * 离心风机1电流告警阈值最小值
	 */
	private String lxfjOneGjMin;

	/**
	 * 离心风机1电流告警阈值最大值
	 */
	private String lxfjOneGjMax;

	/**
	 * 离心风机2电流告警阈值最小值
	 */
	private String lxfjTwoGjMin;

	/**
	 * 离心风机2电流告警阈值最大值
	 */
	private String lxfjTwoGjMax;

	/**
	 * 散热风机电流告警阈值最小值
	 */
	private String srfjGjMin;

	/**
	 * 散热风机电流告警阈值最大值
	 */
	private String srfjGjMax;

	/**
	 * 循环风机电流告警阈值最小值
	 */
	private String xhfjGjMin;

	/**
	 * 循环风机电流告警阈值最大值
	 */
	private String xhfjGjMax;

	/**
	 * 环境控制温度告警阈值最小值
	 */
	private String hjkzGjMin;

	/**
	 * 环境控制温度告警阈值最大值
	 */
	private String hjkzGjMax;

	/**
	 * 内温度预警最小值箱
	 */
	private String xnwdYjMin;

	/**
	 * 箱内温度预警最大值
	 */
	private String xnwdYjMax;

	/**
	 * 箱内温度告警最小值
	 */
	private String xnwdGjMin;

	/**
	 * 箱内温度告警最大值
	 */
	private String xnwdGjMax;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getJgWdMin() {
		return jgWdMin;
	}
	
	public void setJgWdMin(String jgWdMin) {
		this.jgWdMin = jgWdMin;
	}
	public String getJgWdMax() {
		return jgWdMax;
	}
	
	public void setJgWdMax(String jgWdMax) {
		this.jgWdMax = jgWdMax;
	}
	public String getJgSdMin() {
		return jgSdMin;
	}
	
	public void setJgSdMin(String jgSdMin) {
		this.jgSdMin = jgSdMin;
	}
	public String getJgSdMax() {
		return jgSdMax;
	}
	
	public void setJgSdMax(String jgSdMax) {
		this.jgSdMax = jgSdMax;
	}
	public String getYsjOneYjMin() {
		return ysjOneYjMin;
	}
	
	public void setYsjOneYjMin(String ysjOneYjMin) {
		this.ysjOneYjMin = ysjOneYjMin;
	}
	public String getYsjOneYjMax() {
		return ysjOneYjMax;
	}
	
	public void setYsjOneYjMax(String ysjOneYjMax) {
		this.ysjOneYjMax = ysjOneYjMax;
	}
	public String getYsjTwoYjMin() {
		return ysjTwoYjMin;
	}
	
	public void setYsjTwoYjMin(String ysjTwoYjMin) {
		this.ysjTwoYjMin = ysjTwoYjMin;
	}
	public String getYsjTwoYjMax() {
		return ysjTwoYjMax;
	}
	
	public void setYsjTwoYjMax(String ysjTwoYjMax) {
		this.ysjTwoYjMax = ysjTwoYjMax;
	}
	public String getLxfjOneYjMin() {
		return lxfjOneYjMin;
	}
	
	public void setLxfjOneYjMin(String lxfjOneYjMin) {
		this.lxfjOneYjMin = lxfjOneYjMin;
	}
	public String getLxfjOneYjMax() {
		return lxfjOneYjMax;
	}
	
	public void setLxfjOneYjMax(String lxfjOneYjMax) {
		this.lxfjOneYjMax = lxfjOneYjMax;
	}
	public String getLxfjTwoYjMin() {
		return lxfjTwoYjMin;
	}
	
	public void setLxfjTwoYjMin(String lxfjTwoYjMin) {
		this.lxfjTwoYjMin = lxfjTwoYjMin;
	}
	public String getLxfjTwoYjMax() {
		return lxfjTwoYjMax;
	}
	
	public void setLxfjTwoYjMax(String lxfjTwoYjMax) {
		this.lxfjTwoYjMax = lxfjTwoYjMax;
	}
	public String getSrfjYjMin() {
		return srfjYjMin;
	}
	
	public void setSrfjYjMin(String srfjYjMin) {
		this.srfjYjMin = srfjYjMin;
	}
	public String getSrfjYjMax() {
		return srfjYjMax;
	}
	
	public void setSrfjYjMax(String srfjYjMax) {
		this.srfjYjMax = srfjYjMax;
	}
	public String getXhfjYjMin() {
		return xhfjYjMin;
	}
	
	public void setXhfjYjMin(String xhfjYjMin) {
		this.xhfjYjMin = xhfjYjMin;
	}
	public String getXhfjYjMax() {
		return xhfjYjMax;
	}
	
	public void setXhfjYjMax(String xhfjYjMax) {
		this.xhfjYjMax = xhfjYjMax;
	}
	public String getHjkzYjMin() {
		return hjkzYjMin;
	}
	
	public void setHjkzYjMin(String hjkzYjMin) {
		this.hjkzYjMin = hjkzYjMin;
	}
	public String getHjkzYjMax() {
		return hjkzYjMax;
	}
	
	public void setHjkzYjMax(String hjkzYjMax) {
		this.hjkzYjMax = hjkzYjMax;
	}
	public String getYsjOneGjMin() {
		return ysjOneGjMin;
	}
	
	public void setYsjOneGjMin(String ysjOneGjMin) {
		this.ysjOneGjMin = ysjOneGjMin;
	}
	public String getYsjOneGjMax() {
		return ysjOneGjMax;
	}
	
	public void setYsjOneGjMax(String ysjOneGjMax) {
		this.ysjOneGjMax = ysjOneGjMax;
	}
	public String getYsjTwoGjMin() {
		return ysjTwoGjMin;
	}
	
	public void setYsjTwoGjMin(String ysjTwoGjMin) {
		this.ysjTwoGjMin = ysjTwoGjMin;
	}
	public String getYsjTwoGjMax() {
		return ysjTwoGjMax;
	}
	
	public void setYsjTwoGjMax(String ysjTwoGjMax) {
		this.ysjTwoGjMax = ysjTwoGjMax;
	}
	public String getLxfjOneGjMin() {
		return lxfjOneGjMin;
	}
	
	public void setLxfjOneGjMin(String lxfjOneGjMin) {
		this.lxfjOneGjMin = lxfjOneGjMin;
	}
	public String getLxfjOneGjMax() {
		return lxfjOneGjMax;
	}
	
	public void setLxfjOneGjMax(String lxfjOneGjMax) {
		this.lxfjOneGjMax = lxfjOneGjMax;
	}
	public String getLxfjTwoGjMin() {
		return lxfjTwoGjMin;
	}
	
	public void setLxfjTwoGjMin(String lxfjTwoGjMin) {
		this.lxfjTwoGjMin = lxfjTwoGjMin;
	}
	public String getLxfjTwoGjMax() {
		return lxfjTwoGjMax;
	}
	
	public void setLxfjTwoGjMax(String lxfjTwoGjMax) {
		this.lxfjTwoGjMax = lxfjTwoGjMax;
	}
	public String getSrfjGjMin() {
		return srfjGjMin;
	}
	
	public void setSrfjGjMin(String srfjGjMin) {
		this.srfjGjMin = srfjGjMin;
	}
	public String getSrfjGjMax() {
		return srfjGjMax;
	}
	
	public void setSrfjGjMax(String srfjGjMax) {
		this.srfjGjMax = srfjGjMax;
	}
	public String getXhfjGjMin() {
		return xhfjGjMin;
	}
	
	public void setXhfjGjMin(String xhfjGjMin) {
		this.xhfjGjMin = xhfjGjMin;
	}
	public String getXhfjGjMax() {
		return xhfjGjMax;
	}
	
	public void setXhfjGjMax(String xhfjGjMax) {
		this.xhfjGjMax = xhfjGjMax;
	}
	public String getHjkzGjMin() {
		return hjkzGjMin;
	}
	
	public void setHjkzGjMin(String hjkzGjMin) {
		this.hjkzGjMin = hjkzGjMin;
	}
	public String getHjkzGjMax() {
		return hjkzGjMax;
	}
	
	public void setHjkzGjMax(String hjkzGjMax) {
		this.hjkzGjMax = hjkzGjMax;
	}
	public String getXnwdYjMin() {
		return xnwdYjMin;
	}
	
	public void setXnwdYjMin(String xnwdYjMin) {
		this.xnwdYjMin = xnwdYjMin;
	}
	public String getXnwdYjMax() {
		return xnwdYjMax;
	}
	
	public void setXnwdYjMax(String xnwdYjMax) {
		this.xnwdYjMax = xnwdYjMax;
	}
	public String getXnwdGjMin() {
		return xnwdGjMin;
	}
	
	public void setXnwdGjMin(String xnwdGjMin) {
		this.xnwdGjMin = xnwdGjMin;
	}
	public String getXnwdGjMax() {
		return xnwdGjMax;
	}
	
	public void setXnwdGjMax(String xnwdGjMax) {
		this.xnwdGjMax = xnwdGjMax;
	}
}