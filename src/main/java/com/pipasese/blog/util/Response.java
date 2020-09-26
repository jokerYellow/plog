package com.pipasese.blog.util;

public class Response<E> {
    private int status;
    private String message;
    private E result;

    public static Response<Object> success(Object e) {
        return new Response<>(Constants.success, Constants.successMessage, e);
    }

    public static Response<Object> fail(Object e, String message) {
        return new Response<>(Constants.fail, message, e);
    }

    public Response(int status, String message, E result) {
        this.status = status;
        this.message = message;
        this.result = result;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public E getResult() {
        return result;
    }

    public void setResult(E result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
