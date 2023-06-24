package kr.co.devhanjong.hj_web_client_module.exception;

public class WebClientException extends RuntimeException{

    public WebClientException(String message) {
        super(message);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
