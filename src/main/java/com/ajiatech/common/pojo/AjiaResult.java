package com.ajiatech.common.pojo;

public class AjiaResult {
	private static final ObjectMapper MAPPER = new ObjectMapper();
	private Integer status;
	private String msg;
	private Object data;
	
	public static AjiaResult build(Integer status,String msg,Object data)
	{
		return new AjiaResult(status,msg,data);
	}
	
	public static AjiaResult ok(Object data)
	{
		return new AjiaResult(data);
	}
	
	public static AjiaResult ok()
	{
		return new AjiaResult(null);
	}
	
	public AjiaResult()
	{
		
	}
	
	public static AjiaResult build(Integer status,String msg)
	{
		return new AjiaResult(status,msg,null);
	}
	
	public AjiaResult(Integer status,String msg,Object data)
	{
		this.status = status;
		this.msg = msg;
		this.data = data;
	}
	
	public AjiaResult(Object data)
	{
		this.status = 200;
		this.msg = "OK";
		this.data = data;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public static AjiaResult formatToPojo(String jsonData,Class<?> clazz)
	{
		try {
			if(clazz == null)
			{
				return MAPPER.readValue(jsonData,AjiaResult.class);
			}
			JsonNode jsonNode = MAPPER.readTree(jsonData);
			JsonNode data = jsonNode.get("data");
			Object obj = null;
			if(clazz != null)
			{
				if(data.isObject())
				{
					obj = MAPPER.readValue(data.traverse(),clazz);
				}else if(data.isTextual())
				{
					obj = MAPPER.readValue(data.asText(),clazz);
				}
			}
			return build(jsonNode.get("status").intValue(),jsonNode.get("msg").asText(),obj);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

}
