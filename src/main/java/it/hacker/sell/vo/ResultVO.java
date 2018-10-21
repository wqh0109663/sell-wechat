package it.hacker.sell.vo;

import lombok.Data;

/**http请求返回的最外层的对象
 * @author wqh
 * @date 18-10-20
 */
@Data
public class ResultVO<T> {
    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
