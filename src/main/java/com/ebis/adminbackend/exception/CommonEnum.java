package com.ebis.adminbackend.exception;




/**
 * @Title 
 * @Description 
 * @CreateTime 2020年4月13日
 * @author David
 * @version 1.0
 */
public enum CommonEnum implements BaseErrorInfoInterface {
	// 数据操作错误定义
	SUCCESS("200", "SUCCESS"), 
	

	SIGNATURE_NOT_MATCH("401","请求的数字签名不匹配!"),
	NOT_FOUND("404", "未找到该资源!"), 
	SERVER_BUSY("503","服务器正忙，请稍后再试!"),
	NULL_ERROR("501", "NULL POINTER ERROR!"),
	
	INTERNAL_SERVER_ERROR("500", "SERVER ERROR!"),
	PARAMETER_NOT_MATCH("411","ERROR PARAMETER!"),
	EXIST_RELATION("412","EXIST RELATION!")
	;

	/** 错误码 */
	private String resultCode;

	/** 错误描述 */
	private String resultMsg;

	CommonEnum(String resultCode, String resultMsg) {
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
	}

	@Override
	public String getResultCode() {
		return resultCode;
	}

	@Override
	public String getResultMsg() {
		return resultMsg;
	}

}

