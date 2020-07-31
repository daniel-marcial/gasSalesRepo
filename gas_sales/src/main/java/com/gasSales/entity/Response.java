package com.gasSales.entity;

public class Response {
	
	private Boolean success;

    private String error;

    private String message;
    
	public Response(Boolean success, String error, String message) {
		super();
		this.success = success;
		this.error = error;
		this.message = message;
	}

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }    
    
}
