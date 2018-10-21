package it.hacker.sell.exception;

import it.hacker.sell.enums.ResultEnum;

/**
 * @author wqh
 * @date 18-10-21
 */
public class SellException  extends  RuntimeException{
    private Integer code;
    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
