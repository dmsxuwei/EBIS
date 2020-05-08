package com.ebis.adminbackend.exception;





import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;

/**
 * 
 * @Title
 * @Description
 * @CreateTime 2020年3月21日
 * @author David
 * @version 1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(value = BizException.class)
	@ResponseBody
	public ResultBody bizExceptionHandler(HttpServletRequest req, BizException e) {
		logger.error("发生业务异常！原因是：{}", e.getErrorMsg());
		return ResultBody.error(e.getErrorCode(), e.getErrorMsg());
	}

	@ExceptionHandler(value = NullPointerException.class)
	@ResponseBody
	public ResultBody exceptionHandler(HttpServletRequest req, NullPointerException e) {
		logger.error("发生空指针异常！原因是:", e);
		return ResultBody.error(CommonEnum.NULL_ERROR);
	}

	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public ResultBody exceptionHandler(HttpServletRequest req, Exception e) {
		logger.error("未知异常！原因是:", e);
		return ResultBody.error(CommonEnum.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = ConstraintViolationException.class)
	@ResponseBody
	public ResultBody exceptionHandler(HttpServletRequest req, ConstraintViolationException e) {
		logger.error("参数校验出错:", e);
		return ResultBody.error(CommonEnum.PARAMETER_NOT_MATCH);
	}

	@ExceptionHandler(value = DataIntegrityViolationException.class)
	@ResponseBody
	public ResultBody exceptionHandler(HttpServletRequest req, DataIntegrityViolationException e) {
		logger.error("EXIST_RELATION:", e);
		return ResultBody.error(CommonEnum.EXIST_RELATION);

	}

}
