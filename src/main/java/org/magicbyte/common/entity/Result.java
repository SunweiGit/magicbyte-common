package org.magicbyte.common.entity;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import lombok.Builder;
import lombok.Data;

/**
 * @Author sunwei
 * @date ：Created in 2020/1/20 -14:58
 * @description：Successful result
 * @modified By：
 * @version: 1.0$
 */
@Data
@Builder
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long timestamp;
    private int status;
    private String message;
    private T data;

    public static Result ok() {
        return Result.builder().status(HttpStatus.OK.value()).message(HttpStatus.OK.name()).build();
    }

    public static Result error() {
        return Result.builder().status(HttpStatus.INTERNAL_SERVER_ERROR.value())
            .message(HttpStatus.INTERNAL_SERVER_ERROR.name()).build();
    }

    public Long getTimestamp() {
        return System.currentTimeMillis();
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public Result setStatus(int status) {
        this.status = status;
        return this;
    }
}
