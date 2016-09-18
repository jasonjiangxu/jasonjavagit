package com.jx.utility.web;

/**
 * 
 * @ClassName: AjaxResponse 
 * @Description: TODO(Ajax请求返回J) 
 * @author 姜旭(JasonJiang)
 * @date 2015年7月2日 下午4:41:22 
 * 
 * @param <T>
 */
public class AjaxResponse {
	private Boolean success;
	private String code;
	private String message;
	private Object exception;
	private Object content;

	public AjaxResponse() {
		this(Boolean.TRUE, "操作成功");
	}

	public AjaxResponse(Boolean success) {
		this(success, null);
	}

	public AjaxResponse(String message) {
		this(Boolean.TRUE, "操作成功");
	}

	public AjaxResponse(Boolean success, String message) {
		this.success = success;
		this.message = message;
		if (this.message == null) {
			if (Boolean.FALSE.equals(success)) {
				this.message = "操作失败";
			}
			if (Boolean.TRUE.equals(success))
				this.message = "操作成功";
		}
	}

	public static AjaxResponse fail() {
		return fail(null);
	}

	public static AjaxResponse fail(String message) {
		return new AjaxResponse(Boolean.FALSE, message);
	}

	public static AjaxResponse success() {
		return success(null);
	}

	public static AjaxResponse success(String message) {
		return new AjaxResponse(Boolean.TRUE, message);
	}

	public static AjaxResponse successContent(Object content) {
		AjaxResponse res = success();
		res.setContent(content);
		return res;
	}

	public static AjaxResponse failException(Object exception) {
		AjaxResponse res = fail();
		res.setException(exception);
		return res;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getException() {
		return this.exception;
	}

	public void setException(Object exception) {
		this.exception = exception;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}
	
}
