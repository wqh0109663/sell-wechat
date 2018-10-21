package it.hacker.sell.enums;

import lombok.Getter;

/**
 * @author wqh
 * @date 18-10-21
 */
@Getter
public enum PayStatusEnum implements CodeEnum{
    /**
     * 0,表示等待支付
     */
    WAIT(0, "等待支付"),
    /**
     * 1,表示支付成功
     */
    SUCCESS(1, "支付成功"),
    ;


    private Integer code;
    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
